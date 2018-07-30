package com.xuexiang.xupdateservice.controller;

import com.xuexiang.xupdateservice.api.response.ApiResult;
import com.xuexiang.xupdateservice.model.AppVersionInfo;
import com.xuexiang.xupdateservice.service.FileStorageService;
import com.xuexiang.xupdateservice.service.UpdateService;
import com.xuexiang.xupdateservice.utils.DateUtils;
import com.xuexiang.xupdateservice.utils.FileUtils;
import com.xuexiang.xupdateservice.utils.Md5Utils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * 版本更新api
 *
 * @author xuexiang
 * @since 2018/7/23 下午6:21
 */
@RestController
@RequestMapping(value = "/update")
public class UpdateController {

    private static final Logger logger = LoggerFactory.getLogger(UpdateController.class);

    @Autowired
    private UpdateService updateService;

    @Autowired
    private FileStorageService fileService;

    @ResponseBody
    @RequestMapping(value = "/checkVersion", method = RequestMethod.POST)
    public ApiResult doCheckVersion(int versionCode, String appKey) {
        return new ApiResult<AppVersionInfo>().setData(updateService.getLatestAppVersionInfo(versionCode, appKey));
    }

    @ResponseBody
    @RequestMapping(value = "/addVersionInfo", method = RequestMethod.POST)
    public ApiResult addAppVersionInfo(AppVersionInfo appVersionInfo) {
        ApiResult<AppVersionInfo> result = new ApiResult<>();
        if (updateService.getAppVersionInfo(appVersionInfo.getVersionCode(), appVersionInfo.getAppKey()) != null) {
            return result.setCode(5000).setMsg("该版本信息已存在！");
        } else {
            if (updateService.addAppVersionInfo(appVersionInfo)) {
                return result.setData(updateService.getAppVersionInfo(appVersionInfo.getVersionCode(), appVersionInfo.getAppKey()));
            } else {
                return result.setCode(5000).setMsg("版本信息添加失败！");
            }
        }
    }

//    @ResponseBody
//    @RequestMapping(value = "/updateVersionInfo", method = RequestMethod.POST)
//    public ApiResult updateAppVersionInfo(AppVersionInfo appVersionInfo) {
//        return new ApiResult<Boolean>().setData(updateService.updateAppVersionInfo(appVersionInfo));
//    }

    /**
     * 上传apk文件
     *
     * @param file      apk文件
     * @param versionId apk的版本id
     * @return
     */
    @PostMapping("/uploadApk")
    public ApiResult uploadApkFile(MultipartFile file, int versionId) {
        ApiResult<Boolean> result = new ApiResult<>();
        try {
            String fileName = fileService.storeFile(file);
            if (!StringUtils.isEmpty(fileName)) {  //更新apk信息
                AppVersionInfo appVersionInfo = new AppVersionInfo();
                appVersionInfo.setVersionId(versionId);
                File apkFile = fileService.loadFileAsResource(fileName).getFile();
                appVersionInfo.setApkMd5(Md5Utils.getFileMD5(apkFile));
                appVersionInfo.setApkSize(FileUtils.getApkFileSize(apkFile));
                appVersionInfo.setUploadTime(DateUtils.getNowString(DateUtils.yyyyMMddHHmmss.get()));
                appVersionInfo.setDownloadUrl(fileName);

                result.setData(updateService.updateAppVersionInfo(appVersionInfo));
            } else {
                result.setCode(5000)
                        .setMsg("APK上传失败")
                        .setData(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(5001)
                    .setMsg(e.getMessage())
                    .setData(false);
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/addAppVersion", method = RequestMethod.POST)
    public String addAppVersion(MultipartFile file, AppVersionInfo appVersionInfo) {
        if (updateService.getAppVersionInfo(appVersionInfo.getVersionCode(), appVersionInfo.getAppKey()) != null) {
            return "该版本信息已存在！";
        } else {
            boolean result = updateService.addAppVersionInfo(appVersionInfo);
            if (result) {
                AppVersionInfo newVersion = updateService.getAppVersionInfo(appVersionInfo.getVersionCode(), appVersionInfo.getAppKey());
                try {
                    String fileName = fileService.storeFile(file);
                    if (!StringUtils.isEmpty(fileName)) {  //更新apk信息
                        File apkFile = fileService.loadFileAsResource(fileName).getFile();
                        newVersion.setApkMd5(Md5Utils.getFileMD5(apkFile));
                        newVersion.setApkSize(FileUtils.getApkFileSize(apkFile));
                        newVersion.setUploadTime(DateUtils.getNowString(DateUtils.yyyyMMddHHmmss.get()));
                        newVersion.setDownloadUrl(fileName);

                        if (updateService.updateAppVersionInfo(newVersion)) {
                            return "版本信息添加成功！";
                        } else {
                            return "Apk信息添加失败！";
                        }
                    } else {
                        return "APK上传失败！";
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return "APK上传失败:" + e.getMessage();
                }
            } else {
                return "版本信息添加失败！";
            }
        }
    }


    @GetMapping("/apk/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) throws Exception {
        // Load file as Resource
        Resource resource = fileService.loadFileAsResource(fileName);

        // Try to determine file's content type
        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException ex) {
            logger.info("Could not determine file type.");
        }

        // Fallback to the default content type if type could not be determined
        if (contentType == null) {
            contentType = "application/octet-stream";
        }
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
}

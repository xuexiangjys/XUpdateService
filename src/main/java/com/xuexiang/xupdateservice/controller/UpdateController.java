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
import java.util.List;

/**
 * 版本更新api
 *
 * @author xuexiang
 * @since 2018/7/23 下午6:21
 */
@RestController
@RequestMapping(value = "/update")
public class UpdateController {
    private static final int SERVICE_ERROR_CODE = 5000;

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
    @RequestMapping(value = "/versions", method = RequestMethod.GET)
    public ApiResult getAllVersions() {
        return new ApiResult<List<AppVersionInfo>>().setData(updateService.getAppVersionInfo());
    }

    @ResponseBody
    @RequestMapping(value = "/addVersionInfo", method = RequestMethod.POST)
    public ApiResult addAppVersionInfo(AppVersionInfo appVersionInfo) {
        ApiResult<AppVersionInfo> result = new ApiResult<>();
        if (updateService.getAppVersionInfo(appVersionInfo.getVersionCode(), appVersionInfo.getAppKey()) != null) {
            return getOnErrorApiResult(result, "该版本信息已存在！");
        } else {
            if (updateService.addAppVersionInfo(appVersionInfo)) {
                return result.setData(updateService.getAppVersionInfo(appVersionInfo.getVersionCode(), appVersionInfo.getAppKey()));
            } else {
                return getOnErrorApiResult(result, "版本信息添加失败！");
            }
        }
    }

    @ResponseBody
    @RequestMapping(value = "/updateVersionInfo", method = RequestMethod.POST)
    public ApiResult updateAppVersionInfo(AppVersionInfo appVersionInfo) {
        return new ApiResult<Boolean>().setData(updateService.updateAppVersionInfo(appVersionInfo));
    }

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
                updateVersionInfo(fileName, appVersionInfo);

                result.setData(updateService.updateAppVersionInfo(appVersionInfo));
            } else {
                result.setCode(SERVICE_ERROR_CODE)
                        .setMsg("APK上传失败")
                        .setData(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(SERVICE_ERROR_CODE)
                    .setMsg(e.getMessage())
                    .setData(false);
        }
        return result;
    }

    private void updateVersionInfo(String fileName, AppVersionInfo appVersionInfo) throws Exception {
        File apkFile = fileService.loadFileAsResource(fileName).getFile();
        appVersionInfo.setApkMd5(Md5Utils.getFileMD5(apkFile));
        appVersionInfo.setApkSize(FileUtils.getApkFileSize(apkFile));
        appVersionInfo.setUploadTime(DateUtils.getNowString(DateUtils.yyyyMMddHHmmss.get()));
        appVersionInfo.setDownloadUrl(fileName);
    }

    @ResponseBody
    @RequestMapping(value = "/addAppVersion", method = RequestMethod.POST)
    public ApiResult addAppVersion(MultipartFile file, AppVersionInfo appVersionInfo) {
        ApiResult<String> apiResult = new ApiResult<>();
        if (updateService.getAppVersionInfo(appVersionInfo.getVersionCode(), appVersionInfo.getAppKey()) != null) {
            return getOnErrorApiResult(apiResult, "该版本信息已存在！");
        } else {
            boolean result = updateService.addAppVersionInfo(appVersionInfo);
            if (result) {
                AppVersionInfo newVersion = updateService.getAppVersionInfo(appVersionInfo.getVersionCode(), appVersionInfo.getAppKey());
                try {
                    String fileName = fileService.storeFile(file);
                    if (!StringUtils.isEmpty(fileName)) {  //更新apk信息
                        updateVersionInfo(fileName, newVersion);

                        if (updateService.updateAppVersionInfo(newVersion)) {
                            return apiResult.setData("版本信息添加成功!" );
                        } else {
                            return getOnErrorApiResult(apiResult, "Apk信息添加失败!");
                        }
                    } else {
                        return getOnErrorApiResult(apiResult, "APK上传失败:");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return getOnErrorApiResult(apiResult, "APK上传失败:" + e.getMessage());
                }
            } else {
                return getOnErrorApiResult(apiResult, "版本信息添加失败！");
            }
        }
    }

    private <T> ApiResult<T> getOnErrorApiResult(ApiResult<T> apiResult, String errorMsg) {
        return apiResult.setCode(SERVICE_ERROR_CODE).setMsg(errorMsg);
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

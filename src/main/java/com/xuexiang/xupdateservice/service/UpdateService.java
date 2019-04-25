package com.xuexiang.xupdateservice.service;

import com.xuexiang.xupdateservice.api.response.PageData;
import com.xuexiang.xupdateservice.model.AppVersionInfo;

import java.util.List;

/**
 * @author xuexiang
 * @since 2018/7/26 上午11:04
 */
public interface UpdateService {

    /**
     * 无版本更新
     */
    int NO_NEW_VERSION = 0; // 0:无版本更新
    /**
     * 有版本更新，不需要强制升级
     */
    int HAVE_NEW_VERSION = 1; // 1:有版本更新，不需要强制升级
    /**
     * 有版本更新，需要强制升级
     */
    int HAVE_NEW_VERSION_FORCED_UPLOAD = 2; // 2:有版本更新，需要强制升级

    /**
     * 获取最新的apk版本信息
     *
     * @param versionCode
     * @param appKey
     * @return
     */
    AppVersionInfo getLatestAppVersionInfo(int versionCode, String appKey);

    /**
     * 根据appKey获取唯一apk的所有版本信息
     *
     * @param appKey
     * @return
     */
    List<AppVersionInfo> getAllAppVersionInfo(String appKey);

    /**
     * 获取所有应用的版本信息
     *
     * @return
     */
    List<AppVersionInfo> getAllAppVersionInfo();

    /**
     * 分页查询所有应用的版本信息
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageData<AppVersionInfo> getAllAppVersionInfo(int pageNum, int pageSize);

    /**
     * 根据appKey和versionCode获取唯一的版本信息
     *
     * @param appKey
     * @return
     */
    AppVersionInfo getAppVersionInfo(int versionCode, String appKey);

    /**
     * 添加app版本信息
     *
     * @param appVersionInfo
     * @return
     */
    boolean addAppVersionInfo(AppVersionInfo appVersionInfo);

    /**
     * 更新app版本信息
     *
     * @param appVersionInfo
     * @return
     */
    boolean updateAppVersionInfo(AppVersionInfo appVersionInfo);


    /**
     * 删除版本信息
     *
     * @param versionId
     * @return
     */
    boolean deleteAppVersionInfo(int versionId);


}

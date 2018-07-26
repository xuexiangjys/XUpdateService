package com.xuexiang.xupdateservice.service;

import com.xuexiang.xupdateservice.model.AppVersionInfo;

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

}

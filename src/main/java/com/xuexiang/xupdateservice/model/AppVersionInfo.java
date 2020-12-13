package com.xuexiang.xupdateservice.model;

import javax.persistence.*;

@Table(name = "app_version_info")
public class AppVersionInfo {
    @Id
    @Column(name = "version_id")
    private Integer versionId;

    @Column(name = "update_status")
    private Integer updateStatus;

    @Column(name = "version_code")
    private Integer versionCode;

    @Column(name = "version_name")
    private String versionName;

    @Column(name = "upload_time")
    private String uploadTime;

    @Column(name = "apk_size")
    private Integer apkSize;

    @Column(name = "app_key")
    private String appKey;

    @Column(name = "modify_content")
    private String modifyContent;

    @Column(name = "download_url")
    private String downloadUrl;

    @Column(name = "apk_md5")
    private String apkMd5;

    /**
     * @return version_id
     */
    public Integer getVersionId() {
        return versionId;
    }

    /**
     * @param versionId
     */
    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    /**
     * @return update_status
     */
    public Integer getUpdateStatus() {
        return updateStatus;
    }

    /**
     * @param updateStatus
     */
    public void setUpdateStatus(Integer updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * @return version_code
     */
    public Integer getVersionCode() {
        return versionCode;
    }

    /**
     * @param versionCode
     */
    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

    /**
     * @return version_name
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * @param versionName
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * @return upload_time
     */
    public String getUploadTime() {
        return uploadTime;
    }

    /**
     * @param uploadTime
     */
    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * @return apk_size
     */
    public Integer getApkSize() {
        return apkSize;
    }

    /**
     * @param apkSize
     */
    public void setApkSize(Integer apkSize) {
        this.apkSize = apkSize;
    }

    /**
     * @return app_key
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * @param appKey
     */
    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    /**
     * @return modify_content
     */
    public String getModifyContent() {
        return modifyContent;
    }

    /**
     * @param modifyContent
     */
    public void setModifyContent(String modifyContent) {
        this.modifyContent = modifyContent;
    }

    /**
     * @return download_url
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * @param downloadUrl
     */
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * @return apk_md5
     */
    public String getApkMd5() {
        return apkMd5;
    }

    /**
     * @param apkMd5
     */
    public void setApkMd5(String apkMd5) {
        this.apkMd5 = apkMd5;
    }
}
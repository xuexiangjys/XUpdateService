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

    public Integer getVersionId() {
        return versionId;
    }

    public AppVersionInfo setVersionId(Integer versionId) {
        this.versionId = versionId;
        return this;
    }

    public Integer getUpdateStatus() {
        return updateStatus;
    }

    public AppVersionInfo setUpdateStatus(Integer updateStatus) {
        this.updateStatus = updateStatus;
        return this;
    }

    public Integer getVersionCode() {
        return versionCode;
    }

    public AppVersionInfo setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }

    public String getVersionName() {
        return versionName;
    }

    public AppVersionInfo setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public AppVersionInfo setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
        return this;
    }

    public Integer getApkSize() {
        return apkSize;
    }

    public AppVersionInfo setApkSize(Integer apkSize) {
        this.apkSize = apkSize;
        return this;
    }

    public String getAppKey() {
        return appKey;
    }

    public AppVersionInfo setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    public String getModifyContent() {
        return modifyContent;
    }

    public AppVersionInfo setModifyContent(String modifyContent) {
        this.modifyContent = modifyContent;
        return this;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public AppVersionInfo setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    public String getApkMd5() {
        return apkMd5;
    }

    public AppVersionInfo setApkMd5(String apkMd5) {
        this.apkMd5 = apkMd5;
        return this;
    }
}
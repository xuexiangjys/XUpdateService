package com.xuexiang.xupdateservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xuexiang
 * @since 2018/7/18 下午2:15
 */
@Component
@ConfigurationProperties(prefix = "upload")
public class FileStorageProperties {

    private String fileDirectory;
    private boolean keepName;

    public boolean isKeepName() {
        return keepName;
    }

    public void setKeepName(boolean keepName) {
        this.keepName = keepName;
    }

    public String getFileDirectory() {
        return fileDirectory;
    }

    public void setFileDirectory(String fileDirectory) {
        this.fileDirectory = fileDirectory;
    }
}

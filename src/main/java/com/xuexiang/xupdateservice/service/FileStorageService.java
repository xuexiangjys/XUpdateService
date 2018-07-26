package com.xuexiang.xupdateservice.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件存储服务
 *
 * @author xuexiang
 * @since 2018/7/18 下午3:36
 */
public interface FileStorageService {


    /**
     * 存储文件
     *
     * @param file
     * @return 存储文件的文件名
     */
    String storeFile(MultipartFile file) throws Exception;


    /**
     * 读取文件
     * @param fileName
     * @return
     */
    Resource loadFileAsResource(String fileName) throws Exception;
}

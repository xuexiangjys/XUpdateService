package com.xuexiang.xupdateservice.utils;

import org.springframework.util.StringUtils;

import java.io.File;

/**
 * @author xuexiang
 * @since 2018/7/18 下午4:30
 */
public final class FileUtils {

    private FileUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 生成随机的文件名
     *
     * @return
     */
    public static String randomFileName(String filePath) {
        String fileExtension = getFileExtension(filePath);
        return RandomGUID.getRandomGUID() + "." + fileExtension;
    }


    /**
     * 获取全路径中的文件拓展名
     *
     * @param filePath 文件路径
     * @return 文件拓展名
     */
    public static String getFileExtension(final String filePath) {
        if (StringUtils.isEmpty(filePath)) return filePath;
        int lastPoi = filePath.lastIndexOf('.');
        int lastSep = filePath.lastIndexOf(File.separator);
        if (lastPoi == -1 || lastSep >= lastPoi) return "";
        return filePath.substring(lastPoi + 1);
    }

    /**
     * 获取apk的大小【单位：KB】
     *
     * @param file 文件
     * @return 文件长度
     */
    public static int getApkFileSize(final File file) {
        long fileLength = getFileLength(file);
        return (int) (fileLength / 1024);
    }

    /**
     * 获取文件长度
     *
     * @param file 文件
     * @return 文件长度
     */
    private static long getFileLength(final File file) {
        if (!isFile(file)) return -1;
        return file.length();
    }

    /**
     * 判断是否是文件
     *
     * @param file 文件
     * @return {@code true}: 是<br>{@code false}: 否
     */
    private static boolean isFile(final File file) {
        return file != null && file.exists() && file.isFile();
    }
}

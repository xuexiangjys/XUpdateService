package com.xuexiang.xupdateservice.exception;

/**
 * @author xuexiang
 * @since 2018/8/6 下午3:11
 */
public class ApiException extends Exception {

    /**
     * 错误的code码
     */
    private int mCode;

    public ApiException(String message, int code) {
        super(message);
        mCode = code;
    }

    public ApiException(Throwable e, int code) {
        super(e);
        mCode = code;
    }

    public int getCode() {
        return mCode;
    }

    /**
     * 约定异常
     */
    public static class ERROR {
        /**
         * Token失效，需要重新获取token的code码
         */
        public static final int TOKEN_INVALID = 100;
        /**
         * 缺少Token
         */
        public static final int TOKEN_MISSING = TOKEN_INVALID + 1;
        /**
         * 认证失败
         */
        public static final int AUTH_ERROR = TOKEN_MISSING + 1;


        /**
         * 未知错误
         */
        public static final int UNKNOWN = 5000;

        /**
         * 一般性业务错误
         */
        public static final int COMMON_BUSINESS_ERROR = UNKNOWN + 1;

        /**
         * 文件存储失败
         */
        public static final int FILE_STORE_ERROR = COMMON_BUSINESS_ERROR + 1;

        /**
         * 请求超出限制
         */
        public static final int REQUEST_BEYOND_LIMIT = FILE_STORE_ERROR + 1;
    }
}

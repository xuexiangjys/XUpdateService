package com.xuexiang.xupdateservice.exception;

import com.xuexiang.xupdateservice.api.response.ApiResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xuexiang
 * @since 2018/8/6 下午3:07
 */
@RestControllerAdvice
public class ApiExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(ApiExceptionHandler.class);

    /**
     * 拦截捕捉自定义异常
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ApiResult apiErrorHandler(HttpServletRequest req, Exception ex) {
        if (ex instanceof ApiException) {
            logger.error("请求:{}, 发生业务异常:{}", req.getRequestURL(), ex.getMessage(), ex);
            return ApiResult.error((ApiException) ex);
        } else {
            logger.error("请求:{}, 发生系统异常:{}", req.getRequestURL(), ex.getMessage(), ex);
            return ApiResult.error(-1, ex.getMessage()); //系统异常错误
        }
    }

}

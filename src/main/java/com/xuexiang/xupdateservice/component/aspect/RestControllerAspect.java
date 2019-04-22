package com.xuexiang.xupdateservice.component.aspect;

import com.xuexiang.xupdateservice.utils.AspectJUtils;
import com.xuexiang.xupdateservice.utils.IpUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * 请求api日志记录（对{@link RestController}进行拦截）
 *
 * @author xuexiang
 * @since 2018/7/17 上午10:42
 */
@Aspect
@Component
public class RestControllerAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 环绕通知
     * @param joinPoint 连接点
     * @return 切入点返回值
     * @throws Throwable 异常信息
     */
    @Around("@within(org.springframework.web.bind.annotation.RestController) || @annotation(org.springframework.web.bind.annotation.RestController)")
    public Object apiLog(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();

        boolean logFlag = this.needToLog(method);
        if (!logFlag) {
            return joinPoint.proceed();
        }
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        String userAgent = request.getHeader("user-agent");
        String ip = IpUtils.getRealIp(request);
        String methodName = AspectJUtils.getMethodName(joinPoint);
        String params = AspectJUtils.getMethodParams(joinPoint);

        logger.info("\n\r" +
                "---------->|开始请求方法:{} \n\r" +
                "           |请求参数:{} \n\r" +
                "           |IP:{} \n\r" +
                "           |userAgent:{}", methodName, params, ip, userAgent);
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();
        String deleteSensitiveContent =  AspectJUtils.deleteSensitiveContent(result);
        logger.info("\n\r" +
                "<----------|结束请求方法:{}\n\r" +
                "           |返回结果{} \n\r" +
                "           |耗时:{}毫秒 ", methodName, deleteSensitiveContent, end - start);
        return result;
    }

    /**
     * 判断是否需要记录日志
     */
    private boolean needToLog(Method method) {
        return method.getAnnotation(GetMapping.class) == null; //不打印Get请求
    }

}

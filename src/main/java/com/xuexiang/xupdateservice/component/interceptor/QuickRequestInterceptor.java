package com.xuexiang.xupdateservice.component.interceptor;

import com.xuexiang.xupdateservice.component.annotation.LoginRequired;
import com.xuexiang.xupdateservice.component.annotation.QuickRequest;
import com.xuexiang.xupdateservice.exception.ApiException;
import com.xuexiang.xupdateservice.utils.IpUtils;
import com.xuexiang.xupdateservice.utils.QuickRequestUtils;
import com.xuexiang.xupdateservice.utils.TokenUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

import static com.xuexiang.xupdateservice.exception.ApiException.ERROR.REQUEST_BEYOND_LIMIT;

/**
 * 快速请求拦截器【根据请求传入的时间戳来判断】
 *
 * @author xuexiang
 * @since 2018/8/7 下午3:36
 */
public class QuickRequestInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse httpServletResponse, Object handler) throws Exception {
        System.out.println("----------【快速请求拦截器】-----------");

        // 如果不是映射到方法直接通过
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        // 判断接口是否需要登录
        QuickRequest quickRequest = method.getAnnotation(QuickRequest.class);

        if (quickRequest == null) { //没有 @QuickRequest 注解，无需要校验
            return true;
        }

        // 获取客户端请求携带的时间戳
        String timeStamp = request.getHeader("X-TimeStamp");

        if (StringUtils.isEmpty(timeStamp)) {
            timeStamp = request.getParameter("timeStamp");
            if (StringUtils.isEmpty(timeStamp)) { //如果没有携带时间戳，也无需校验
                return true;
            }
        }

        String identity = IpUtils.getRealIp(request); //身份默认使用请求的ip地址

        //如果注释有需要登录验证，就使用token作为身份
        LoginRequired loginRequired = method.getAnnotation(LoginRequired.class);
        if (loginRequired != null) { //没有 @LoginRequired 注解，无需认证
            String accessToken = TokenUtils.parseToken(request);
            if (!StringUtils.isEmpty(accessToken)) {
                identity = accessToken;
            }
        }

        String url = request.getRequestURL().toString();
        String methodName = method.getName();
        String key = "QuickRequest_".concat(url).concat(methodName).concat(identity);

        if (QuickRequestUtils.isQuickRequest(key, quickRequest, timeStamp)) {
            throw new ApiException("请求过于频繁,请稍后再试！", REQUEST_BEYOND_LIMIT);
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}

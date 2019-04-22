package com.xuexiang.xupdateservice.component.token;

import com.xuexiang.xupdateservice.component.annotation.LoginRequired;
import com.xuexiang.xupdateservice.config.Constants;
import com.xuexiang.xupdateservice.exception.ApiException;
import com.xuexiang.xupdateservice.model.Account;
import com.xuexiang.xupdateservice.service.AccountService;
import com.xuexiang.xupdateservice.utils.TokenUtils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

import static com.xuexiang.xupdateservice.exception.ApiException.ERROR.*;

/**
 * 用户认证拦截器
 *
 * @author xuexiang
 * @since 2018/8/6 下午4:40
 */
public class AuthenticationInterceptor implements HandlerInterceptor {

    @Autowired
    private AccountService accountService;

    // 在业务处理器处理请求之前被调用
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("----------【用户认证拦截器】-----------");

        // 如果不是映射到方法直接通过
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        // 判断接口是否需要登录
        LoginRequired loginRequired = method.getAnnotation(LoginRequired.class);

        if (loginRequired == null) { //没有 @LoginRequired 注解，无需认证
            return true;
        }

        // 判断是否存在令牌信息，如果存在，则允许登录
        String accessToken = TokenUtils.parseToken(request);

        if (StringUtils.isEmpty(accessToken)) {
            throw new ApiException("未携带token，请先进行登录", TOKEN_MISSING);
        }

        // 从Redis 中查看 token 是否过期
        Claims claims;
        try {
            claims = TokenUtils.parseJWT(accessToken);
        } catch (ExpiredJwtException e) {
            throw new ApiException("token失效，请重新登录", TOKEN_INVALID);
        } catch (SignatureException se) {
            throw new ApiException("token令牌错误", AUTH_ERROR);
        }

        String loginName = claims.getId();
        Account account = accountService.checkAccount(loginName);

        if (account == null) {
            throw new ApiException("用户不存在，请重新登录", TOKEN_INVALID);
        }
        // 当前登录用户@CurrentAccount
        request.setAttribute(Constants.CURRENT_ACCOUNT, account);
        return true;
    }

    // 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    // 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}

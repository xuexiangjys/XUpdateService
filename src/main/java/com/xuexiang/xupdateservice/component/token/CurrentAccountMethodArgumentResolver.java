package com.xuexiang.xupdateservice.component.token;

import com.xuexiang.xupdateservice.component.annotation.CurrentAccount;
import com.xuexiang.xupdateservice.config.Constants;
import com.xuexiang.xupdateservice.model.Account;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.multipart.support.MissingServletRequestPartException;

/**
 * 已登录账户自定义参数解析器
 *
 * @author xuexiang
 * @since 2018/8/6 下午5:09
 */
public class CurrentAccountMethodArgumentResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterType().isAssignableFrom(Account.class)//判断是否能转成Account类型
                && parameter.hasParameterAnnotation(CurrentAccount.class);//是否有CurrentAccount注解
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        Account account = (Account) nativeWebRequest.getAttribute(Constants.CURRENT_ACCOUNT, RequestAttributes.SCOPE_REQUEST);
        if (account != null) {
            return account;
        }
        throw new MissingServletRequestPartException(Constants.CURRENT_ACCOUNT);
    }
}

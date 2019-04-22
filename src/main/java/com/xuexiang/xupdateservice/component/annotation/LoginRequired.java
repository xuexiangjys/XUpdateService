package com.xuexiang.xupdateservice.component.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 在需要登录验证的Controller的方法上使用此注解
 *
 * @author xuexiang
 * @since 2018/8/6 下午4:37
 */
@Target({ElementType.METHOD})// 可用在方法名上
@Retention(RetentionPolicy.RUNTIME)// 运行时有效
public @interface LoginRequired {
}

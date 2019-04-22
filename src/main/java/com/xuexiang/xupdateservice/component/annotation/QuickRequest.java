package com.xuexiang.xupdateservice.component.annotation;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xuexiang
 * @since 2018/8/7 下午3:39
 */
@Target({ElementType.METHOD})// 可用在方法名上
@Retention(RetentionPolicy.RUNTIME)// 运行时有效
//最高优先级
@Order(Ordered.HIGHEST_PRECEDENCE)
public @interface QuickRequest {
    /**
     * 默认请求间隔为5s
     */
    int DEFAULT_INTERVAL = 5 * 1000;
    /**
     *
     * 请求之间的间隔，默认值5s
     */
    long interval() default DEFAULT_INTERVAL;
}

package com.xuexiang.xupdateservice.config;

import com.xuexiang.xupdateservice.component.interceptor.QuickRequestInterceptor;
import com.xuexiang.xupdateservice.component.token.AuthenticationInterceptor;
import com.xuexiang.xupdateservice.component.token.CurrentAccountMethodArgumentResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

/**
 * 配置URLInterceptor拦截器，以及拦截路径
 *
 * @author xuexiang
 * @since 2018/8/6 下午5:50
 */
@EnableWebMvc
@Configuration
public class WebAppConfigurer extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authenticationInterceptor());
        registry.addInterceptor(quickRequestInterceptor());
        super.addInterceptors(registry);
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(currentAccountMethodArgumentResolver());
        super.addArgumentResolvers(argumentResolvers);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowCredentials(true)
                .allowedHeaders("Origin", "X-Requested-With", "Content-Type", "Accept", "X-Token", "X-TimeStamp")
                .allowedMethods("GET", "POST", "PATCH", "DELETE", "PUT")
                .maxAge(3600);
        super.addCorsMappings(registry);
    }

    @Bean
    public CurrentAccountMethodArgumentResolver currentAccountMethodArgumentResolver() {
        return new CurrentAccountMethodArgumentResolver();
    }

    @Bean
    public AuthenticationInterceptor authenticationInterceptor() {
        return new AuthenticationInterceptor();
    }

    @Bean
    public QuickRequestInterceptor quickRequestInterceptor() {
        return new QuickRequestInterceptor();
    }

    /**
     * 资源列表
     */
    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
            "classpath:/META-INF/resources/", "classpath:/resources/",
            "classpath:/static/", "classpath:/public/"};

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (!registry.hasMappingForPattern("/webjars/**")) {
            registry.addResourceHandler("/webjars/**").addResourceLocations(
                    "classpath:/META-INF/resources/webjars/");
        }
        if (!registry.hasMappingForPattern("/**")) {
            registry.addResourceHandler("/**").addResourceLocations(
                    CLASSPATH_RESOURCE_LOCATIONS);
        }

    }
}

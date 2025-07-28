package com.zufang.lease.web.app.custom.config;

import com.zufang.lease.web.app.custom.interceptor.AuthenticationInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Title: WebMvcConfiguration
 * @Author 殇枫
 * @Package com.zufang.lease.web.app.custom.config
 * @Date 2025/7/28
 * @description:
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Autowired
    private AuthenticationInterceptor authenticationInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       // registry.addInterceptor(this.authenticationInterceptor).addPathPatterns("/app/**").excludePathPatterns("/app/login/**");
    }
}
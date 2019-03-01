package com.lzy.datebase.configuration;

import com.lzy.datebase.LoggerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @ Author     ：lzy
 * @ Date       ：Created in 13:59 2019/2/25
 * @ Description：
 */
@Configuration
public class LoggerConfguration extends WebMvcConfigurationSupport {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoggerInterceptor()).addPathPatterns("/**");
    }
}

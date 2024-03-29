package com.chinadep.dexoauth2clientback.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
    // 配置RequestContextListener用于启用session scope的Bean
    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }

    // 配置index路径的首页Controller
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/")
//                .setViewName("forward:/index");
//        registry.addViewController("/index");
    }

}

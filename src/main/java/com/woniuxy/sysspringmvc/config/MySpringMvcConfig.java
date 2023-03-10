package com.woniuxy.sysspringmvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ：barry
 * @date ：Created in 2023/3/6 15:50
 * @description：
 * @modified By：
 * @version: $
 * @
 */
@Configuration
public class MySpringMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        //每次调用registry.addMapping可以添加一个跨域配置，需要多个配置可以多次调用registry.addMapping
        registry.addMapping("/**")
                .allowedOrigins("*") //放行哪些原始域
                .allowedMethods("PUT", "DELETE", "POST", "GET") //放行哪些请求方式
                .allowedHeaders("*") //放行哪些原始请求头部信息
                //.exposedHeaders("header1", "header2") //暴露哪些头部信息
                .allowCredentials(false) //是否发送 Cookie
                .maxAge(3600);

        // Add more mappings...
    }
}

package com.zhang.config;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*@Configuration
@ComponentScan*/
public class DefaultPageConfig implements WebMvcConfigurer {

    /*@Override
    public void addViewControllers(ViewControllerRegistry registry) {

        //默认地址（可以是页面或后台请求接口）
        registry.addViewController("/").setViewName("forward:pages/hello.html");
        //设置过滤优先级最高
        *//*registry.setOrder(Ordered.HIGHEST_PRECEDENCE);*//*
    }*/

}

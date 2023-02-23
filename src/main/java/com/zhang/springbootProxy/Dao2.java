package com.zhang.springbootProxy;

import com.zhang.MyAnnotation.MyTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proxy2")
@PropertySource(value = "classpath:application.yml")
public class Dao2 {

    @GetMapping("demo1")
    @MyTest(name = "张三222222")
    public String demo1(String name) {
        //System.out.println("1");  公共代码，进行抽取，使用aop进行代理
        System.out.println("2");
        return name;
    }

}
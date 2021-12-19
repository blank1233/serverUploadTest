package com.zhang.springbootProxy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//目标对象
@RestController
@RequestMapping("/proxy")
@PropertySource(value = "classpath:application.yml")
public class Dao{

    @Value("${server.port}")
    private String PROJECT_PORT;

    @GetMapping("demo1")
    public String demo1(String name){
        //System.out.println("1");  公共代码，进行抽取，使用aop进行代理
        System.out.println("2");
        System.out.println(PROJECT_PORT);
        return name;
    }

    @GetMapping("demo2")
    public void demo2(){
        //System.out.println("1");
        System.out.println("2");
    }

    public String getPROJECT_PORT(){

        return PROJECT_PORT;
    }

}

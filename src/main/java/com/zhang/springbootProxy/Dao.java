package com.zhang.springbootProxy;

import com.zhang.MyAnnotation.MyTest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//目标对象
@RestController
@RequestMapping("/proxy")
@PropertySource(value = "classpath:application.yml")
public class Dao{

    @Value("${server.port}")
    private String PROJECT_PORT;

    @GetMapping("/demo1")
    @MyTest(name = "张三")
    public Map demo1(String name){
        //System.out.println("1");  公共代码，进行抽取，使用aop进行代理
        System.out.println("2");
        System.out.println(name);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name",name);
        System.out.println("demo方法执行了");
        return hashMap;
    }

    @GetMapping("demo2")
    @MyTest(name = "李四")
    public void demo2(){
        //System.out.println("1");
        System.out.println("2");
    }

    public String getPROJECT_PORT(){

        return PROJECT_PORT;
    }



}

package com.zhang;

import com.zhang.springbootProxy.Dao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
@PropertySource(value = "classpath:application.yml")
public class AutoApplication {

    @Value("${server.port}")
    private String PROJECT_PORT;

    static {

    }

    public static void main(String[] args) {
        SpringApplication.run(AutoApplication.class,args);

        System.out.println("=========启动成功 " + LocalDate.now() + "-" + LocalTime.now().withNano(0) + "=======");
        System.out.println("点击访问：Localhost:" + new Dao().getPROJECT_PORT());

        //自动操作
        //new TestDemo().findImage();


    }



}

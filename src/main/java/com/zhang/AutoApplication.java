package com.zhang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Properties;

/*@MapperScan("com.zhang.mapper")*/
@SpringBootApplication
//@EnableScheduling
@PropertySource(value = "classpath:application-dev.yml")
@MapperScan("com.zhang.mapper")
public class AutoApplication implements WebMvcConfigurer {

    @Value("${server.port}")
    private static String PROJECT_PORT;

    private static Properties properties;

    static {
        try {
            properties = new Properties();
            properties.load(AutoApplication.class.getClassLoader().getResourceAsStream("application-dev.yml"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        //默认地址（可以是页面或后台请求接口）
        registry.addViewController("/").setViewName("forward:pages/hello.html");
        //设置过滤优先级最高
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }

    public static void main(String[] args) {
        SpringApplication.run(AutoApplication.class,args);

        System.out.println("=========启动成功 " + LocalDate.now() + "-" + LocalTime.now().withNano(0) + "=======");
        System.out.println("本地访问：Localhost:" + properties.getProperty("port"));


        //自动操作
        //new TestDemo().findImage();

        //注解bean？？？
        //AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();

    }




}

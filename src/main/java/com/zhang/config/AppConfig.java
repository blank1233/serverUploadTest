package com.zhang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/*@Configuration*/
@Component
@ComponentScan("com.zhang.beanTest")
public class AppConfig {

    /*@Bean
    public Teacher teacher(){
        Teacher teacher = new Teacher();
        *//*teacher.setAge(1);
        teacher.setTeacherId(1);
        teacher.setTeacherName("testTeacher");*//*
        return teacher;
    }*/
}


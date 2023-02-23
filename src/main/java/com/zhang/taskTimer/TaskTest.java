package com.zhang.taskTimer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskTest {

    @Scheduled(initialDelay = 2000,fixedDelay = 3000)//启动2秒后开始执行 每隔3秒执行一次
    public void taskTest(){
        System.out.println("=============定时任务执行===========");
    }

}

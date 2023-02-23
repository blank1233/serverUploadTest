package com.zhang.controller;

import com.zhang.pojo.Teacher;
import com.zhang.service.ProxyDemoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proxy")
public class ProxyDemoController{

    @Autowired
    private ProxyDemoService proxyDemoService;

    private static Logger logger = LogManager.getLogger(ProxyDemoController.class);

  //  @Autowired
    private Teacher teacher;

    @GetMapping("/add/{id}")
    public void add(@PathVariable(value = "id")Integer id){

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+"线程");
        }).start();
        // ⬆ == ⬇
        /*//runnable
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable" + Thread.currentThread().getName() + "线程 添加id为"+ id + "的商品成功");
            }
        }).start();*/

        logger.info("商品添加成功");


    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") Integer id){
        System.out.println("删除" + id + "成功");
    }

    @RequestMapping("/beanTest")
    public void getBean(){
//        System.out.println(teacher.getAge());
    }
}

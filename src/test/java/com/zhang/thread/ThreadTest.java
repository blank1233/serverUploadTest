package com.zhang.thread;

import org.junit.jupiter.api.Test;

public class ThreadTest {


    @Test
    public void test(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
                System.out.println(Thread.currentThread().getName() + "----");
            }
        }).start();


    }
}
class Test2 extends Thread{
    public Test2(){
        super("1");
    }

    @Override
    public void run() {

        System.out.println("1");
        System.out.println(getName());
    }

}



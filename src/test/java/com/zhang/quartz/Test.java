package com.zhang.quartz;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test {


    public static void main(String[] args) {
        /*//启动定时任务
        Timer timer = new Timer();
        //添加定时任务
        FooTimerTask fooTimerTask = new FooTimerTask();
        timer.schedule(fooTimerTask,new Date(),2000);

        //thread启动多线程 因为threadClass类继承了thread类所以可以直接调用start()方法启动线程
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();
        ThreadClass threadClass2 = new ThreadClass();
        threadClass2.start();

        //runnable启动多线程
        RunnableClass runnableClass = new RunnableClass();
        Thread thread = new Thread(runnableClass);
        thread.start();//启动第一个线程
        Thread thread2 = new Thread(runnableClass);
        thread2.start();//启动第二个线程*/


        //启动定时任务
        Timer timer = new Timer();
        //添加定时任务
        timer.schedule(new FooTimerTask(1), new Date(),2000);

        timer.schedule(new FooTimerTask(2),new Date(),3000);

    }
}



class FooTimerTask extends TimerTask{

    private int id;

    public FooTimerTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "----" + id);

    }
}

class ThreadClass extends Thread{
    @Override
    public void run() {
        System.out.println("Thread多线程" + Thread.currentThread().getName());
    }
}

class RunnableClass implements Runnable{

    @Override
    public void run() {
        System.out.println("runnable多线程" + Thread.currentThread().getName());
    }
}

package com.zhang.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        //JDK动态代理
        ZhangsanProxy zhangsanProxy = new ZhangsanProxy(new ZhangSan());
        Persion persion =(Persion) Proxy.newProxyInstance(ProxyDemo.class.getClassLoader(), new Class[]{Persion.class}, zhangsanProxy);
        persion.makeCar();
    }


}

interface Persion{
    public void makeCar();
}

/*
* 被代理对象
* */
class ZhangSan implements Persion{

    @Override
    public void makeCar() {
        System.out.println("car + 基本轮廓");
    }
}

/*
* 代理对象
* */
class ZhangsanProxy implements InvocationHandler {

    Object obj;

    public ZhangsanProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("carFactory + 车身性能，油耗");
        method.invoke(obj, args);
        System.out.println("carFactory + 车身颜色，外观");
        return null;
    }
}



package com.zhang.test;

import java.lang.reflect.Method;

public class Reflection extends Object{
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.zhang.test.TestDemo2");
            Method[] declaredMethods = aClass.getDeclaredMethods();
            //获取本类中的方法，不包括父类，包括本类中私有的方法
            for (Method declaredMethod : declaredMethods) {
                System.out.println("======="+declaredMethod);
            }

            TestDemo2 t1 =(TestDemo2) aClass.newInstance();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

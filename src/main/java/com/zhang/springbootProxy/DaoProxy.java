package com.zhang.springbootProxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//代理对象 / 切面
@Aspect
@Component
public class DaoProxy{

    @Pointcut(value = "execution( * com.zhang.springbootProxy.Dao*.*(..)) ")//此处为指定那些地方的代码需要增强/指定增强代码的范围
    public void myPointCut(){

    }

    @Around("myPointCut()")//环绕增强
    public void advice1(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("调用前");
        pjp.proceed();//调用原本的方法
        System.out.println("调用后");

    }


}

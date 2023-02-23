package com.zhang.springbootProxy;

import com.zhang.MyAnnotation.MyTest;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

//告知spring为切面类，并交给ioc容器管理
@Aspect
@Component
public class MyTestProxy {

    @Around(value = "@annotation(com.zhang.MyAnnotation.MyTest)")
    public void TestAdvice(ProceedingJoinPoint pjp){
        try {
            //System.out.println("MyTestProxy");

            /*Class dao = Dao.class;
            //System.out.println(dao+"========class");
            Method[] declaredMethods = dao.getDeclaredMethods();
            //System.out.println(declaredMethods.length+"=======length");
            for (Method declaredMethod : declaredMethods) {
                boolean annotationPresent = declaredMethod.isAnnotationPresent(MyTest.class);
                //System.out.println(declaredMethod.getName() + "=====methodName");
                if (annotationPresent){
                    MyTest annotation = declaredMethod.getAnnotation(MyTest.class);
                    System.out.println(annotation.name() + "===methodName:" + declaredMethod.getName());
                }
            }*/

            System.out.println("MyTest注解=========");

            MethodSignature methodSignature =(MethodSignature) pjp.getSignature();
            Method method = methodSignature.getMethod();
            if (method != null){
                MyTest annotation = method.getAnnotation(MyTest.class);
                System.out.println(annotation.name() + "那个调用用输出那个");
            }





            /*Field[] declaredFields = dao.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                System.out.println(declaredField + "====fidle");
                MyTest annotation = declaredField.getAnnotation(MyTest.class);
                String name = annotation.name();
                System.out.println(name);
            }*/


            pjp.proceed();//调用原方法
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }


}

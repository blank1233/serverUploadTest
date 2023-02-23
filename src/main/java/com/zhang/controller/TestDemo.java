package com.zhang.controller;

import com.zhang.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;
import java.awt.image.BufferedImage;

public class TestDemo {

    private final String DOWNLOAD_IMAGE_PATH = "D:\\";


    public void findImage(){

        //获取屏幕宽高
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height =(int) screenSize.getHeight();
        int width =(int) screenSize.getWidth();

        System.out.println("屏幕高" + height+"---" + "屏幕宽" + width);
        //屏幕截图
        try {
            //全屏截图
            Robot robot = new Robot();
            BufferedImage screenCapture = robot.createScreenCapture(new Rectangle(0,0,width,height));

            /*//写入本地的路径
            File filePath = new File(DOWNLOAD_IMAGE_PATH + "1.png");
            ImageIO.write(screenCapture,"png", filePath);
            System.out.println("===========截图写入" + DOWNLOAD_IMAGE_PATH + "成功==========");*/

        } catch (Exception e) {
            System.out.println(e + "异常");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        /*try {
            Robot robot = new Robot();
            robot.mouseMove(776,262);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }*/
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(annotationConfigApplicationContext.getBean("teacher"));

    }
}

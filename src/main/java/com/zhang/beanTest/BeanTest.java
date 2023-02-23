package com.zhang.beanTest;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class BeanTest {


    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        //System.out.println(Clock.systemDefaultZone());
        String format = now.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(format);
        EnumClassTest enumClassTest = new EnumClassTest();
        enumClassTest.setYear(EnumClassTest.Year.ONEYEAR.getYear());
        //System.out.println(LocalDateTime.now());

    }

    /*public static void main(String[] args) {
        String[] strings = new String[]{"1","2"};
        ArrayList<String> strings1 = new ArrayList<>();
        paramTest(strings); //传递数组
        paramTest("1"); //传递String对象
        *//*paramTest(strings1); //编译报错，不能传集合*//*
    }*/

    /*public static void main(String[] args) {
        Day[] values = Day.values();
        for (Day value : values) {
            System.out.println(value);
        }
    }*/

    public static void paramTest(String... name){
        for (String s : name) {
            System.out.println(s);
        }
    }

    public static void enumTest(Day day){
        System.out.println(day.getState());
        System.out.println(day.getInfo());
    }

    public static void enumTest2(EnumTest enumTest){
        System.out.println(enumTest);

    }

}
enum Day{


    MDAY(1,"星期一"),
    TDAY(2,"星期二");

    private int state;
    private String info;

    public int getState() {
        return state;
    }

    public String getInfo() {
        return info;
    }

    Day(int state, String info) {
        this.state = state;
        this.info = info;
    }
}

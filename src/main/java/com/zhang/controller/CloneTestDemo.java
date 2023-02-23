package com.zhang.controller;

import com.zhang.pojo.Teacher;

public class CloneTestDemo implements Cloneable{

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Teacher teacher1 = teacher;

        teacher.setAge(1);
        System.out.println(teacher == teacher1);
    }


}

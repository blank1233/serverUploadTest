package com.zhang.pojo;

import java.util.Date;

public class Teacher {

    private int teacherId;

    private String teacherName;

    private int age;

    private Date workTime;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getWorkTime() {
        return workTime;
    }

    public Teacher() {
    }

    public Teacher(int teacherId, String teacherName, int age, Date workTime) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.age = age;
        this.workTime = workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

}

package com.zhang.beanTest;

public class EnumClassTest {

    private String name;

    private Integer age;

    private Integer year;

    public enum Year{
        ONEYEAR(1),
        TWOYEAR(2);

        private Integer year;

        public Integer getYear() {
            return year;
        }

        Year(Integer year) {
            this.year = year;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}

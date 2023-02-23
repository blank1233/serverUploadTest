package com.zhang.pojo;

public class ClonePojo implements Cloneable{
    private int age;

    private Integer age2;

    private int[] age3;


    public ClonePojo() {

    }

    public ClonePojo clone(){
        try {
            return (ClonePojo) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        ClonePojo clonePojo = new ClonePojo();
        //ClonePojo clonePojo1 = clonePojo;
        ClonePojo clonePojo1 = clonePojo.clone();
        //clonePojo.age = 1;
        //System.out.println(clonePojo == clonePojo1);
        clonePojo.age3 =new int[]{1,2,3};
        System.out.println(clonePojo == clonePojo1);
        System.out.println(clonePojo.age3 +",,," + clonePojo1.age3);
    }
}

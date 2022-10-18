package com.dustin.inheritance;

/**
 * @Project JavaSEReview
 * @Package com.dustin.inheritance
 * @ClassName Student
 * @Description 继承性
 * @Date 2022/9/20   03:15
 * @Created by Dustin_Peng
 */
public class Student extends Person{
//    String name;
//    int age;
    String major;

    public Student(){}

    public Student(String name, int age, String major) {
        this.name = name;
//        this.age = age;
        setAge(age);
        this.major = major;
    }

//    public void eat(){
//        System.out.println("吃饭...");
//    }
//
//    public void sleep(){
//        System.out.println("睡觉...");
//    }

    public void study(){
        System.out.println("学习...");
    }

    public void show(){
        System.out.println("name="+name+",age="+getAge());
    }
}

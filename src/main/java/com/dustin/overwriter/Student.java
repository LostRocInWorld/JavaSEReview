package com.dustin.overwriter;

/**
 * @Project JavaSEReview
 * @Package com.dustin.inheritance
 * @ClassName Student
 * @Description 方法重写
 * @Date 2022/9/20   03:15
 * @Created by Dustin_Peng
 */
public class Student extends Person {
//    String name;
//    int age;
    String major;

    public Student(){}

    public Student(String major) {
        this.major = major;
    }

    /**
     * 对父类中的eat()方法进行重写
     */
     void eat(){
        System.out.println("学生应该多吃有营养的食物");
    }


    public void study(){
        System.out.println("学习...");
    }

    /**
     * private不能被重写
     */
    public void show(){
        System.out.println("我是一个学生");
    }

    /**
     * 返回值类型可以是父类返回值类型或器子类
     */
    public String info(){
        return "返回了父类返回值类型Object子类String";
    }

    /**
     * 报错了
     */

//    public int info1(){
//        return 1;
//    }


}

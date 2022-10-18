package com.dustin.reflection;

/**
 * @author Dustin_Peng
 * @Description 反射
 * @create 2022-10-17-22:32
 */
@MyAnnotation("hi")
public class Student extends Creature<String> implements MyInterface,Comparable<String>{
    public String name;
    int age;
    private int id;

    @MyAnnotation("abc")
    private Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(){}

    @MyAnnotation
    private String show(String nation){
        System.out.println("我的国籍是：" + nation);
        return nation;
    }

    public String display(String interest,int year) throws NullPointerException,ClassCastException{
        return interest+year+"年";
    }

    public static void showDesc(){
        System.out.println("我是一个伟大的学生");
    }

    @Override
    public void info() {
        System.out.println("我是一个人");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}

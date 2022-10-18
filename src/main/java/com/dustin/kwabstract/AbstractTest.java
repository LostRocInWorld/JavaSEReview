package com.dustin.kwabstract;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwabstract
 * @ClassName AbstractTest
 * @Description abstract关键字的使用
 * @Date 2022/9/23   03:24
 * @Created by Dustin_Peng
 */
public class AbstractTest {
    public static void main(String[] args) {
        //abstract一旦修饰类就不能实例化了
//        Person p = new Person();
    }
}
abstract class Creature{
    public abstract void breath();
}
abstract class Person extends Creature{
    String name;
    int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public abstract void walk();
}
class Student extends Person{
    String major;

    public Student(String name,int age,String major) {
        super(name,age);
        this.major = major;
    }

    public Student() {
    }

    @Override
    public void walk() {
        System.out.println("学生朝气的踏着正步走来");
    }

    @Override
    public void breath() {
        System.out.println("学生应该要呼吸");
    }
}
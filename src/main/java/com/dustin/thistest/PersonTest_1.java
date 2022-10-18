package com.dustin.thistest;

/**
 * @Project JavaSEReview
 * @Package com.dustin.thistest
 * @ClassName Person
 * @Description this关键字的使用
 * @Date 2022/9/18   00:49
 * @Created by Dustin_Peng
 */
public class PersonTest_1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("tom");
        p.eat();

        Person p1 = new Person(20);
        Person p2 = new Person("Jerry", 21);
        System.out.println(p2.getAge());
    }
}
class Person{
    private String name;
    private int age;

    public Person(){
        this.eat();
        System.out.println(this);
        System.out.println("Person初始化是，需要考虑如下的1,2,3,4,....(一共40行代码)");
    }

    public Person(String name, int age) {
        this(age);
        this.name = name;
//        this.age = age;
    }

    public Person(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(this);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("人吃饭");
        this.study();
    }

    public void study(){
        System.out.println("人学习");
    }
}

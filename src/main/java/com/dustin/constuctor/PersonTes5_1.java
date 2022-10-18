package com.dustin.constuctor;

/**
 * @Project JavaSEReview
 * @Package com.dustin.encapsulation1
 * @ClassName PersonTes5_2
 * @Description 构造器
 * @Date 2022/9/17   22:39
 * @Created by Dustin_Peng
 */
public class PersonTes5_1 {
    public static void main(String[] args) {
        //创建类的对象 :new + 构造器
        Person p = new Person();
        p.eat();
        Person p1 = new Person("tom");
        System.out.println(p1.name);
    }
}

class Person {
    String name;
    int age;

    public void eat() {
        System.out.println("人吃饭");
    }

    public Person(){
        System.out.println("Person()......");
    }

    public Person(String n){
        name = n;
    }

    public Person(String s,int i){
        name = s;
        age = i;
    }
}

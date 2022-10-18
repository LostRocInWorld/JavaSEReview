package com.dustin.polymorphism;

/**
 * @Project JavaSEReview
 * @Package com.dustin.polymorphism
 * @ClassName PersonTest
 * @Description 多态性
 * @Date 2022/9/21   01:36
 * @Created by Dustin_Peng
 */
public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.eat();
        Man m1 = new Man();
        m1.eat();
        //多态性
        Person p2 = new Man();
        Person p3 = new Woman();

        //多态的使用
        p2.eat();
        p2.walk();
        //不能使用子类的特有方法
//        p2.work();
        System.out.println(p2.id);
    }
}

package com.dustin.polymorphism;

/**
 * @Project JavaSEReview
 * @Package com.dustin.polymorphism
 * @ClassName Person
 * @Description 多态性
 * @Date 2022/9/21   01:31
 * @Created by Dustin_Peng
 */
public class Person {
    String name;
    int age;
    int id = 1001;

    public void eat(){
        System.out.println("人吃饭");
    }

    public void walk(){
        System.out.println("人走路");
    }
}


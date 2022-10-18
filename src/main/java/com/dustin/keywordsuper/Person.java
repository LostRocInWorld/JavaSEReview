package com.dustin.keywordsuper;

/**
 * @Project JavaSEReview
 * @Package com.dustin.keywordsuper
 * @ClassName Person
 * @Description super关键字
 * @Date 2022/9/20   22:55
 * @Created by Dustin_Peng
 */
public class Person {
    String name;
    int age;
    /**
     * 身份证号
     */
    int id = 1001;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public void walk(){
        System.out.println("人走路");
    }
}

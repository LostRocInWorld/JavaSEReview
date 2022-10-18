package com.dustin.overwriter;

import com.dustin.inheritance.Creature;

/**
 * @Project JavaSEReview
 * @Package com.dustin.inheritance
 * @ClassName Person
 * @Description 方法重写
 * @Date 2022/9/20   03:14
 * @Created by Dustin_Peng
 */
public class Person extends Creature {
    String name;
     int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

     void eat(){
        System.out.println("吃饭...");
    }

    public void walk(int distance){
        System.out.println("走路，走了"+distance+"公里");
        eat();
    }


    private void show(){
        System.out.println("我是一个人");
    }

    public Object info(){
        return null;
    }

    public double info1(){
        return 1.0;
    }

}

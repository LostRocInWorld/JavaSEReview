package com.dustin.encapsulation;

/**
 * @Project JavaSEReview
 * @Package com.dustin.encapsulation
 * @ClassName Animal_1
 * @Description 动物类，封装与隐藏
 * @Date 2022/9/17   04:15
 * @Created by Dustin_Peng
 */
public class Animal_1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "大黄";
        a.age = 1;
//        a.legs = 4;
        a.show();

        a.setLegs(6);
        a.show();
    }
}

class Animal {
    String name;
    int age;
    private int legs;//腿的个数,使用private将属性对外部不可见

    //对属性的设置。提供方法，供外部设置
    public void setLegs(int l) {
        if (l >= 0 && (l % 2 == 0)) {
            legs = l;
        } else {
            legs = 1;
        }

    }
    //对属性的获取
    public int getLegs(){
        return legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("动物进食");
    }

    public void show() {
        System.out.println("age:" + age + ",name:" + name + ",legs:" + legs);
    }
}
package com.dustin.thistest;

/**
 * @Project JavaSEReview
 * @Package com.dustin.thistest
 * @ClassName Boy_2
 * @Description this练习
 * @Date 2022/9/18   01:56
 * @Created by Dustin_Peng
 */
public class Boy_2 {
    private String name;
    private int age;

    public Boy_2() {
    }

    public Boy_2(String name) {
        this.name = name;
    }

    public Boy_2(int age) {
        this.age = age;
    }

    public Boy_2(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void marry(Girl_3 girl){
        System.out.println("我想娶"+girl.getName());
    }

    public void shout(){
        if(age>=22){
            System.out.println("赶紧相亲");
        }else{
            System.out.println("年级还小不要早恋");
        }
    }
}

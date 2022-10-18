package com.dustin.thistest;

/**
 * @Project JavaSEReview
 * @Package com.dustin.thistest
 * @ClassName Girl_3
 * @Description this练习
 * @Date 2022/9/18   02:00
 * @Created by Dustin_Peng
 */
public class Girl_3 {
    private int age;
    private String name;

    public Girl_3() {
    }

    public Girl_3(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy_2 boy) {
        System.out.println("我想嫁给" + boy.getName());
        boy.marry(this);
    }

    /**
     * 比较两个对象的大小
     *
     * @param girl
     * @return 正数：当前对象大，负数：当前对象小，0：当前对象与形参对象相等
     */
    public int compare(Girl_3 girl) {
        return this.age - girl.age;
    }
}

package com.dustin.polymorphism;

/**
 * @Project JavaSEReview
 * @Package com.dustin.polymorphism
 * @ClassName Man
 * @Description 多态性
 * @Date 2022/9/21   01:32
 * @Created by Dustin_Peng
 */
public class Man extends Person{
    boolean isSmoking;
    int id = 1002;

    public void work(){
        System.out.println("男人负责挣钱养家");
    }

    public void eat(){
        System.out.println("男人多吃肉");
    }

    public void walk(){
        System.out.println("男人走路虎虎生风");
    }
}

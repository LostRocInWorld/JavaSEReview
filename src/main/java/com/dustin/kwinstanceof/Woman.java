package com.dustin.kwinstanceof;

/**
 * @Project JavaSEReview
 * @Package com.dustin.polymorphism
 * @ClassName Woman
 * @Description 多态性
 * @Date 2022/9/21   01:34
 * @Created by Dustin_Peng
 */
public class Woman extends Person {
    boolean isBeauty;

    public void goShopping(){
        System.out.println("女生喜欢网上购物");
    }

    @Override
    public void eat() {
        System.out.println("女生少吃，为了减肥");
    }

    @Override
    public void walk() {
        System.out.println("女生窈窕的走路");
    }
}

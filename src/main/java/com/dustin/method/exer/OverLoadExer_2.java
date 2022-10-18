package com.dustin.method.exer;

/**
 * @Project JavaSEReview
 * @Package com.dustin.method.exer
 * @ClassName OverLoadExer_2
 * @Description 方法重载练习
 * @Date 2022/9/16   04:47
 * @Created by Dustin_Peng
 */
public class OverLoadExer_2 {
    public void mOL(int i) {
        System.out.println(i * i);
    }

    public void mOL(int i, int j) {
        System.out.println(i * j);
    }

    public void mOL(String s) {
        System.out.println(s);
    }

    public int max(int i,int j){
        return i>j?i:j;
    }

    public double max(double i,double j){
        return i>j?i:j;
    }

    public double max(double i,double j,double k){
        double temp =j>k?j:k;
        return i>temp?i:temp;
    }
}

package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName CompareTest
 * @Description 关系运算符
 * @Date 2022/9/8   03:31
 * @Created by Dustin_Peng
 */
public class CompareTest_11 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        System.out.println(i == j);//false
        System.out.println(i = j);//20,将j的值20赋值给i，并输出i的值

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 == b2);//false
        System.out.println(b2 = b1);//true

    }
}

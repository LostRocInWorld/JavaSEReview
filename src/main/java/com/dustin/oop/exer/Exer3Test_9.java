package com.dustin.oop.exer;

/**
 * @Project JavaSEReview
 * @Package com.dustin.object.exer
 * @ClassName Exer3Test_9
 * @Description 面向对象练习
 * @Date 2022/9/15   04:22
 * @Created by Dustin_Peng
 */
public class Exer3Test_9 {
    public static void main(String[] args) {
        Exer3Test_9 test = new Exer3Test_9();
//        test.method();
        System.out.println("10*8矩形面积为：" + test.method(10, 8));

    }

    public int method(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
}
package com.dustin.basic;

import java.util.Scanner;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName ForWhileTest_24
 * @Description 循环语句总和
 * @Date 2022/9/10   03:18
 * @Created by Dustin_Peng
 */
public class ForWhileTest_24 {
    public static void main(String[] args) {
        //从键盘输入不确定个数的整数，并判断读入的正数和负数的个数，输入为0时结束程序
        Scanner scanner = new Scanner(System.in);
        int positiveNum = 0;    //正数个数
        int negativeNum = 0;    //负数个数

        while (true) {
            System.out.println("请输入整数：");
            int number = scanner.nextInt();
            //判断number的正负情况
            if (number > 0) {
                positiveNum++;
            } else if (number < 0) {
                negativeNum++;
            } else {
                break;
            }
        }

        System.out.println("正数个数"+positiveNum);
        System.out.println("负数个数"+negativeNum);
    }
}

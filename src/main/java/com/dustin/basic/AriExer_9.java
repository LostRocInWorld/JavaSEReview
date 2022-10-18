package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName AriExer_7
 * @Description 算术运算符练习
 * @Date 2022/9/8   02:42
 * @Created by Dustin_Peng
 */
public class AriExer_9 {
    public static void main(String[] args) {
        //输出这个数的百位，十位，个位
        int num =37;
        System.out.println("百位为："+num/100);
        System.out.println("十位为："+num%100/10);
        System.out.println("个位为："+num%10);
    }
}

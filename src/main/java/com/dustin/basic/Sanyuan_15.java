package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName Sanyuan_15
 * @Description 三元运算符
 * @Date 2022/9/9   01:32
 * @Created by Dustin_Peng
 */
public class Sanyuan_15 {
    public static void main(String[] args) {
        //(条件表达式)?表达式1:表达式2
        //获取两个整数的较大值
        int m = 12;
        int n = 5;

        int maxim = (m > n) ? m : n;
        System.out.println(maxim);

        String maxStr = (m > n) ? "m大" : ((m == n) ? "m和n相等" : "n大");
        System.out.println(maxStr);

        //获取三个整数的最大值
        int x = 12, y = 30, z = -43;
        int max1 = (x > y) ? x : y;
        int max = (max1 > z) ? max1 : z;
        System.out.println(max);
    }
}

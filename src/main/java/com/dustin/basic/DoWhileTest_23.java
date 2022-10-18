package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName DoWhileTest_23
 * @Description do-while循环
 * @Date 2022/9/10   03:10
 * @Created by Dustin_Peng
 */
public class DoWhileTest_23 {
    public static void main(String[] args) {
        //遍历100以内的偶数
        int sum = 0;
        int cnt = 0;
        int num = 1;
        do {
            if (num % 2 == 0) {
                System.out.println(num);
                sum += num;
                cnt++;
            }
            num++;
        } while (num <= 100);
        System.out.println("总和为:" + sum);
        System.out.println("个数为:" + cnt);
    }
}

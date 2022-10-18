package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName ForForExer_26
 * @Description 嵌套循环练习
 * @Date 2022/9/10   05:04
 * @Created by Dustin_Peng
 */
public class ForForExer_26 {
    public static void main(String[] args) {
        //九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
            }
            System.out.println();
        }
        //100以内的所有质数
        //质数：素数，只能被1和它本身整除的自然数。
//        for (int i = 1; i < 100; i++) {
//            boolean isFlag = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    isFlag = false;
//                }
//            }
//            if (isFlag) {
//                System.out.print(i + "\t");
//            }
//        }
        //方式2
        //优化1：21773ms-->1971ms
        //优化2：21773ms-->50ms
        long start = System.currentTimeMillis();//获取当前时间距离1970/01/01 00:00:00的毫秒数
        for (int i = 1; i < 1000000; i++) {
            boolean isFlag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {//优化2：小于根号i，因为需要判断的数x=y*y
                if (i % j == 0) {
                    isFlag = false;
                    break;//优化1：只对本身非质数自然数有效
                }
            }
            if (isFlag) {
                System.out.print(i + "\t");
            }
        }
        long end = System.currentTimeMillis();//获取当前时间距离1970/01/01 00:00:00的毫秒数
        System.out.println("程序执行花费时间为:" + (end - start) + "ms");
    }
}

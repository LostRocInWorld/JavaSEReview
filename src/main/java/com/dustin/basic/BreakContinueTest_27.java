package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName BreakContinueTest_27
 * @Description break和continue关键字的使用
 * @Date 2022/9/10   05:36
 * @Created by Dustin_Peng
 */
public class BreakContinueTest_27 {
    public static void main(String[] args) {
//        for (int i = 1; i < 6; i++) {
//            if ((i % 4) == 0) {
//                continue;
//            }
//            System.out.print(i);//break输出1,2,3，continue输出1,2,3,5
//        }
//
//        System.out.println();
//
//        //--------
//        label:for (int i = 0; i < 4; i++) {
//            for (int j = 1; j <=5; j++) {
//                if ((j % 4) == 0) {
//                    break label;
//                }
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        //实现方式2
//        long start = System.currentTimeMillis();//获取当前时间距离1970/01/01 00:00:00的毫秒数
//        label:for (int i = 1; i < 100; i++) {
//            boolean isFlag = true;
//            for (int j = 2; j <= Math.sqrt(i); j++) {//优化2：小于根号i，因为需要判断的数x=y*y
//                if (i % j == 0) {
//                    continue label;
//                }
//            }
//            System.out.print(i + "\t");
//        }
//        long end = System.currentTimeMillis();//获取当前时间距离1970/01/01 00:00:00的毫秒数
//        System.out.println("程序执行花费时间为:" + (end - start) + "ms");
        //3.一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1+2+3，找出1000以内的所有完数。(因子：除去这个数本身的其他约数)
        for (int i = 1; i <= 1000; i++) {
            int tempSum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    tempSum += j;
                }
            }
            if (tempSum == i) {
                System.out.println(i);
            }
        }
    }
}

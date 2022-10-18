package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName ForForTest
 * @Description 嵌套循环
 * @Date 2022/9/10   04:14
 * @Created by Dustin_Peng
 */
public class ForForTest_25 {
    public static void main(String[] args) {
        //输出*****的效果
//        for (int i = 1; i < 6; i++) {
//            System.out.print("*");
//        }
//
//        /*      输出如下的结果
//         *****
//         *****
//         *****
//         *****
//         */
//        for (int j = 1; j < 5; j++) {
//            for (int i = 1; i < 6; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        /*      输出如下的结果
//         *
//         **
//         ***
//         ****
//         */
//        for (int x = 0; x < 4; x++) {//控制行数
//            for (int y = 0; y < x + 1; y++) {   //控制列数
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int x = 0; x < 4; x++) {//控制行数
//            for (int y = 0; y < 4 - x; y++) {   //控制列数
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //打印菱形
        int row = 4;
        for (int u = 1; u <= row; u++) {//控制行数，打印3行
            for (int v = 1; v <= row - u; v++) {//输出左边的空格
                System.out.print(" ");
            }
            for (int w = 0; w < (2 * u -1 ); w++) {//输出菱形
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

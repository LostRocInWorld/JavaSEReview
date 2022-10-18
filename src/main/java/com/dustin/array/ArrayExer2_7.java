package com.dustin.array;

import java.util.Scanner;

/**
 * @Project JavaSEReview
 * @Package com.dustin.array
 * @ClassName ArrayExer2_7
 * @Description 回形数
 * @Date 2022/9/14   00:02
 * @Created by Dustin_Peng
 */
public class ArrayExer2_7 {
    public static void main(String[] args) {
        //回形数
        //举例即输入一个数字5，创建一个如下的二维数组，以回形的方式递增
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int n = scanner.nextInt();
        int max = n * n;
        int d = 1;
        int i = 0, j = 0;
        int[][] num = new int[n][n];
        for (int m = 1; m <= max; m++) {
            //向右
            if (d == 1) {
                if (j < n && num[i][j] == 0) {
                    num[i][j++] = m;
                } else {
                    //开始变换作业方向
                    d = 2;
                    i++;
                    j--;
                    m--;
                }
            } else if (d == 2) {   //向下
                if (i < n && num[i][j] == 0) {
                    num[i++][j] = m;
                } else {
                    d = 3;
                    i--;
                    j--;
                    m--;
                }
            } else if (d == 3) {//向左
                if (j >= 0 && num[i][j] == 0) {
                    num[i][j--] = m;
                } else {
                    d = 4;
                    i--;
                    j++;
                    m--;
                }
            } else if (d == 4) {//向上
                if (i >= 0 && num[i][j] == 0) {
                    num[i--][j] = m;
                } else {
                    d = 1;
                    i++;
                    j++;
                    m--;
                }
            }
        }
        for (int k = 0; k < num.length; k++) {
            for (int l = 0; l < num[k].length; l++) {
                System.out.print(num[k][l] + "\t");
            }
            System.out.println();
        }

    }
}

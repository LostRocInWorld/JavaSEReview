package com.dustin.method;

import java.util.Arrays;

/**
 * @Project JavaSEReview
 * @Package com.dustin.method
 * @ClassName RecursionTest_10
 * @Description 递归的了解
 * @Date 2022/9/17   02:12
 * @Created by Dustin_Peng
 */
public class RecursionTest_10 {
    //计算1-100所有自然数的循环
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            sum += i;
        }

        int sum2 = getSum(100);
        System.out.println(sum2);
        System.out.println(f(10));


        System.out.print(fibonacci(10) + "\t");

    }

    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }

    public static int f(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * f(n - 1) + f(n - 2);
        }
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 1||n == 2) {
            return 1;
        } else{
            int[] f = new int[n];
            f[0]=f[1]=1;
            for (int i = 2; i < n; i++) {
                f[i]=f[i-2]+f[i-1];
            }
            System.out.println(Arrays.toString(f));
            return f[n-1];
        }
    }


}

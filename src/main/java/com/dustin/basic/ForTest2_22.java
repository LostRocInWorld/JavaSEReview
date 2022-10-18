package com.dustin.basic;

import java.util.Scanner;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName ForTest2_22
 * @Description for循环例题
 * @Date 2022/9/10   02:31
 * @Created by Dustin_Peng
 */
public class ForTest2_22 {
    public static void main(String[] args) {
        //输入两个整数m和n,求其最大公约数和最小公倍数
        //如12和20的最大公约数为4，最小公倍数为60
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数：");
        int m = scanner.nextInt();
        System.out.println("输入第二个数：");
        int n = scanner.nextInt();

        //最大公约数
        int i;
        for (i = (m < n ? m : n); i >= 2; i--) {
            if ((m % i == 0) && (n % i == 0)) {
                System.out.println("最小公约数:" + i);
                break;
            }
        }

        //最小公倍数
        for (int j = 1; j <= (m * n); j++) {
            if (((m * j) % n) == 0) {
                System.out.println("最小公倍数:" + (m * j));
                break;
            }
        }

        for (int k = 100; k <= 999; k++) {
            int dig_1 = k / 100;
            int dig_2 = (k % 100) / 10;
            int dig_3 = k % 10;
            int sum = dig_1 * dig_1 * dig_1 + dig_2 * dig_2 * dig_2 + dig_3 * dig_3 * dig_3;
            if (sum == k) {
                System.out.print(k + "    ");
            }
        }
    }
}

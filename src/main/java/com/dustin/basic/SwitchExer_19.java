package com.dustin.basic;

import java.util.Scanner;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName SwitchExer_19
 * @Description switch-case结构的练习题
 * @Date 2022/9/10   00:44
 * @Created by Dustin_Peng
 */
public class SwitchExer_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int cnt = 1;
        while (flag) {
//            System.out.println("请输入成绩：");
//            int score = scanner.nextInt();
//            switch (score / 30) {
//                case 0:
//                case 1:
//                    System.out.println("不及格");
//                    break;
//                case 2:
//                case 3:
//                    System.out.println("及格");
//                    break;
//            }
            System.out.println("请输入年份：");
            int year = scanner.nextInt();
            System.out.println("请输入月份：");
            int month = scanner.nextInt();
            System.out.println("请输入日期：");
            int day = scanner.nextInt();
            int monthDay = 0;
            switch (month) {
                case 12:
                    monthDay += 31;
                case 11:
                    monthDay += 31;
                case 10:
                    monthDay += 30;
                case 9:
                    monthDay += 31;
                case 8:
                    monthDay += 31;
                case 7:
                    monthDay += 30;
                case 6:
                    monthDay += 31;
                case 5:
                    monthDay += 30;
                case 4:
                    monthDay += 31;
                case 3:
                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 !=0)) {
                        monthDay += 28;
                    } else {
                        monthDay += 29;
                    }
                case 2:
                    monthDay += 31;
                case 1:
                    monthDay += day;
            }
            System.out.println(year+"/"+month+"/"+day+"是今年的第" + monthDay+"天.");
            cnt++;
            if (cnt >= 10) {
                flag = false;
            }
        }
    }
}

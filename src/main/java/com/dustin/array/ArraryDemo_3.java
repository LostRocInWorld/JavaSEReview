package com.dustin.array;

import java.util.Scanner;

/**
 * @Project JavaSEReview
 * @Package com.dustin.array
 * @ClassName ArraryDemo_3
 * @Description 一维数组例题
 * @Date 2022/9/13   02:52
 * @Created by Dustin_Peng
 */
public class ArraryDemo_3 {
    public static void main(String[] args) {
        //1.
//        int[] arr = new int[]{8,2,1,0,3};
//        int[] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};//18013820100
//        String tel = "";
//        for(int i = 0;i<index.length;i++){
//            tel += arr[index[i]];
//        }
//        System.out.println("联系方式"+tel);
        //2.
        //1.使用Scanner，读取学生成绩
        Scanner scanner = new Scanner(System.in);
        //2.创建数组用于存储，动态初始化
        System.out.println("请输入学生个数");
        int number = scanner.nextInt();
        int[] score = new int[number];
        System.out.println("请输入" + number +
                "个学生的成绩，按enter进入下一个");
        //3.给数组中的元素赋值
        //4.获取数组中的最大元素，找最高分
        int max = score[0];
        for (int i = 0; i < number; i++) {
            score[i] = scanner.nextInt();
            if (max < score[i]) {
                max = score[i];
            }
        }
        //5.遍历并输出
        char level;
        System.out.println("最大成绩为" + max);
        for (int i = 0; i < score.length; i++) {
            if (score[i] >= max - 10) {
                level = 'A';
            } else if (score[i] >= max - 20) {
                level = 'B';
            } else if (score[i] >= max - 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("学生" + i + "成绩等级为：" + level);
        }

    }
}

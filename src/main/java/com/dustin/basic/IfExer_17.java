package com.dustin.basic;

import java.util.Scanner;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName IfExer_17
 * @Description if-else练习
 * @Date 2022/9/9   04:10
 * @Created by Dustin_Peng
 */
public class IfExer_17 {
    public static void main(String[] args) {
////        如何从控制台获取不同类型的变量:使用Scanner类
//        //1.导包 import java.util.Scanner;
//        //2.Scanner的实例化
//        Scanner scanner = new Scanner(System.in);
//        //3.调用Scanner类的相关方法nextXxx()方法，来获取指定类型的变量
//        int i = scanner.nextInt();
//        System.out.println(i);
//        short s = scanner.nextShort();
//        String str = scanner.next();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入岳晓鹏的成绩：");
//        int score = scanner.nextInt();
//        if (score == 100) {
//            System.out.println("获得了BMW");
//        } else if (80 < score && score <= 99) {
//            System.out.println("获得了iPhone X");
//        } else if (60 <= score && score <= 80) {
//            System.out.println("获得了iPad");
//        } else {
//            System.out.println("获得了大比斗");
//        }
//        System.out.println("请输入num1：");
//        int num1 = scanner.nextInt();
//        System.out.println("请输入num2：");
//        int num2 = scanner.nextInt();
//        System.out.println("请输入num3：");
//        int num3 = scanner.nextInt();
//        String s;
//        if (num1 > num2) {
//            if (num2 > num3) {
//                s = "" + num3 + "," + num2 + "," + num1;
//            } else {
//                s = "" + num2 + "," + num3 + "," + num1;
//            }
//        } else {
//            if (num1 > num3) {
//                s = "" + num3 + "," + num1 + "," + num2;
//            } else {
//                s = "" + num1 + "," + num3 + "," + num2;
//            }
//        }
//        System.out.println(s);
//        int x = 4;
//        int y = 1;
//        if (x > 2)
//            if (y > 2)
//                System.out.println(x + y);
//            else
//                System.out.println("x is" + x);

//        int num1 = 10;
//        int num2 = 90;
//        if((num1+num2)>50){
//            System.out.println("hello world!");
//        }
//        System.out.println("请输入狗狗的年龄：");
//        double dogAge = scanner.nextDouble();
//        double humanRelatedAge ;
//        if(dogAge > 0){
//            humanRelatedAge=(dogAge>2)?(21+4*(dogAge-2)):(10.5*dogAge);
//            System.out.println("狗狗"+dogAge+"岁相当于人类"+humanRelatedAge+"岁!");
//        }else{
//            System.out.println("您输入的有误");
//        }
//        System.out.println("请输入彩票数字，仅两位");
//        int user = scanner.nextInt();
//        int lottery = (int) (Math.random() * 90 + 10);
//        int ones_lot = lottery % 10;
//        int tens_lot = lottery / 10;
//        int ones_user = user % 10;
//        int tens_user = user / 10;
//
//        System.out.println(lottery);
//        if (user >= 10 && user < 100) {
//            if (user == lottery) {
//                System.out.println("奖金10000美元");
//            } else if (ones_user == tens_lot && ones_lot == tens_user) {
//                System.out.println("奖金3000美元");
//            } else if (ones_user == ones_lot | tens_user == tens_lot) {
//                System.out.println("奖金1000美元");
//            } else if (ones_user == tens_lot | tens_user == ones_lot) {
//                System.out.println("奖金500美元");
//            }else {
//                System.out.println("没奖金");
//            }
//        }else{
//            System.out.println("输入不正确");


        System.out.println("请根据如下条件填写");
        System.out.println("请输入身高？");
        boolean height = (scanner.nextDouble()) > 180;
        System.out.println("请输入财富值");
        boolean rich = (scanner.nextDouble()) > 10000000;
        System.out.println("帅？true/false");
        boolean handsome = scanner.nextBoolean();

        if (height && rich && handsome) {
            System.out.println("我一定要嫁给他");
        } else if (height || rich || handsome) {
            System.out.println("嫁吧，比上不足比下有余");
        } else {
            System.out.println("滚，不嫁");
        }
    }
}

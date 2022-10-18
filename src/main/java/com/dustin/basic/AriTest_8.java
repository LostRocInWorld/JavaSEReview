package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName AriTest
 * @Description 算术符运算
 * @Date 2022/9/8   02:05
 * @Created by Dustin_Peng
 */
public class AriTest_8 {
    public static void main(String[] args) {
        //算术运算符
        //除号"/"
        int num1 = 12;
        int num2 = 5;
        int result = num1 / num2;
        System.out.println(result);//2

        int result1 = num1 / num2 * num2;
        System.out.println(result);//10

        double result3 = num1 / num2;
        double result4 = num1 / (num2 + 0.0);
        double result5 = num1 / num2 + 0.0;
        double result6 = (double)num1 / num2;
        double result7 = (double)(num1 / num2);
        System.out.println(result3);//2.0
        System.out.println(result4);//2.4
        System.out.println(result5);//2.0
        System.out.println(result6);//2.4
        System.out.println(result7);//2.0

        //取余"%",结果的符号与被模数一致
        //开发中，经常用取模来判断是否能被除尽的情况
        int m1 = 12;
        int n1 = 5;
        System.out.println("m1%n1="+(m1%n1));

        //(前)++与(后)++
        int a1 =10;
        int b1 = ++a1;
        System.out.println("a1="+a1+",b1="+b1);

        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2="+a2+",b1="+b2);

        //注意点
        short s1 = 10;
        s1++;   //不会改变本身变量的数据类型

        byte bt1= 127;
        bt1++;
        System.out.println(bt1);//-128

    }
}

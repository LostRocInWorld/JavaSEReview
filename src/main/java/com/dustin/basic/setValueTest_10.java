package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName setValueTest
 * @Description 赋值运算符
 * @Date 2022/9/8   02:54
 * @Created by Dustin_Peng
 */
public class setValueTest_10 {
    public static void main(String[] args) {
        //赋值符号 "="
        int j1 = 10;

        int i2,j2;
        //连续赋值
        i2 = j2 =10;

        int i3 = 10, j3 = 20;

        //---扩展赋值运算,不会改变本身变量的数据类型
        int num1 = 10;
        num1 +=2;   //num1 = num1 +2;
        num1 *=2;
        num1 %=2;
        System.out.println(num1);

        //练习1
        int i =1;
        i *=0.1;
        System.out.println(i);//0

        int m =2;
        int n = 3;
        n*=m++;
        System.out.println("m="+m);//3
        System.out.println("n="+n);//6
    }
}

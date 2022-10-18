package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName StringTest_6
 * @Description String类型变量的使用
 * @Date 2022/9/7   01:02
 * @Created by Dustin_Peng
 */
public class StringTest_6 {
    public static void main(String[] args) {
        String s1 = "Hello World!";
        System.out.println(s1);

        String s2 = "a";
        String s3 = "";

        //连接运算
        int number = 100;
        String numStr = "学号:";
        boolean b1 = true;
        System.out.println(numStr + number + b1);

        //***********
        //练习1
        char c = 'a';//a=97,A=65
        int num = 10;
        String str = "hello";
        System.out.println(c + num + str);//107hello
        System.out.println(c + str + num);//ahello10
        System.out.println(c + (num + str));//a10hello
        System.out.println((c + num) + str);//107hello
        System.out.println(str + num + c);//hello10a

        //练习2
        //输出*(tab键)*
        System.out.println("*\t*");//ok
        System.out.println( '*' +'\t' +'*');//no  93
        System.out.println( '*' +"\t" +'*');//ok
        System.out.println( '*' +'\t' +"*");//no   51*
        System.out.println( '*' +('\t' +"*"));//ok

    }
}

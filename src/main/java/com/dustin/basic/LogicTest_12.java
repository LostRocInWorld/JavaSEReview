package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName LogicTest_12
 * @Description 逻辑运算符
 * @Date 2022/9/8   03:41
 * @Created by Dustin_Peng
 */
public class LogicTest_12 {
    public static void main(String[] args) {
        //&（逻辑与），|（逻辑或），！（逻辑非），^（逻辑异或），&&（短路与），||（短路或）
        //1.操作的都是boolean类型的变量

        //区分&和&&
        //相同点：运算结果相同。当符号左边为true时，都会执行符号右边的运算
        //不同点：当符号左边为false时，&继续执行符号右边的运算，&&不再执行。
        boolean b1 = false;
        int num1 = 10;
        int num2 = 10;
        if (b1 & (num1++ > 0)) {
            System.out.println("输出真的结果");
        } else {
            System.out.println("输出假的结果");
        }
        System.out.println("num1 = "+num1);

        if (b1 && (num2++ > 0)) {
            System.out.println("输出真的结果");
        } else {
            System.out.println("输出假的结果");
        }
        System.out.println("num2 = "+num2);

    }
}

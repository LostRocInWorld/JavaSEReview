package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName VaribleTest1_2
 * @Description 8种基本数据类型
 * @Date 2022/9/6   21:34
 * @Created by Dustin_Peng
 */
public class VariableTest2_2 {
    public static void main(String[] args) {
        //1.byte
        byte b1 = 12;
        byte b2 = -128;
//        byte b3 = 128; //编译不通过
        System.out.println("b1=" + b1 + ";   b2=" + b2);

        //2.通常定义整形变量时，使用int
        short s1 = 128;
        int i1 = 1299;
        long l1 = 1234567890L;  //声明long型变量，必须以"l"或者"L"结尾
        System.out.println(l1);

        //3.浮点型
        double d1 = 123.3;
        System.out.println(d1 + 1);

        float f1 = 12.3f;
        System.out.println(f1);

        //4.字符型,内部只能写一个字符
        char c1 = 'a';
//        char c2 = 'aB'; //编译不通过
        char c3 = '1';
        char c4 = '中';
        char c5 = 'あ';
        System.out.println(c5);
        //转义字符
        char c6 = '\n';
        System.out.println("hello" + c5 + "world");
        //Unicode值
        char c7 = '\u0123';
        System.out.println(c7);

        //5.布尔型
        boolean bl1 = true;
        System.out.println(bl1);

        boolean isMarried = true;
        if (isMarried) {
            System.out.println("你不能参加\"单身\"party了");
        } else {
            System.out.println("单身狗");
        }

    }
}

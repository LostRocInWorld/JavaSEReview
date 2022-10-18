package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName VaribleTest1_3
 * @Description 基本数据之间的运算
 * @Date 2022/9/6   21:34
 * @Created by Dustin_Peng
 */
public class VariableTest3_3 {
    public static void main(String[] args) {
        byte b1 = 2;
        int i1 = 12;
//        byte b2 = b1 + i1;  //编译不通过
        int i2 = b1 + i1;
        System.out.println(i2);

        float f = b1 + i1 ;
        System.out.println(f);

        short s1 = 123;
        double d1 = s1;
        System.out.println(d1);

        //------------特殊情况------------
        char c1 = 'a';
        int i3 = 10;
        int i4 = i3 + c1;
        System.out.println(i4);

        short s2 = 10;
        int i5 = s2 + c1;
//        short s3 = s2 + c1; //编译不通过


        byte b2 =10;
        int i6 = c1 + b2;

//        short s4 = b2 + s2; //编译不通过
        int i7 = b2 + s2;
        //--------------------------------
    }
}

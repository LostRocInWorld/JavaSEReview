package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName VaribleTest1_4
 * @Description 强制类型转换
 * @Date 2022/9/6   21:34
 * @Created by Dustin_Peng
 */
public class VariableTest4_4 {
    public static void main(String[] args) {
        double d1 = 12.9;
        int i1 = (int)d1;//截断操作，精度损失
        System.out.println(i1);

        //没有精度损失
        long l1 = 123;
        short s1 = (short) l1;

        //精度损失举例1
        int i2 =128;
        byte b= (byte) i2;
        System.out.println(b);
    }
}

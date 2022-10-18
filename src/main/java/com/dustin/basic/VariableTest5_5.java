package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName VariableTest4_5
 * @Description 变量类型
 * @Date 2022/9/7   00:23
 * @Created by Dustin_Peng
 */
public class VariableTest5_5 {
    public static void main(String[] args) {
        //1.编码情况1
        long l = 123213;//自动类型提升
        System.out.println(l);

        long l1 = 123456789120332323L;//超出int范围，越界了

//        float f1 = 12.3; //浮点型常量默认类型为double型

        //2.编码情况2，常量
        byte b =12;
        int i = b + 1;//整型常量默认类型为int型
    }

}

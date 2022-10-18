package com.dustin.method;

/**
 * @Project JavaSEReview
 * @Package com.dustin.method
 * @ClassName ValueTransTest_11
 * @Description String值传递特例
 * @Date 2022/9/17   03:48
 * @Created by Dustin_Peng
 */
public class ValueTransTest_11 {
    public static void main(String[] args) {
        String s1 = "hello";

        ValueTransTest_11 test = new ValueTransTest_11();
        test.change(s1);
        System.out.println(s1);//hello,String存在方法区中的常量池，s1存的也是地址值，hello是被char型数组存的。s=s1，将这个char型数组的地址值赋给s，s=xx
    }

    public void change(String s){
        s = "hi~~";//相当于重新new了一个
    }
}

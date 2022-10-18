package com.dustin.method;

import java.util.Date;

/**
 * @Project JavaSEReview
 * @Package com.dustin.method
 * @ClassName MethodArgsTest_3
 * @Description 可变形参
 * @Date 2022/9/16   22:43
 * @Created by Dustin_Peng
 */
public class MethodArgsTest_3 {
    public static void main(String[] args) {
        MethodArgsTest_3 test3 = new MethodArgsTest_3();
        test3.show("你好");
        test3.show("你好", "world");
        test3.show();
    }
    public void show(int i){}
    public void show(String s) {
    }

    public void show(String... strs) {//可变个数的形参
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

    public void show(int i,String ... strs){}

//    public void show(String[] strs) {
//    }
}

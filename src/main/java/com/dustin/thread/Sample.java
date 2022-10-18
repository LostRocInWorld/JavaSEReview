package com.dustin.thread;

/**
 * @author Dustin_Peng
 * @Description 是否是多线程呢
 * @create 2022-09-28-03:05
 */
public class Sample {
    public void method1(String str){
        System.out.println("str = " + str);
    }

    public void method2(String str){
        method1(str);
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        s.method2("hello");
    }
}

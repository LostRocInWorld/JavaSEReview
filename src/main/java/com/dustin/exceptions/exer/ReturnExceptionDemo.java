package com.dustin.exceptions.exer;

import javax.management.RuntimeMBeanException;

/**
 * @Project JavaSEReview
 * @Package com.dustin.exceptions.exer
 * @ClassName ReturnExceptionDemo
 * @Description 练习1
 * @Date 2022/9/26   23:30
 * @Created by Dustin_Peng
 */
public class ReturnExceptionDemo {
    static void methodA() {
        try {
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常");
        } finally {
            System.out.println("调用A的方法的finally");
        }
    }

    static void methodB() {
        try {
            System.out.println("进入方法B");
            return;
        } finally {
            System.out.println("调用B的方法的finally");
        }
    }

    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        methodB();
    }
}

package com.dustin.exceptions;

import java.io.IOException;

/**
 * @Project JavaSEReview
 * @Package com.dustin.exceptions
 * @ClassName OverrideTest
 * @Description 重写方法的异常抛出
 * @Date 2022/9/24   04:46
 * @Created by Dustin_Peng
 */
public class OverrideTest {
    public static void main(String[] args) {
        display(new SubClass());
    }
    public static void display(SuperClass s) {
        try {
            s.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

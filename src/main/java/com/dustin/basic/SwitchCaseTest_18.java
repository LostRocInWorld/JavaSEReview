package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName SwitchCaseTest
 * @Description switch-case结构
 * @Date 2022/9/9   23:35
 * @Created by Dustin_Peng
 */
public class SwitchCaseTest_18 {
    public static void main(String[] args) {
        int num = 5;
        switch (num) {
            default:
                System.out.println("other");
            case 0:
                System.out.println("zero");
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }
    }
}

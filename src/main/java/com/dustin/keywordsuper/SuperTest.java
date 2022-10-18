package com.dustin.keywordsuper;

/**
 * @Project JavaSEReview
 * @Package com.dustin.keywordsuper
 * @ClassName SuperTest
 * @Description super关键字的使用
 * @Date 2022/9/20   22:59
 * @Created by Dustin_Peng
 */
public class SuperTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
        s.study();

        Student s1 = new Student("Tom", 21, "IT");

    }
}

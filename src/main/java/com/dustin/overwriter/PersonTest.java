package com.dustin.overwriter;

/**
 * @Project JavaSEReview
 * @Package com.dustin.overwriter
 * @ClassName PersonTest
 * @Description 方法重写
 * @Date 2022/9/20   21:53
 * @Created by Dustin_Peng
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student();
        s.eat();
        s.walk(10);

        s.show();
    }
}

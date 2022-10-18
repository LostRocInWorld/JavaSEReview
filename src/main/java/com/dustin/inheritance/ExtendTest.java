package com.dustin.inheritance;

/**
 * @Project JavaSEReview
 * @Package com.dustin.inheritance
 * @ClassName ExtendTest
 * @Description 继承性
 * @Date 2022/9/20   03:17
 * @Created by Dustin_Peng
 */
public class ExtendTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Student s1 = new Student();
        s1.name="靓仔";
        s1.eat();
        s1.setAge(10);
        System.out.println(s1.getAge());

        //间接继承
        s1.breath();

        Creature c = new Creature();
        c.breath();
        c.equals(1);
    }
}

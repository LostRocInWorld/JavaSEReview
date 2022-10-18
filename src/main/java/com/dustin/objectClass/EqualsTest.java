package com.dustin.objectClass;

import com.dustin.keywordsuper.Student;

import java.util.Date;

/**
 * @Project JavaSEReview
 * @Package com.dustin.objectClass
 * @ClassName EqualsTest
 * @Description "=="和equals的区别
 * @Date 2022/9/21   04:32
 * @Created by Dustin_Peng
 */
public class EqualsTest {
    public static void main(String[] args) {
        //==运算符
            //基本数据类型
        int i =10,j =10;
        System.out.println(i == j);//true
        double d = 10.0;
        System.out.println(i == d);//true ,自动类型提升

        char c = 10;
        System.out.println(c==i);//true

        char c1 ='A';
        char c2 =65;
        System.out.println(c1 == c2);//true

            //引用数据类型
        Student s1 = new Student("张三", 24, "IT");
        Student s2 = new Student(null, 24, "IT");

        String str1 = new String("dustin");
        String str2 = new String("dustin");
        System.out.println(s1 == s2);//false
        System.out.println("str1 == str2为"+(str1 == str2));//false

        System.out.println(s1.equals(s2));//false---重写后变成了true
        System.out.println(str1.equals(str2));//true

        Date d1 = new Date(323233232L);
        Date d2 = new Date(323233232L);
        System.out.println(d1.equals(d2));//true


        System.out.println(s1.toString());

    }
}

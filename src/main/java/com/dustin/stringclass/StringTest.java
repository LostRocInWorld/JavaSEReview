package com.dustin.stringclass;

import org.junit.Test;

/**
 * @author Dustin_Peng
 * @Description String类
 * @create 2022-09-30-04:26
 */
public class StringTest {
    /**
     * String字符串，使用一对双引号""引起来表示
     */
    @Test
    public void test1() {
        //直接=重新赋值
        String s1 = "abc";//字面量的定义方式
        String s2 = "abc";
        System.out.println(s1 == s2);//比较s1与s2的地址值
        s1 = "hello";
        System.out.println(s1);//hello
        System.out.println(s2);//abc

        //连接操作重新赋值
        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);
        System.out.println(s2);
        System.out.println(s2 == s3);

        //调用replace后
        String s4 = "abc";
        String s5 = s4.replace('a', 'm');
        System.out.println(s4);
        System.out.println(s5);
    }

    @Test
    public void test2() {
        //方式一：通过字面量定义的方式，此时s1和s2的数据声明在方法区中的字符串常量池中
        String s1 = "abc";
        String s2 = "abc";

        //方式二：通过new + 构造器的方式，s3和s4保存的地址值，是数据在堆空间中开辟空间后对应的地址值
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s3 == s4);//false
    }

    @Test
    public void test3() {
        Person p1 = new Person("Tom", 12);
        Person p2 = new Person("Tom", 12);

        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.name == p2.name);//true

        p1.name = "Jerry";
        System.out.println(p2.name);//Tom
        System.out.println(p1.name == p2.name);//false
    }

    @Test
    public void test4() {
        String s1 = "javaEE";
        String s2 = "hadoop";
        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s5 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s7);//false
        System.out.println(s6 == s7);//false

        String s8 = s7.intern();
        System.out.println(s3 == s8);//true
        System.out.println(s7 == s8);//false
    }
    @Test
    public void test5(){
        String s1 = "javaEEhadoop";
        String s2 = "javaEE";
        String s3 = s2+"hadoop";
        System.out.println(s1 == s3);//false
        final String s4 = "javaEE";//常量--意味着在常量池
        String s5 = s4+"hadoop";
        System.out.println(s1 == s5);//true
    }


    String str = new String("good");
    char[] ch = {'t','e','s','t'};

    public void change(String str,char ch[]){
        str = "test ok";
        ch[0] = 'b';
    }
    public static void  main(String[] args){
        StringTest ex = new StringTest();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+"and");
        System.out.print(ex.ch);
    }


}

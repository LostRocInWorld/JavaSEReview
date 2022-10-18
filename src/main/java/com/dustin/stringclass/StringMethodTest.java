package com.dustin.stringclass;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author Dustin_Peng
 * @Description String的常用方法1
 * @create 2022-10-01-01:59
 */
public class StringMethodTest {
    @Test
    public void test1(){
        String s1 = "Hello,world";
        System.out.println(s1.length());//11
        System.out.println(s1.charAt(3));//l
        System.out.println(s1.isEmpty());//false
        System.out.println(s1.toUpperCase());//HELLO,WORLD    s1是不可变的，仍然为原来的字符串

        String s3 = "  hell  o  W orl     d    ";
        String s4 = s3.trim();
        System.out.println("-----" + s3 + "-----");//去除首尾空格
        System.out.println("-----" + s4 + "-----");
    }

    @Test
    public void test2(){
        String s1 = "HelloWorld";
        String s2 = "helloWorld";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s1.concat("abc"));
        System.out.println(s1.compareTo(s2));//负数为s1<s2,0意味着相等,正数为s1>s2，字符串排序
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3,7));//左闭右开
    }

    @Test
    public void test3(){
        String s1 = "helloworld";
        System.out.println(s1.endsWith("ld"));
        System.out.println(s1.startsWith("H"));
        System.out.println(s1.startsWith("ll",2));

        String s2 = "wo";
        System.out.println(s1.contains(s2));
        System.out.println(s1.indexOf(s2));
        System.out.println(s1.indexOf(s2,7));
        String s3 = "l";
        System.out.println(s1.lastIndexOf(s3));
        System.out.println(s1.lastIndexOf(s3,5));
        //什么情况下，indexOf和lastIndexOf返回值一致？存在唯一一个目标子字符串，或不存在
    }

    @Test
    public void test4(){
        String s1 = "林北就爱吃吃雪糕的啦，靠北啦林北";
        System.out.println(s1.replace('北', '东'));
        System.out.println(s1.replace("林北", "猴米"));
        //正则替换
        String s2 = "12hello34world5java789mysql456";
        //把字符串中的数字替换成,，如果结果开头和结尾有,的话去掉
        System.out.println(s2.replaceAll("\\d+", ",").replaceAll("^,|,$",""));
        //匹配
        String s3 = "12345";
        System.out.println(s3.matches("\\d+"));
        //切片
        String s4 ="1323l32322l323l";
        System.out.println(Arrays.toString(s4.split("l")));
    }
}

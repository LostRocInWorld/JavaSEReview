package com.dustin.datetime;

import org.junit.Test;

import java.util.Date;

/**
 * @author Dustin_Peng
 * @Description JDK8之前的日期时间API
 * @create 2022-10-02-01:54
 */
public class DateTimeTest {
    /**
     * System类中的currentTimeMillis()
     */
    @Test
    public void test1() {
        long time = System.currentTimeMillis();//时间戳
        System.out.println(time);//
    }

    /**
     * java.util.Date类
     */

    @Test
    public void test2() {
        //1.两个构造器的使用
        Date date1 = new Date();//返回当前时间
        Date date2 = new Date(1664656490630L);
        //2.两个方法的使用
        System.out.println(date1.toString());
        System.out.println(date1.getTime());
        System.out.println(date2);

        //多态
        Date date3 = new java.sql.Date(1664656490630L);
        java.sql.Date date4 = (java.sql.Date) date3;
        System.out.println(date3);

        Date date5 = new Date(1664656490630L);
//        java.sql.Date date6 = (java.sql.Date) date5;//运行时报错，父类转子类
        java.sql.Date date6 = new java.sql.Date(date5.getTime());
    }
}

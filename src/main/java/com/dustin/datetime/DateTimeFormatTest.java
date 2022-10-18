package com.dustin.datetime;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Dustin_Peng
 * @Description JDK8之前的日期时间API
 * @create 2022-10-03-21:24
 */
public class DateTimeFormatTest {
    /*
SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化和解析
 */
    @Test
    public void test1() throws ParseException {
        //1.默认无参实例化
        SimpleDateFormat sdf = new SimpleDateFormat();
        //2.格式化日期
        Date date = new Date();
        System.out.println(date);
        System.out.println(sdf.format(date));//
        //3.解析
        System.out.println(sdf.parse("2022/3/3 下午 15:38"));
        //4.带参构造器，按照指定的方式格式化和解析
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MMMM.dd GGG hhh:mm:ss");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss zzz");//常用时间格式
        System.out.println(sdf1.format(date));
        System.out.println(sdf1.parse("2022-10-3 21:40:35 UTC"));
    }

    @Test
    public void testExer1() throws ParseException {
        //练习1:字符串"2020-09-08"转换为java.sql.Date对象
        String dateStr1 = "2020-09-08";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf2.parse(dateStr1);
        java.sql.Date date2 = new java.sql.Date(date1.getTime());
        System.out.println(date2);
    }

    /*
    练习2：三天打渔两天晒网。1990-01-01 开始，xxxx-xx-xx，是在打渔还是在晒网?
    举例：2020-09-08在打渔还是晒网?--计算总天数并取模
     */
    @Test
    public void testExer2() throws ParseException {
        //方式一:毫秒数相减
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date start = sdf.parse("1990-01-01");
        Date end = sdf.parse("2020-09-08");
        int totalDay = (int) ((end.getTime() - start.getTime()) / (1000 * 60 * 60 * 24) + 1);
        switch (totalDay % 5) {
            case 1:
            case 2:
            case 3:
                System.out.println("打渔");
                break;
            case 0:
            case 4:
                System.out.println("晒网");
                break;
        }

        //方式二：算整年数再求天数1990-01-01-->2019-12-31+2020-01-01 --> 2020-09-08

    }

    /**
     * Calendar类的使用
     */
    @Test
    public void testCalendar(){
        //1.实例化
        //  方式一：创建其子类（GregorianCalendar）的对象
        //  方式二：调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();

        //2.常用方法
        // get()
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        //  set()
        calendar.set(Calendar.DAY_OF_MONTH,5);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        //add
        calendar.add(Calendar.DAY_OF_MONTH,3);
        calendar.add(Calendar.DAY_OF_MONTH,-10);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        //getTime
        Date date = calendar.getTime();
        System.out.println(date);
        //setTime
        calendar.setTime(new Date());
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
    }

}

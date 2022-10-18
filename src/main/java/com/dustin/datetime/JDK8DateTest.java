package com.dustin.datetime;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * @author Dustin_Peng
 * @Description JDK8中的日期时间API
 * @create 2022-10-03-22:27
 */
public class JDK8DateTest {
    @Test
    public void testDate(){
        //偏移性
        Date date = new Date(2020,9,8);
        System.out.println(date);//Fri Oct 08 00:00:00 IST 3920
    }

    /**
     * 本地日期(LocalDate)丶本地时间(LocalTime)丶本地日期时间(LocalDateTime)
     */
    @Test
    public void testTime(){
        //实例化，now()获取当前的日期，时间，日期时间
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        //of()，获取指定的日期时间，没有偏移量
        LocalDateTime localDateTime = LocalDateTime.of(2022, 10, 6, 22, 51);
        System.out.println(localDateTime);
        //getXxx，获取相关的属性
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());//OCTOBER
        System.out.println(localDateTime.getMonthValue());//10
        System.out.println(localDateTime.getMinute());

        //withXxx，设置时间，不可变性，返回新的对象
        LocalDateTime localDateTime1 = localDateTime.withDayOfMonth(22);
        System.out.println(localDateTime1);

        //plusXxx
        LocalDateTime localDateTime2 = localDateTime1.plusDays(35);
        System.out.println(localDateTime2);
        //minusXxx
        LocalDateTime localDateTime3 = localDateTime1.minusHours(72);
        System.out.println(localDateTime3);
    }

    @Test
    public void testInstant(){
        //实例化，获取格林威治标准时间
        Instant now = Instant.now();//2022-10-03T17:42:09.150Z
        //添加时间的偏移量
        OffsetDateTime offset = now.atOffset(ZoneOffset.ofHours(8));//北京时间采用GMT+8,2022-10-04T01:49:01.123+08:00
        //获取瞬时点的对应的毫秒数（时间戳）
        System.out.println(now.toEpochMilli());
        //ofEpochMilli，通过给定的毫秒数，获得Instant实例
        System.out.println(Instant.ofEpochMilli(1664819480916l));
    }

    /**
     * DateTimeFormatter：格式化或解析日期丶时间
     */
    @Test
    public void testIDateTimeFormatter() {
        //实例化
        //方式一
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //  格式化:日期-->字符串
        LocalDateTime localDateTime = LocalDateTime.now();//2022-10-03T23:32:13.074
        String str1 = formatter.format(localDateTime);//可使用LocalDate,LocalTime,LocalDateTime，他们间接实现了TemporalAccessor接口
        System.out.println(str1);//2022-10-03T23:32:13.074
        //  解析
        TemporalAccessor dateTime = formatter.parse(str1);//{},ISO resolved to 2022-10-03T23:33:40.235
        System.out.println(dateTime);

        //方式二
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        //  格式化
        String str2 = formatter1.format(localDateTime);//2022年10月3日 下午11時39分11秒

        //方式三
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss E");
        String str3 = formatter2.format(LocalDateTime.now());//2022/10/03 11:42:21 星期一
        System.out.println(str3);
        //  解析
        System.out.println(formatter2.parse("2022/10/03 18:45:25 星期一"));//{},ISO resolved to 2022-10-03T18:45:25}
        System.out.println(formatter2.parse(str3));//{},ISO resolved to 2022-10-03T23:48:59
    }
}

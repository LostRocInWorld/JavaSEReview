package com.dustin.kwabstract.exer2;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwabstract.exer2
 * @ClassName MyDate
 * @Description 模板方法设计模式，抽象练习
 * @Date 2022/9/23   04:30
 * @Created by Dustin_Peng
 */
public class MyDate {
    private int year;
    private int month;;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toDateString(){
        return year+"年"+month+"月"+day+"日, ";
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return toDateString();
    }
}

package com.dustin.kwabstract.exer2;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwabstract.exer2
 * @ClassName HourlyEmployee
 * @Description 模板方法设计模式，抽象练习
 * @Date 2022/9/23   04:37
 * @Created by Dustin_Peng
 */
public class HourlyEmployee extends Employee {
    /**
     * 每小时工资
     */
    private int wage;
    /**
     * 工作小时
     */
    private int hour;

    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
        this(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earning() {
        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                super.toString()+
                "wage=" + wage +
                ", hour=" + hour +
                '}';
    }
}

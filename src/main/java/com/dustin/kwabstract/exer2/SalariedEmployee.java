package com.dustin.kwabstract.exer2;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwabstract.exer2
 * @ClassName SalariedEmployee
 * @Description 模板方法设计模式，抽象练习
 * @Date 2022/9/23   04:33
 * @Created by Dustin_Peng
 */
public class SalariedEmployee extends Employee {
    private double monthSalary;

    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthSalary) {
        this(name, number, birthday);
        this.monthSalary = monthSalary;
    }

    @Override
    public double earning() {
        return monthSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                super.toString() +
                "monthSalary=" + monthSalary +
                '}';
    }
}

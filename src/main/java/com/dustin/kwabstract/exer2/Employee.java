package com.dustin.kwabstract.exer2;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwabstract.exer2
 * @ClassName Employee
 * @Description 模板方法设计模式，抽象练习
 * @Date 2022/9/23   04:29
 * @Created by Dustin_Peng
 */
public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public abstract double earning();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday;
    }
}

package com.dustin.project3.domain;

/**
 * @Project JavaSEReview
 * @Package com.dustin.project3.team.domain
 * @ClassName Employee
 * @Description 雇员JavaBean
 * @Date 2022/9/27   01:28
 * @Created by Dustin_Peng
 */
public class Employee {
    //    10, id, name, age, salary
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    String getDetails(){
        return id+"\t"+name+"\t"+age+"\t"+salary+"\t";
    }
    @Override
    public String toString() {
        return  getDetails();
    }
}

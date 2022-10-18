package com.dustin.collectionclass.treesetexer;


import org.junit.Test;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Dustin_Peng
 * @Description TreeSet练习
 * @create 2022-10-06-23:53
 */
public class TreeSetExer {
    @Test
    public void test1(){
        Employee e1 = new Employee("Jerry", 24, new MyDate(2019, 12, 8));
        Employee e2 = new Employee("Dick", 45, new MyDate(1977, 11, 3));
        Employee e3 = new Employee("Mary", 17, new MyDate(1988, 1, 2));
        Employee e4 = new Employee("Jenny", 68, new MyDate(1929, 2, 9));
        Employee e5 = new Employee("Bob", 35, new MyDate(1998, 3, 5));
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;
                    return compareBirthDay(e1.getBirthday(),e2.getBirthday());
                }
                throw new ClassCastException("数据类型不匹配");
            }
        });
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public int compareBirthDay(MyDate d1,MyDate d2){
        LocalDate date1 = LocalDate.of(d1.getYear(), d1.getMonth(), d1.getDay());
        LocalDate date2 = LocalDate.of(d2.getYear(), d2.getMonth(), d2.getDay());
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        int compare = date1.compareTo(date2);
        System.out.println(compare);
        return compare;
    }

}
class Employee implements Comparable{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Employee){
            Employee e = (Employee) o;
            return this.getName().compareTo(e.getName());
        }
        throw new ClassCastException("传入类型不匹配");
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
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
        return  year +
                "-" + month +
                "-" + day ;
    }
}
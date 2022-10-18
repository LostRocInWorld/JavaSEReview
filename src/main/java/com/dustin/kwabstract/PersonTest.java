package com.dustin.kwabstract;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwabstract
 * @ClassName PersonTest
 * @Description 抽象类的匿名子类
 * @Date 2022/9/23   03:56
 * @Created by Dustin_Peng
 */
public class PersonTest {
    public static void main(String[] args) {
        //匿名对象
        method(new Student());
        //非匿名类的非匿名对象
        Worker worker = new Worker();
        method1(worker);

        //非匿名类的匿名对象
        method1(new Worker());

        //匿名子类的非匿名对象---p
        Person p = new Person() {
            @Override
            public void walk() {
                System.out.println("弔毛走路");
            }

            @Override
            public void breath() {
                System.out.println("弔毛呼吸");
            }
        };
        method1(p);
        //匿名子类的匿名对象
        method1(new Person() {
            @Override
            public void walk() {
                System.out.println("优雅的走路");
            }

            @Override
            public void breath() {
                System.out.println("优雅的呼吸");
            }
        });
    }

    public static void method(Student s){
        System.out.println("student");
    }

    public static void method1(Person p){
        p.breath();
        p.walk();
    }
}
class Worker extends Person{
    @Override
    public void breath() {
        System.out.println("工人呼吸");
    }

    @Override
    public void walk() {
        System.out.println("工人走路");

    }
}
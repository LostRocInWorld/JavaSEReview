package com.dustin.block;

/**
 * @Project JavaSEReview
 * @Package com.dustin.block
 * @ClassName BlockTest
 * @Description 代码块（或初始化块）
 * @Date 2022/9/23   01:13
 * @Created by Dustin_Peng
 */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;//马上输出Hello,static block
        Person p1 = new Person();//输出Hello,block
        Person p2 = new Person();//输出Hello,block
        System.out.println(p1.age);
        System.out.println(p1.desc);
        Person p3 = new Person("Tom",9);//输出Hello,block
        System.out.println(p3);
    }
}

class Person {
    //属性
    String name;
    int age;
    static String desc = "我是一个人";

    //构造器
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("构造器赋值age");
    }

    //    静态代码块1
    static {
        System.out.println("Hello,static block-1");
        desc = "我是一个高尚的人";
        info();
        //无法调用非静态结构
//        eat();
//        name ="初始";
    }
    //非静态代码块-1
    {
        System.out.println("Hello,block-1");
        //调用非静态结构
        age = 1;
        //调用静态结构
        info();
    }
    //    静态代码块2
    static {
        System.out.println("Hello,static block-2");
    }
    //非静态代码块-2
    {
        System.out.println("Hello,block-2");
        age = 3;
        System.out.println("代码块赋值age");
    }


    //成员方法
    public void eat() {
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //静态方法
    public static void info() {
        System.out.println("我是一个快乐的人");
    }
}

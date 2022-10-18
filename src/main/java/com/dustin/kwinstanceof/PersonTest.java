package com.dustin.kwinstanceof;

import java.util.Date;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwinstanceof
 * @ClassName PersonTest
 * @Description 向下转型，instanceof
 * @Date 2022/9/21   02:58
 * @Created by Dustin_Peng
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Man();
        p1.name = "Tom";
        //不能调用子类特有的方法及属性，编译时，p1是Person类型
//        p1.work();
//        p1.isSmoking = true;
    /*    有了对象的多态性后，实际上内存上已经加载了子类特有的属性和方法的，但是由于变量声明为父类类型，
        导致编译时只能调用父类中声明的属性和方法，子类中特有的属性和方法不能被调用
        */
        //如何调用子类特有的属性和方法
        //使用强制类型转换符进行向下转型
        Man m1 = (Man) p1;
        m1.work();
        m1.isSmoking = true;

        //使用强制转换时，可能出现ClassCastException异常
//        Woman w1 = (Woman)p1;
//        w1.goShopping();

        /*
        关键字-instanceof的使用
        a instanceof A:判断对象a是类A的实例，如果是，返回true，如果不是，返回false
        使用场景：为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，先进行instanceof的判断
         */
        if (p1 instanceof Woman) {
            Woman w1 = (Woman) p1;
            w1.goShopping();
        }

        if (p1 instanceof Object) {}

        //1.编译通过，运行报错
        Person p2 = new Woman();
        Man m2 = (Man)p2;

        Person p3 = new Person();
        Man m3 = (Man)p3;

        //2.编译运行都通过
        Object obj = new Woman();
        Person p4 = (Woman)obj;
        Person p5 = (Person)obj;

        //3.编译都没通过
//        Man m4 = new Woman();
//        String s1 = new Date();

    }
}

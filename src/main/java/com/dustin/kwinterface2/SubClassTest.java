package com.dustin.kwinterface2;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwinterface2
 * @ClassName SubClassTest
 * @Description 接口在JDK8的新特性
 * @Date 2022/9/23   23:47
 * @Created by Dustin_Peng
 */
public class SubClassTest {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        //静态方法无法通过实现类调用，只能通过接口来调用
//        s.method1();
        CompareA.method1();
        //实现类对象调用默认方法
        s.method2();

        //如果实现类继承的父类和接口中声明了同名同参数的方法，那么子类在没有重写此方法的情况下，默认调用的是父类中的同名同参数的方法
        //没有继承的情况下如果实现类实现了多个接口，并且它们定义了同名同参数的默认方法，那么在实现类没有重写此方法的情况下，会编译报错---（接口冲突）
        s.method3();
    }
}
class SubClass extends SuperClass implements CompareA,CompareB{
    //可以重写接口中的默认方法
    @Override
    public void method2() {
        System.out.println("SubClass:method2()");
    }

    public void method3(){
        System.out.println("SubClass:重写method3()");
    }

    public void myMethod(){
        method3();//调用自己定义的重写的方法
        super.method3();//调用的是父类声明的方法
        CompareA.super.method3();//调用接口A中的方法
        CompareB.super.method3();//调用接口B中的方法
    }
}

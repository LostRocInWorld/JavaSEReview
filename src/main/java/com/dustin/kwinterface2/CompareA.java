package com.dustin.kwinterface2;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwinterface2
 * @ClassName CompareA
 * @Description 接口在JDK8的新特性
 * @Date 2022/9/23   23:45
 * @Created by Dustin_Peng
 */
public interface CompareA {
    //静态方法
    public static void method1(){
        System.out.println("compareA：静态方法method1()");
    }

    //默认方法
    default void method2(){//public 可省略
        System.out.println("compareA：默认方法method2()");
    }

    //默认方法
    default void method3(){//public 可省略
        System.out.println("compareA：默认方法method3()");
    }
}

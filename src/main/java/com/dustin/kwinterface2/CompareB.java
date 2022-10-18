package com.dustin.kwinterface2;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwinterface2
 * @ClassName CompareA
 * @Description 接口在JDK8的新特性
 * @Date 2022/9/23   23:45
 * @Created by Dustin_Peng
 */
public interface CompareB {
    //默认方法
    default void method3(){//public 可省略
        System.out.println("compareB：默认方法method3()");
    }
}

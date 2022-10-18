package com.dustin.java8newfeature;

/**
 * @author Dustin_Peng
 * @Description 函数式接口
 * @create 2022-10-18-03:43
 */
@FunctionalInterface
public interface MyInterface {
    void method1();
    default void method2(){
        System.out.println("你好");
    }
}

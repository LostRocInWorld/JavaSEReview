package com.dustin.java8newfeature;

import org.junit.Test;

import java.util.Comparator;

/**
 * @author Dustin_Peng
 * @Description Lambda表达式
 * @create 2022-10-18-03:07
 */
public class LambdaTest {
    @Test
    public void test1(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱中国");
            }
        };
        r1.run();
        //例子1
        Runnable r2 = () -> System.out.println("我吃西红柿");
        r2.run();

    }

    @Test
    public void test2(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        int c1 = com1.compare(12, 21);
        System.out.println(c1);
        //Lambda表达式
        Comparator<Integer> com2 = (o1,o2) -> Integer.compare(o1,o2);
        int c2 = com2.compare(32, 21);
        System.out.println(c2);
        //方法引用
        Comparator<Integer> com3 = Integer:: compare;
        int c3 = com3.compare(32, 21);
    }

}

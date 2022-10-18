package com.dustin.java8newfeature;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author Dustin_Peng
 * @Description Lambda表达式
 * @create 2022-10-18-03:16
 */
public class LambdaTest1 {
    @Test
    public void test1() {
        //1
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱中国");
            }
        };
        Runnable r2 = () -> System.out.println("我吃西红柿");
    }

    @Test
    public void test2() {
        //2
        Consumer<String> con1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con1.accept("你好");
        Consumer<String> con2 = (String s) -> {
            System.out.println(s);
        };
        con2.accept("你不好");
        //3
        Consumer<String> con3 = (s) -> {
            System.out.println(s);
        };
        //4
        Consumer<String> con4 = s -> {
            System.out.println(s);
        };
    }

    @Test
    public void test3() {
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1 + "和" + o2);
                return Integer.compare(o1, o2);
            }
        };
        //5
        Comparator<Integer> com2 = (o1, o2) -> {
            System.out.println(o1 + "和" + o2);
            return Integer.compare(o1, o2);
        };

        //6
        Comparator<Integer> com3 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        Comparator<Integer> com4 = (o1,o2) -> Integer.compare(o1, o2);
    }
}

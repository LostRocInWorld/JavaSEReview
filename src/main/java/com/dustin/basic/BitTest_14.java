package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName BitTest_14
 * @Description 位运算
 * @Date 2022/9/8   04:19
 * @Created by Dustin_Peng
 */
public class BitTest_14 {
    public static void main(String[] args) {
        int i = 21;
        System.out.println("i <<2 = " + (i << 2));
        System.out.println("i <<26 = " + (i << 26));
        System.out.println("i <<27 = " + (i << 27));

        int i1 = 42;
        System.out.println("i >> 2 = " + (i >> 2));

        //经典的面试题(过时的)，最高效的方式计算2 * 8
        int result = 2 << 3;
        int result1 = 8 << 1;

        int m =234324323;
        int n = 12;
        System.out.println("m & n : "+(m & n));
        System.out.println("m | n : "+(m | n));
        System.out.println("m ^ n : "+(m ^ n));
        System.out.println("~m : "+(~m));
        System.out.println(new char[]{'a', 'b'});

    }
}

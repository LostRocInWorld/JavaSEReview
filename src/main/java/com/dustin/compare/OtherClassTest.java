package com.dustin.compare;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author Dustin_Peng
 * @Description 其他常用类的使用
 * System
 * Math
 * BigInteger和BigDecimal
 * @create 2022-10-04-02:26
 */
public class OtherClassTest {
    @Test
    public void test1(){
        String javaHome = System.getProperty("java.home");
        System.out.println("javaHome = " + javaHome);

        String OSName = System.getProperty("os.name");
        System.out.println("OSName = " + OSName);

        BigDecimal a = new BigDecimal("123434.32232485511515");
        BigDecimal b = new BigDecimal("1234.545");
        System.out.println(a.divide(b, 14, BigDecimal.ROUND_HALF_UP));
    }
}

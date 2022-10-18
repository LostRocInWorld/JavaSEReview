package com.dustin.exceptions;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

/**
 * @Project JavaSEReview
 * @Package com.dustin.exceptions
 * @ClassName ExceptionTest
 * @Description Exception
 * @Date 2022/9/24   02:54
 * @Created by Dustin_Peng
 */
public class ExceptionTest {
    //NullPointerException
    @Test
    public void test1() {
        int[] arr = null;
        System.out.println(arr[3]);

        String s = null;
        System.out.println(s.charAt(1));
    }
    //ArrayIndexOutOfBoundsException
    @Test
    public void test2() {
        int[] arr = null;
        System.out.println(arr[3]);

        String str = "abc";
        System.out.println(str.charAt(4));
    }
    //ClassCastException
    @Test
    public void test3() {
        Object date = new Date();
        String str = (String) date;
    }
    //NumberFormatException
    @Test
    public void test4() {
        String str = "abc";
        int i = Integer.parseInt(str);
    }
    //InputMismatchException
    @Test
    public void test5() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
    }
    //ArithmeticException
    @Test
    public void test6() {
        int a = 10;
        int b = 0;
        System.out.println(a/b);
    }

    //java.io.FileNotFoundException
    //java.io.IOException
    @Test
    public void test7() {
//        File file = new File("hello.txt");
//        FileInputStream fis = new FileInputStream(file);
//
//        int data = fis.read();
//        while(data != -1){
//            System.out.println((char)data);
//            data = fis.read();
//        }
//
//        fis.close();
    }
}

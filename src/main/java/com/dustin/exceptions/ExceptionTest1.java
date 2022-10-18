package com.dustin.exceptions;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Project JavaSEReview
 * @Package com.dustin.exceptions
 * @ClassName ExceptionTest1
 * @Description 异常处理机制
 * @Date 2022/9/24   03:31
 * @Created by Dustin_Peng
 */
public class ExceptionTest1 {
    //NumberFormatException
    @Test
    public void test1() {
        String str = "abc";
        try {
            int i = Integer.parseInt(str);
            System.out.println("hello----1");
        } catch (NumberFormatException e) {
            System.out.println("出现数值转换异常");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("出现空指针异常");
        } catch (Exception e) {
            System.out.println("出现异常");
        }
        System.out.println("hello----2");
    }

    @Test
    public void test2() {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
            return;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return;
        } finally {
            System.out.println("执行完毕");
        }
    }

    @Test
    public void test3() {
        FileInputStream fis = null;
        try {
            File file = new File("src/main/java/com/dustin/hello.txt");//从工程路径算省略了/JavaSEReview
            fis = new FileInputStream(file);

            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

package com.dustin.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Project JavaSEReview
 * @Package com.dustin.exceptions
 * @ClassName ExceptionTest2
 * @Description throws方式处理
 * @Date 2022/9/24   04:28
 * @Created by Dustin_Peng
 */
public class ExceptionTest2 {
    public static void main(String[] args) {//还可以抛给虚拟机--相当于没处理
        try {
            method2();
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("读写问题");
            e.printStackTrace();
        }
        method3();
    }

    public static void method3() {
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method2() throws IOException,FileNotFoundException{
        method1();
    }

    public static void method1() throws IOException, FileNotFoundException {
        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while (data != -1) {
            System.out.println((char) data);
            data = fis.read();
        }
        fis.close();

        System.out.println("找到文件了吗？");
    }
}

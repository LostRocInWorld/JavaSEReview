package com.dustin.iostream;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Dustin_Peng
 * @Description IO流
 * @create 2022-10-11-02:59
 */
public class FileReaderWriterTest {
    public static void main(String[] args) {
        File file = new File("hello.txt");//相较于当前Project
        System.out.println(file.getAbsolutePath());
    }

    @Test
    public void test1() {
        //1.实例化File类对象，指明要操作的文件
        File file = new File("hello.txt");//相较于当前Module
        //将hello.txt的文件内容读入并输出到控制台
        //2.提供具体流--使用字符流
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            //3.数据读入
            //read():返回读入的一个字符。如果到达文件末尾，返回-1
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2() {
        //1.实例化File类对象，指明要操作的文件
        File file = new File("hello.txt");//相较于当前Module
        //将hello.txt的文件内容读入并输出到控制台
        //2.提供具体流--使用字符流
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            //3.数据读入
            //read():每次读入char[]数组中的字符的个数。如果到达文件末尾，返回-1
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                //错误写法
//                for (int i = 0; i < cbuf.length; i++) {
//                    System.out.print(cbuf[i]);
//                }
                //方式一
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuf[i]);
                }
                //方式二
                String str = new String(cbuf, 0, len);
                System.out.print(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testFileWriter() {
        //1.实例化File类对象，指明要操作的文件
        File file = new File("hello1.txt");//相较于当前Module
        //将hello.txt的文件内容读入并输出到控制台
        //2.提供FileWriter的对象，用于数据的写出
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            //3.写出的操作
            fr.write("I have a dream!\n");
            fr.write("You also need to have a dream!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流资源的关闭
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void copy() {
        //1.实例化File类对象，指明要写入写出的文件
        File src = new File("hello.txt");//相较于当前Module
        File dest = new File("hello1.txt");//相较于当前Module

        //尝试复制图片，不能使用字符流来处理图片等字节数据.
//        File src = new File("IO1.png");//相较于当前Module
//        File dest = new File("IO1.png");//相较于当前Module
        //2.创建输入输出流
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(src);
            fw = new FileWriter(dest);
            //3.数据的读入和写出操作
            char[] temp = new char[5];
            int len;//记录每次读入到temp数组中的字符个数
            while ((len = fr.read(temp)) != -1) {
                fw.write(temp, 0, len);//每次写出len个字符（读出的字符）
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流资源的关闭--按流的使用倒序关闭
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

package com.dustin.iostream;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Dustin_Peng
 * @Description FileInputStream/FileOutputStream
 * @create 2022-10-11-04:03
 */
public class FileIOStreamTest {
    /**
     * 使用字节流FileInputStream处理文本文件可能出现乱码
     */
    @Test
    public void testFileInputStream() {
        //1.实例化File类对象，指明要操作的文件
        File file = new File("hello.txt");//相较于当前Module
        //将hello.txt的文件内容读入并输出到控制台
        //2.提供具体流--使用字节输入流FileInputStream
        FileInputStream fr = null;
        try {
            fr = new FileInputStream(file);
            //3.数据读入
            byte[] cbuf = new byte[5];
            int len;//记录每次读取的字节个数
            while ((len = fr.read(cbuf)) != -1) {
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

    /**
     * 实现对图片的复制
     */
    @Test
    public void testFileInputOutStream() {
        //1.实例化File类对象
        File src = new File("IO1.png");//相较于当前Module
        File dest = new File("IO3.png");//相较于当前Module
        //2.流对象的实例化
        FileInputStream fi = null;
        FileOutputStream fo = null;
        try {
            fi = new FileInputStream(src);
            fo = new FileOutputStream(dest);
            //复制的过程
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fi.read(buffer)) != -1) {
                fo.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fo != null)
                    fo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fi != null)
                    fi.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void copyFiles(String src,String dest){
        //1.实例化File类对象
        File srcFile = new File(src);//相较于当前Module
        File destFile = new File(dest);//相较于当前Module
        //2.流对象的实例化
        FileInputStream fi = null;
        FileOutputStream fo = null;
        try {
            fi = new FileInputStream(srcFile);
            fo = new FileOutputStream(destFile);
            //复制的过程
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fi.read(buffer)) != -1) {
                fo.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fo != null)
                    fo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fi != null)
                    fi.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testCopy(){
        long start = System.currentTimeMillis();
        copyFiles("IO1.png","IO3.png");
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}

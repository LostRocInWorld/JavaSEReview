package com.dustin.iostream;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Dustin_Peng
 * @Description RandomAccessFile类
 * @create 2022-10-12-22:19
 */
public class RandomAccessFileTest {
    @Test
    public void test1() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("IO1.png", "r");
        RandomAccessFile raf2 = new RandomAccessFile("IO2.png", "rw");
        byte[] buffer = new byte[1024];
        int len;
        while ((len = raf1.read(buffer)) != -1) {
            raf2.write(buffer, 0, len);
        }
        raf2.close();
        raf1.close();
    }

    @Test
    public void test2() throws IOException {
        File file = new File("hello.txt");
        RandomAccessFile rafw = new RandomAccessFile(file, "rw");
        rafw.seek(3);//将文件记录指针指定到3的位置
        rafw.write("xyz".getBytes());
        rafw.seek(file.length());//将文件记录指针指定文件末尾
        rafw.write("dddd".getBytes());
        if (rafw != null) {
            rafw.close();
        }
    }

    @Test
    public void test3() throws IOException {
        File file = new File("hello.txt");
        RandomAccessFile rafw = new RandomAccessFile(file, "rw");
        StringBuilder builder = new StringBuilder((int) file.length());
        byte[] temp = new byte[1024];
        int len;
        rafw.seek(3);//将文件记录指针指定到3的位置
        while ((len = rafw.read(temp)) != -1) {
            builder.append(new String(temp,0,len));//保存指针3之后的数据
        }
        rafw.seek(3);//调回指针
        rafw.write("xyzddd".getBytes());
        System.out.println(rafw.getFilePointer());
        //将builder的数据写入其中
        rafw.write(builder.toString().getBytes());
        if (rafw != null)
            rafw.close();
    }
}

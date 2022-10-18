package com.dustin.iostream;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/**
 * @author Dustin_Peng
 * @Description 其它流的使用
 * 1.标准的输入输出流
 * 2.打印路
 * 3.数据流
 * @create 2022-10-12-02:38
 */
public class OtherStreamTest {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //方法一，使用Scanner实现，调用next()方法返回字符串
        //方法二，使用System.in实现。System.in--->转换流--->BufferedReader的readLine()
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            while (true) {
                System.out.print("请输入字符串:");
                String data = br.readLine();
                if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)) {
                    System.out.println("程序结束");
                    break;
                }
                data.toUpperCase();
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /**
     * 打印流PrintStream和PrintWriter
     */
    @Test
    public void test1(){
        PrintStream ps = null;
        try {
            FileOutputStream fo = new FileOutputStream("print.txt");//注意文件可不存在，但目录必须存在
            ps = new PrintStream(fo, true);
            System.setOut(ps);//把标准输出流（控制台）更改成文件
            for (int i = 0; i < 255; i++) {//输出0-255的ASCII码
                System.out.print((char)i);
                if(i % 50 == 0){//每隔50个换行
                    System.out.println();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ps!=null)
                ps.close();
        }
    }
    /**
     * 数据流：DataInputStream和DataOutputStream
     */

    @Test
    public void test2() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("dataoutput.log"));
        dos.writeUTF("你好");
        dos.flush();//显示刷新，存入文件
        dos.writeBoolean(true);
        dos.flush();
        dos.writeInt(2332);
        dos.flush();

        if(dos != null)
        dos.close();
    }


    @Test
    public void test3() throws IOException {
        //将文件中存储的基本数据类型变量和String类型读取到内存中，保存到变量
        DataInputStream dis = new DataInputStream(new FileInputStream("dataoutput.log"));
        String desc = dis.readUTF();//只能按顺序读取
        boolean bol = dis.readBoolean();
        int num = dis.readInt();

        System.out.println("num = " + num);
        System.out.println("desc = " + desc);
        System.out.println("bol = " + bol);
        if(dis != null)
            dis.close();
    }
}

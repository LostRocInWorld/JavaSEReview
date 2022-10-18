package com.dustin.iostream;

import org.junit.Test;

import java.io.*;

/**
 * @author Dustin_Peng
 * @Description 转换流
 * @create 2022-10-12-01:15
 */
public class InputStreamWriterTest {
    @Test
    public void test1() throws IOException {
        //InputStreamReader的使用，实现字节的输入流到字符输入流的转换。需要使用try-catch进行处理
        FileInputStream fis = new FileInputStream("wktype.txt");
        InputStreamReader isr = new InputStreamReader(fis);//使用系统默认字符集
//        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");//参数2指明字符集。使用哪个字符集取决于文件保存时使用的字符集
        char[] cubf = new char[20];
        int len;
        while ((len = isr.read(cubf)) != -1) {
            String str = new String(cubf, 0, len);
            System.out.print(str);
        }
        isr.close();
    }

    /**
     * 更换字符集
     */
    public void changeCharSet(String src, String dest) {
        //1.创建文件对象与输入输出流
        File srcFile = new File(src);
        File destFile = new File(dest);

        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            isr = new InputStreamReader(fis, "UTF-8");
            osw = new OutputStreamWriter(fos, "GBK");
            //2.读写过程
            char[] buffer = new char[20];
            int len;
            while ((len = isr.read(buffer)) != -1) {
                osw.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.流的关闭
            if (osw != null) {
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test2(){
        changeCharSet("wktype暫記.txt","wktype_gbk.txt");
    }

}

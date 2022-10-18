package com.dustin.iostream;

import org.junit.Test;

import java.io.*;

/**
 * @author Dustin_Peng
 * @Description 缓冲流的使用--处理流之一
 * @create 2022-10-11-22:39
 */
public class BufferedTest {
    /*
    非文本文件的复制
     */
    @Test
    public void testBuffer() {

        // 2.关闭外层流的同时，内层流也会自动进行关闭，关于内层流的关闭，我们可以省略
//        if(fos != null){
//            fos.close();
//        }
//        if(fis != null){
//            fis.close();
//        }
    }


    public void copyBufferedFile(String src, String dest) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1.文件对象
            File srcFile = new File(src);
            File destFile = new File(dest);
            //2.造流
            //2.1节点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);
            //2.2缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            //3.复制：读取和写入
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
//                bos.flush();//刷新缓冲区，在缓冲流的write方法自动调用这个方法
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流
            // 1.要求先关闭外层处理流，再关闭内层流
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testCopyBuffer() {
        long start = System.currentTimeMillis();
        copyBufferedFile("IO1.png", "IO4.png");
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    /**
     * 使用BufferedReader和BufferedWriter实现文本文件的复制
     */
    @Test
    public void testBufferedReaderWriter() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            //1.文件对象
            File srcFile = new File("wktype暫記.txt");
            File destFile = new File("wktype.txt");
            //2.造流
            //2.1节点流
            FileReader fr = new FileReader(srcFile);
            FileWriter fw = new FileWriter(destFile);
            //2.2缓冲流
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            //3.复制：读取和写入
            //方式一
//            char[] buffer = new char[1024];
//            int len;
//            while ((len = br.read(buffer)) != -1) {
//                bw.write(buffer, 0, len);
////                bw.flush();//刷新缓冲区，在缓冲流的write方法自动调用这个方法
//            }
            //方式二
            String data;
            while ((data = br.readLine()) != null) {
                //方法1
//                bw.write(data+"\n");//data中不包含换行符
                //方法2
                bw.write(data);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流
            // 1.要求先关闭外层处理流，再关闭内层流
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

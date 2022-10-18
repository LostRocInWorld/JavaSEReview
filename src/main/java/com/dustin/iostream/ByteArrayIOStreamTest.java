package com.dustin.iostream;

import org.junit.Test;

import java.io.*;

/**
 * @author Dustin_Peng
 * @Description ByteArrayIOStream
 * @create 2022-10-13-05:21
 */
public class ByteArrayIOStreamTest {
    @Test
    public void test1() throws IOException {
        FileInputStream is = null;
        ByteArrayOutputStream bos = null;
        try {
            File file = new File("result.txt");
            //创建输入流读入内存
            is = new FileInputStream(file);
            //创建字节数组输出流拿到读的数据，不指定参数默认为32字节
            bos = new ByteArrayOutputStream();
            int data;
            while ((data = is.read()) != -1) {
                bos.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(bos);
            closeStream(is);
        }
        byte[] result = bos.toByteArray();
        System.out.println(new String(result));
        FileOutputStream fos = null;
        ByteArrayInputStream bis = null;
        try {
            fos = new FileOutputStream(new File("new-result.txt"));
            bis = new ByteArrayInputStream(result);
            int len;
            byte[] buffer = new byte[1024];
            while ((len = bis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(bis);
        }
    }

    private void closeStream(Closeable s) {
        if (s != null) {
            try {
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

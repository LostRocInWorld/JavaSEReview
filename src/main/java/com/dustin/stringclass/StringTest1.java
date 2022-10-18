package com.dustin.stringclass;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author Dustin_Peng
 * @Description String与其他类型的转换
 * @create 2022-10-01-02:52
 */
public class StringTest1 {

    @Test
    public void test1(){
        //String --> char[]:调用String的toCharArray()
        String str1 = "abc123";
        System.out.println(Arrays.toString(str1.toCharArray()));
        //char[] --> String:调用String的构造器
        char[] arr = {'1','2','h','3','e'};
        String str2 = new String(arr);
        System.out.println(str2);
    }

    @Test
    public void test2() throws java.io.UnsupportedEncodingException{
        //String ---> byte[]
        String str1 = "中国,123";//UTF-8中一个汉字占3个字节
        byte[] utf8 = str1.getBytes();//使用默认字符集进行转换
        byte[] gbks = str1.getBytes("GBK");//使用GBK字符集进行编码，一个汉字2个字节
        /*
        编码:字符串--->字节(看得懂的--->看不懂的二进制数据)
        解码:编码的逆过程，字节--->字符串(看不懂的二进制数据--->看得懂的)
         */
        System.out.println(Arrays.toString(utf8));
        System.out.println(Arrays.toString(gbks));
        //byte[] ---> String
        String str2 = new String(utf8);//使用默认字符集进行解码
        System.out.println(str2);
        System.out.println(new String(gbks));//�й�,123      出现乱码，编码集和合解码集不一致
        System.out.println(new String(gbks,"gbk"));
    }
}

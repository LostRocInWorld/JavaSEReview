package com.dustin.stringclass;

import org.junit.Test;

/**
 * @author Dustin_Peng
 * @Description 字符串相关的类--StringBuffer和StringBuilder类
 * @create 2022-10-02-00:43
 */
public class StringBufferBuilderTest {
    @Test
    public void test1() {
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0, 'm');
        System.out.println(sb1);

        String s1 = new String();//char[] value = new char[0]
        String s2 = new String("abc");//最终结果相当于char[] value = new char[]{'a','b','c'}

        StringBuffer sb = new StringBuffer();//底层创建了长度16的的字符数组，char[] value = new char[capacity],capacity=16
        //sb.length() 等于？0
        System.out.println(sb.length());//length() return count
        sb.append('a');//相当于value[0] = 'a'
        sb.append('b');//相当于value[1] = 'b'
        StringBuffer sb2 = new StringBuffer("abc");//char[] value = new char["abc".length()+16]
        sb2.append("sd");
        //问题1:sb2.length()等于?3
        System.out.println(sb2.length());
        //问题2:扩容问题，如果要添加的数据底层数组盛不下了，那就需要扩容底层的数组。
        // 默认情况下扩容为原来容量的2倍+2，同时将原来数组的元素复制到新的数组中
    }

    @Test
    public void test2() {
        StringBuffer sb1 = new StringBuffer();
        sb1.append(1);//1
        sb1.append('1');//11
        sb1.append("abc");//11abc
        sb1.delete(1, 3);//1c
        sb1.replace(0, 2, "hello");//helloc
        sb1.insert(1, false);//hfalseelloc
        sb1.reverse();//colleeslafh
        sb1.subSequence(1, 3);//ol
    }

    @Test
    public void test3() {
        //初始设置
        long startTime = 0L;
        long endTime = 0L;
        String text = "";
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");
        //开始比对
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer执行时间：" + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder执行时间：" + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text =text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String执行时间：" + (endTime - startTime));


    }


}

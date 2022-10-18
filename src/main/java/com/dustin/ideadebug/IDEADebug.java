package com.dustin.ideadebug;

import org.junit.Test;

/**
 * @author Dustin_Peng
 * @Description 笔试题
 * @create 2022-10-02-05:00
 */
public class IDEADebug {
    @Test
    public void testStringBuffer(){
        String str = null;
        StringBuffer sb = new StringBuffer();//char[16]
        sb.append(str);//调用AbstractStringBuilder的appendNull()方法将字符串null加进去

        System.out.println(sb.length());//4
        System.out.println(sb);//"null"

        StringBuffer sb1 = new StringBuffer(str);//空指针异常
        System.out.println(sb1);
    }
}

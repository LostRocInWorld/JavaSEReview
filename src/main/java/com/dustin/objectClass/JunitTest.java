package com.dustin.objectClass;

import org.junit.Test;
/**
 * @Project JavaSEReview
 * @Package com.dustin.objectClass
 * @ClassName JunitTest
 * @Description JUnit单元测试
 * @Date 2022/9/21   23:15
 * @Created by Dustin_Peng
 */
public class JunitTest {
    int num = 10;
    @Test
    public void testEquals(){
        String s1 ="MM";
        String s2 ="MM";
        System.out.println(s1.equals(s2));
    }
    @Test
    public void show(){
        System.out.println(num);
    }

    @Test
    public void testToString(){
        String s2 ="MM";
        System.out.println(s2.toString());
    }
}

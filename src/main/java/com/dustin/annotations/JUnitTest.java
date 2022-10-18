package com.dustin.annotations;

import org.junit.*;

/**
 * @author Dustin_Peng
 * @Description 常用注解的实例--JUnit
 * @create 2022-10-04-04:52
 */
public class JUnitTest {
    private static Object[] array;
    private static int total;

    @BeforeClass
    public static void init(){
        System.out.println("初始化数组");
        array = new Object[5];
    }

    @Before
    public void before(){
        System.out.println("调用之前total = "+total);
    }

    @Test
    public void add(){
        System.out.println("add");
        array[total++] = "hello";
    }

    @After
    public void after(){
        System.out.println("调用之后total = "+total);
    }

    @AfterClass
    public static void destroy(){
        array = null;
        System.out.println("销毁数组");
    }
}
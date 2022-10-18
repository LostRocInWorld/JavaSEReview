package com.dustin.reflection;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Dustin_Peng
 * @Description ClassLoader
 * @create 2022-10-14-04:36
 */
public class ClassLoaderTest {
    @Test
    public void test1(){
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@58644d46
        ClassLoader classLoader1 = classLoader.getParent();//sun.misc.Launcher$ExtClassLoader@2a84aee7
        System.out.println(classLoader1);//扩展类加载器
        ClassLoader classLoader2 = classLoader1.getParent();//null,无法获取
        ClassLoader classLoader3 = String.class.getClassLoader();
        System.out.println(classLoader3);//null
    }

    @Test
    public void test2() throws IOException {
        //方式一：此时的文件默认在当前module下
        Properties props = new Properties();
        props.load(new FileInputStream("jdbc.properties"));
        String name = props.getProperty("name");
        String age = props.getProperty("age");
        System.out.println("name = "+name +" ;age = " + age);
        //方式二:此时的路径在当前类所在的src下
        Properties props1 = new Properties();
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc1.properties");
        props1.load(is);
        String name1 = props1.getProperty("name");
        String age1 = props1.getProperty("age");
        System.out.println("name1 = "+name1 +" ;age1 = " + age1);
    }
}

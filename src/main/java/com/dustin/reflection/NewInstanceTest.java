package com.dustin.reflection;

import org.junit.Test;

import java.util.Random;

/**
 * @author Dustin_Peng
 * @Description 通过反射创建对应的运行时类的对象
 * @create 2022-10-17-22:07
 */
public class NewInstanceTest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        Class<Person> clazz = Person.class;
        //1.newInstance():调用此方法创建对应的运行时类的对象，内部调用了运行时类的空参构造器。要想此方法正常创建运行时类对象，要求
//        （1）运行时类必须提供空参的构造器
//        （2）空参的构造器的访问权限要够，通常设置为public
        Person obj = clazz.newInstance();
        System.out.println(obj);
    }

    //反射的动态性
    @Test
    public void test2() {
        int num = new Random().nextInt(3);
        String classpath = "";
        switch (num){
            case 0:
                classpath = "java.util.Date";
                break;
            case 1:
                classpath = "com.dustin.reflection.Person";
                break;
            case 2:
                classpath = "java.lang.Object";
                break;
        }

        Object obj = null;
        try {
            obj = getInstance(classpath);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(obj);
    }

    //创建一个指定类的对象
    public Object getInstance(String classpath) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName(classpath);
        return clazz.newInstance();
    }
}

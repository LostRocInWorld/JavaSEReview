package com.dustin.reflection;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author Dustin_Peng
 * @Description 反射获取当前运行时类的属性
 * @create 2022-10-17-22:40
 */
public class FiledTest {
    @Test
    public void test1(){
        Class<Student> clazz = Student.class;
        //获取属性结构
        //getFields()
        Field[] fields = clazz.getFields();
        for(Field f : fields){
            System.out.println(f);
        }
        //getDeclaredFields()
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f : declaredFields){
            System.out.println(f);
        }
    }

    @Test
    public void test2(){
        //属性的结构：权限修饰符 数据类型 变量名
        Class<Student> clazz = Student.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f : declaredFields){
            //1.权限修饰符
            int modifiers = f.getModifiers();
            System.out.print("权限修饰符："+Modifier.toString(modifiers)+",\t");
            //2.数据类型
            Class<?> type = f.getType();
            System.out.print("类型："+type+",\t");
            //3.变量名
            String name = f.getName();
            System.out.println("变量名："+name);
        }
    }
}

package com.dustin.reflection;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Dustin_Peng
 * @Description 反射获取构造器
 * @create 2022-10-17-23:20
 */
public class OtherTest {
    @Test
    public void test1() {
        //获取构造器
        Class<Student> clazz = Student.class;
        //getConstructors()
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor c: constructors) {
            System.out.println(c);
        }
        //getDeclaredConstructors()
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor c: declaredConstructors) {
            System.out.println(c);
        }
    }

    /**
     * 获取运行时类的父类
     */
    @Test
    public void test2() {
        Class<Student> clazz = Student.class;
        //getSuperclass()
        Class<? super Student> superclass = clazz.getSuperclass();//class com.dustin.reflection.Creature
        System.out.println(superclass);
    }

    /**
     * 获取运行时类的带泛型父类
     */
    @Test
    public void test3() {
        Class<Student> clazz = Student.class;
        //getGenericSuperclass()
        Type genericSuperclass = clazz.getGenericSuperclass();//com.dustin.reflection.Creature<java.lang.String>
        System.out.println(genericSuperclass);
    }

    /**
     * 获取运行时类的带泛型父类的泛型
     */
    @Test
    public void test4() {
        Class<Student> clazz = Student.class;
        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType paramType = (ParameterizedType) genericSuperclass;
        Type[] typeArguments = paramType.getActualTypeArguments();
        System.out.println(typeArguments[0].getTypeName());//java.lang.String
        System.out.println(((Class)typeArguments[0]).getSimpleName());//String
    }

    /**
     * 获取运行时类实现的接口
     */
    @Test
    public void test5() {
        Class<Student> clazz = Student.class;
        //getInterfaces()
        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class c: interfaces) {
            System.out.println(c);
        }
        //获取运行时类的父类的接口
        Class<?>[] interfaces1 = clazz.getSuperclass().getInterfaces();
    }
    @Test
    public void test6() {
        //获取运行时类所在的包
        Class<Student> clazz = Student.class;
        Package pack = clazz.getPackage();//package com.dustin.reflection
        System.out.println(pack);
    }
    //运行时类上声明的注解
    @Test
    public void test7() {
        Class<Student> clazz = Student.class;
        Annotation[] annotations = clazz.getAnnotations();
        System.out.println(annotations[0]);
    }

}

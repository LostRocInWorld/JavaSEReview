package com.dustin.reflection;

import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Dustin_Peng
 * @Description 反射
 * @create 2022-10-14-02:48
 */
public class ReflectionTest {

    /**
     * 反射之前的操作
     */
    @Test
    public void testBeforeReflection(){
        //1.创建Person对象
        Person p1 = new Person("Jack", 19);
        //2.通过对象，调用其内部的属性和方法
        p1.age = 10;
        System.out.println(p1);
        p1.show();
        //在Person类外部，不可以通过Person类对象调用其内部私有的结构
        //比如：name,showNation()以及私有的构造器--封装性
    }

    /**
     * 通过反射
     */
    @Test
    public void testAfterReflection() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<Person> clazz = Person.class;
        Constructor<Person> cons = clazz.getConstructor(String.class, int.class);
        Person p = cons.newInstance("Tom", 12);
        System.out.println(p);
        //通过反射调用类的属性和方法
        //调用属性
        Field age = clazz.getDeclaredField("age");
        age.set(p,16);
        System.out.println(p);
        //调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);
        //通过反射，调用Person类的私有结构，如方法丶属性丶构造器
        //调用私有的构造器
        Constructor<Person> cons2 = clazz.getDeclaredConstructor(String.class);
        cons2.setAccessible(true);//设置可访问
        Person p1 = cons2.newInstance("Hommie");
        System.out.println(p1);
        //调用私有的属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"韩梅梅");
        System.out.println(p1);
        //调用私有的方法
        Method showNation = clazz.getDeclaredMethod("showNation",String.class);
        showNation.setAccessible(true);
        String nation = (String) showNation.invoke(p1, "爪哇国");
        System.out.println(nation);
    }
    @Test
    public void testClass() throws ClassNotFoundException {
//        获取Class的实例方式
        //方式一：调用运行时类的class属性
        Class<Person> clazz1 = Person.class;
        System.out.println(clazz1);//class com.dustin.reflection.Person
        //方式二：通过运行时类的对象，调用getClass()方法
        Person p1 = new Person();
        Class<? extends Person> clazz2 = p1.getClass();
        //方式三：调用Class静态方法forName(String classpath)，classpath---全类名，可能会抛出ClassNotFoundException
        Class clazz3 = Class.forName("com.dustin.reflection.Person");
        //方式四：使用类的加载器ClassLoader
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class<?> clazz4 = classLoader.loadClass("com.dustin.reflection.Person");
        System.out.println(clazz1 == clazz2);//true
        System.out.println(clazz1 == clazz3);//true
        System.out.println(clazz1 == clazz4);//true

    }

    @Test
    public void testClass2() throws ClassNotFoundException {
        Class<Object> c1 = Object.class;
        Class<Comparable> c2 = Comparable.class;
        Class<String[]> c3 = String[].class;
        Class<int[][]> c4 = int[][].class;
        Class<ElementType> c5 = ElementType.class;//注解
        Class<Override> c6 = Override.class;//注解
        Class<Integer> c7 = int.class;
        Class<Void> c8 = void.class;
        Class<Class> c9 = Class.class;

        //对于数组，只要元素类型和维度一致，就是同一个Class
        int[] a = new int[10];
        int[] b = new int[100];
        Class<? extends int[]> c10 = a.getClass();
        Class<? extends int[]> c11 = b.getClass();
        System.out.println(c10 == c11);//true
    }

    }

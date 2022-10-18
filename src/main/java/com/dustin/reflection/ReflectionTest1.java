package com.dustin.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Dustin_Peng
 * @Description 调用指定结构
 * @create 2022-10-17-23:45
 */
public class ReflectionTest1 {
    @Test
    public void testField() throws Exception {
        Class<Student> clazz = Student.class;
        //创建运行时类的对象
        Student student = clazz.newInstance();
        //获取指定的属性。要求运行时类中属性声明为public，通常此方法不常用
        Field name = clazz.getField("name");
        //设置属性值
        //set()
        //参数1:指明设置哪个对象的属性
        //参数2:将此属性设置成多少
        name.set(student,"xiaoming");
        String sname = (String) name.get(student);
        System.out.println(sname);

    }
    @Test
    public void testField1() throws Exception {
        Class<Student> clazz = Student.class;
        Student student = clazz.newInstance();
        //获取运行时类指定的属性
        Field id = clazz.getDeclaredField("id");
        //保证当前属性是可访问的
        id.setAccessible(true);
        //获取/设置当前属性值
        id.set(student,12);
        System.out.println(id.get(student));
    }

    @Test
    public void testMethod() throws Exception {
        Class<Student> clazz = Student.class;
        Student student = clazz.newInstance();
        //****非静态方法*****
        //1.获取指定某个方法
        //getDeclaredMethod(String name, Class<?>... parameterTypes)
        //name：指明获取的方法名称
        //parameterTypes：指明获取的方法的形参列表
        Method show = clazz.getDeclaredMethod("show", String.class);
        //2.保证当前方法可访问
        show.setAccessible(true);
        //3.调用某个对象的方法
        //invoke(Object obj, Object... args)
        //obj：方法的调用者
        //args：给方法形参赋值的实参
        //invoke方法的返回值即为对应类中调用的方法的返回值
        String nation = (String) show.invoke(student, "CN");
        System.out.println(nation);
    }

    @Test
    public void testStaticMethod() throws Exception {
        Class<Student> clazz = Student.class;
        Method showDesc = clazz.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
        //如果调用的运行时类的方法没有返回值，则此invoke方法返回null
        Object returnVal = showDesc.invoke(clazz);//null
        showDesc.invoke(Student.class);
    }

    /**
     * 调用指定构造器
     */
    @Test
    public void testCons() throws Exception {
        Class<Student> clazz = Student.class;
        //1.获取指定构造器
        //getDeclaredConstructor(Class<?>... parameterTypes)
        //parameterTypes：指明构造器的形参列表类型
        Constructor<Student> con = clazz.getDeclaredConstructor(String.class, int.class);
        //2.保证构造器可访问
        con.setAccessible(true);
        //3.创建运行时类对象
        Student s = con.newInstance("xiaoming", 23);
        System.out.println(s);
    }
}

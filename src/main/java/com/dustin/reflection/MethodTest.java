package com.dustin.reflection;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Dustin_Peng
 * @Description 获取运行时类的方法
 * @create 2022-10-17-22:52
 */
public class MethodTest {
    @Test
    public void test1() {
        //获取方法
        Class<Student> clazz = Student.class;
        //getMethods()
        Method[] methods = clazz.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
        //getDeclaredMethods()
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println(m);
        }
    }

    /**
     * 获取方法内部结构
     *
     * @Xxx 权限修饰符 返回值类型 方法名(参数类型1 形参名1,...) throws XxxException{}
     */
    @Test
    public void test2() {
        Class<Student> clazz = Student.class;
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods) {
            //1.获取方法声明的注解
            Annotation[] annos = m.getAnnotations();
            for (Annotation a : annos) {
                System.out.print("注解：" + a + ",\t");
            }
            //2.权限修饰符
            System.out.print("权限修饰符：" + Modifier.toString(m.getModifiers()) + ",\t");
            //3.返回值类型
            Class<?> returnType = m.getReturnType();
            System.out.print("返回值类型：" + returnType + ",\t");
            //3.方法名
            System.out.print(m.getName() + "(");
            //4.形参列表
            Class<?>[] parameterTypes = m.getParameterTypes();
            if (!(parameterTypes == null || parameterTypes.length == 0)) {
                for (int i = 0; i < parameterTypes.length; i++) {
                    if (i == parameterTypes.length - 1) {
                        System.out.print(parameterTypes[i].getName() + " args_" + i);
                        break;
                    }
                    System.out.print(parameterTypes[i].getName() + " args_" + i + ",");
                }
            }
            System.out.print(") ");
            //抛出异常
            Class<?>[] exceptionTypes = m.getExceptionTypes();
            if (!(exceptionTypes == null || exceptionTypes.length == 0)) {
                System.out.print("throws ");
                for (int i = 0; i < exceptionTypes.length; i++) {
                    if (i == parameterTypes.length - 1) {
                        System.out.print(exceptionTypes[i].getName()+" ");
                        break;
                    }
                    System.out.print(exceptionTypes[i].getName()+ ",");
                }
            }
            System.out.println("{}");
        }
    }
}

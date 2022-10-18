package com.dustin.annotations;

import org.junit.Test;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;

/**
 * @author Dustin_Peng
 * @Description 注解的使用
 * @create 2022-10-05-23:03
 */
public class AnnotationTest {

    public static void main(String[] args) {
        Person student = new Student();
        student.walk();
        @SuppressWarnings("unused")
        int num = 10 ;//Variable 'num' is never used ,num变量灰色代表未使用
        @SuppressWarnings({"unused","rawtypes"})
        ArrayList list = new ArrayList();
    }

    @Test
    public void getAnnotation(){
        Class<Student> clazz = Student.class;
        Annotation[] annotations = clazz.getAnnotations();
        for (int i = 0; i < annotations.length; i++) {
            System.out.println(annotations[i]);
        }
    }
}
//JDK8之前的写法
//@MyAnnotations({@MyAnnotation("hi"),@MyAnnotation("abc")})
@MyAnnotation("hi")
@MyAnnotation("abc")
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public void walk(){
        System.out.println("人走路");
    }

    public void eat(){
        System.out.println("人吃饭");
    }
}

interface Info{
    void show();
}
class Student extends Person implements Info{
    @Override
    public void walk() {
        System.out.println("学生走路");
    }

//    @Override
//    public void show1() {//更改为show1()方法名时，编译时会校验
//
//    }

    @Override
    public void show() {}
}
//TYPE_PARAMETER
class Generic<@MyAnnotation T> {
    //TYPE_USE
    public void show() throws @MyAnnotation IOException {
        ArrayList<@MyAnnotation String> list = new ArrayList<>();
        int num = (@MyAnnotation int)10L;
    }
}
package com.dustin.thread;

/**
 * @author Dustin_Peng
 * @Description 线程安全的懒汉式单例模式
 * @create 2022-09-29-02:37
 */
public class SingletonTest {
    public static void main(String[] args) {

    }
}

class Student {
    private String name;
    private int age;

    private static Student student = null;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Student createInstance(String name, int age) {
        if (student == null) {
            student = new Student(name, age);
        }
        return student;
    }

    public static Student getInstance(String name, int age) {
        //方式一：效率稍差，多个代码块同时进入方法，线程1抢到锁并执行完毕，其他线程进入还需要再判断要不要执行并返回
        synchronized (Student.class) {
            if (student == null) {
                student = new Student(name, age);
            }
            return student;
        }
    }

    public static Student getInstance1(String name, int age) {
        //方式二：效率较高，多个线程进入第一层判断，线程1抢到锁，执行同步代码块，后return；其他线程进去后判断不为null，直接返回
        if (student == null) {
            synchronized (Student.class) {
                if (student == null) {
                    student = new Student(name, age);
                }
            }
        }
        return student;
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        Student.createInstance("靓仔", 3);
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        Student.createInstance("弔毛", 4);
    }
}
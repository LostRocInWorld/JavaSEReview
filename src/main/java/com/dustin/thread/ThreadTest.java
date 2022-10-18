package com.dustin.thread;

/**
 * @author Dustin_Peng
 * @Description 多线程的创建
 * @create 2022-09-28-03:14
 */
public class ThreadTest {
    public static void main(String[] args) {
        //3
        MyThread t1 = new MyThread();
        //4
        t1.start();
        t1.start();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

//1
class MyThread extends Thread {
    @Override
    public void run() {
        //2.遍历100以内的偶数
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
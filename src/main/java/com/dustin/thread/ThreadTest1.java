package com.dustin.thread;

/**
 * @author Dustin_Peng
 * @Description 创建多线程的第二种方式
 * @create 2022-09-28-22:58
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        //3
        Runnable m = new MThread();
        //4
        Thread t1 = new Thread(m);
        //5
        t1.start();

        //再启动一个线程
        Thread t2 = new Thread(m);
        t2.start();

    }
}

//1
class MThread implements Runnable{
    //2
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
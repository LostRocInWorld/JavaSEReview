package com.dustin.thread;

/**
 * @author Dustin_Peng
 * @Description 死锁
 * @create 2022-09-29-03:01
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();

        new Thread() {
            @Override
            public void run() {
                synchronized (s1) {
                    s1.append("a");
                    s2.append("1");
                    System.out.println("start1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (s2) {
                        s1.append("b");
                        s2.append("2");
                        System.out.println(Thread.currentThread().getName() + ":" + s1);
                        System.out.println(Thread.currentThread().getName() + ":" + s2);
                    }
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s2) {
                    s1.append("c");
                    s2.append("3");
                    System.out.println("start2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (s2) {
                        s1.append("d");
                        s2.append("4");
                        System.out.println(Thread.currentThread().getName() + ":" + s1);
                        System.out.println(Thread.currentThread().getName() + ":" + s2);
                    }
                }
            }
        }).start();
    }
}

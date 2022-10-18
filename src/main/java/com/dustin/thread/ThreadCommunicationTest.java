package com.dustin.thread;

/**
 * @author Dustin_Peng
 * @Description 线程通信，使用两个线程打印1-100。线程1,2交替打印
 * @create 2022-09-29-04:31
 */
public class ThreadCommunicationTest {
    public static void main(String[] args) {
        Number n = new Number();
        Thread t1 = new Thread(n);
        Thread t2 = new Thread(n);
        t1.start();
        t2.start();
    }
}

class Number implements Runnable {
    private int i = 1;
    private Object obj = new Object();

    @Override
    public void run() {
        for (; ; ) {
            synchronized (obj) {
                obj.notifyAll();//唤醒所有线程，notify()根据优先级唤醒，同优先级则随机唤醒一个
                if (i < 101) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                    i++;
                    try {
                        //使得调用如下方法的线程进入阻塞，还会释放锁
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}

package com.dustin.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Dustin_Peng
 * @Description 解决线程安全问题的方式三：Lock锁  --- JDK5.0新增
 * @create 2022-09-29-03:37
 */
public class LockTest {
    public static void main(String[] args) {
        Windows w = new Windows();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
class Windows implements Runnable{
    private int ticket = 100;
    //1
    private ReentrantLock lock = new ReentrantLock();//无参意味着默认false，fair是否公平，true--意味着先进先出
    @Override
    public void run() {
        while (true){
            //2
            try {
                lock.lock();
                if(ticket >0){
                    try {
                        Thread.sleep(12);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"：售票，票号为"+ticket);
                    ticket--;
                }else{
                    break;
                }
            } finally {
                //3
                lock.unlock();
            }
        }
    }
}
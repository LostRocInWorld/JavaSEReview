package com.dustin.thread;

/**
 * @author Dustin_Peng
 * @Description 同步代码块
 * @create 2022-09-29-02:00
 */
public class WindowTest2 {
    public static void main(String[] args) {
        Window2 w1 = new Window2();
        Window2 w2 = new Window2();
        Window2 w3 = new Window2();

        System.out.println(Window2.class);
        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}

class Window2 extends Thread {
    private static int ticket = 100;
    private static Object obj = new Object();
    @Override
     public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(15);//模拟网络卡顿，增加错票出现的概率
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "：" + "卖票，票号为" + (ticket));
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

package com.dustin.thread;

/**
 * @author Dustin_Peng
 * @Description 同步方法解决继承Thread的子类的线程安全问题
 * @create 2022-09-29-02:28
 */
public class WindowTest4 {
    public static void main(String[] args) {
        Window4 w1 = new Window4();
        Window4 w2 = new Window4();
        Window4 w3 = new Window4();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}

class Window4 extends Thread {
    private static int ticket = 100;
    private static boolean flag = true;
    @Override
    public void run() {
        while (flag) {
            show();
        }
    }

    private static synchronized void show(){//如果不是静态的，同步监视器为w1,w2,w3，将方法考虑成静态的，同步监视器是当前的类
        if (ticket > 0) {
            try {
                Thread.sleep(11);//模拟网络卡顿，增加错票出现的概率
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "：" + "卖票，票号为" + (ticket));
            ticket--;
        } else {
            flag = false;
        }
    }
}


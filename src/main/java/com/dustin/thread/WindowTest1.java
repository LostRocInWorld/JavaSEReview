package com.dustin.thread;

/**
 * @author Dustin_Peng
 * @Description 创建三个窗口卖票，总票数为100张--使用继承Thread类的方式
 * @create 2022-09-28-23:17
 */
public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w = new Window1();
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
class Window1 implements Runnable{
    private int ticket = 100;//--没有加static，但我们使用的同一个Window1
    //使用Runnable的方式，只创建了一个实现类的对象，所以三个线程共用同一个对象
    Object obj = new Object();//IDEA建议使用final
    @Override
    public void run() {
        while(true){
            synchronized (obj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);//模拟网络卡顿，增加错票出现的概率
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "：" + "卖票，票号为" + (ticket));
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}
package com.dustin.thread;

/**
 * @author Dustin_Peng
 * @Description 使用同步方法解决Runnable接口实现类
 * @create 2022-09-29-02:22
 */
public class WindowTest3 {
        public static void main(String[] args) {
            Window3 w = new Window3();
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
class Window3 implements Runnable{
    private int ticket = 100;//--没有加static，但我们使用的同一个Window1
    //使用Runnable的方式，只创建了一个实现类的对象，所以三个线程共用同一个对象
    private boolean flag = true;
    @Override
    public void run() {
        while(flag){
            show();
        }
    }
    public synchronized void show(){
        if (ticket > 0) {
            try {
                Thread.sleep(10);//模拟网络卡顿，增加错票出现的概率
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "：" + "卖票，票号为" + (ticket));
            ticket--;
        }else {
            flag = false;
        }
    }
}

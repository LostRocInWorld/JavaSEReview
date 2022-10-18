package com.dustin.thread;

/**
 * @author Dustin_Peng
 * @Description 测试Thread类中的常用方法
 * @create 2022-09-28-21:47
 */
public class ThreadMethodTest {
    public static void main(String[] args) {
        //用构造器给线程起名
        HelloThread h1 = new HelloThread("HelloThread");
//        h1.setName("线程1");
        //设置线程优先级
        h1.setPriority(8);
        h1.start();

        //给主线程命名
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() +Thread.currentThread().getPriority()+ ":" + i);
            }
//            if (i==20) {
//                try {
//                    h1.join();//在主线程中，
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }
        System.out.println(h1.isAlive());
    }
}
class HelloThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
//                try {
//                    sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName()+this.getPriority()+":"+ i);
            }
//            if(i%20 == 0){
//                yield();//当前线程调用yield()方法，释放当前线程的CPU的执行权，有可能执行权还是交给当前线程
//            }
        }
    }

    //父类有带name的构造器

    public HelloThread(String name) {
        super(name);
    }
}
package com.dustin.thread;

/**
 * @author Dustin_Peng
 * @Description 生产者消费者问题
 * @create 2022-09-30-02:16
 * 分析
 * 1.是否是多线程问题？是，生产者线程，消费者线程
 * 2.是否有线程安全问题（共享数据）？有，店员（或产品数量）
 * 3.如何解决线程安全问题？同步机制，三种方法
 * 4.是否涉及到线程通信？是
 */
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        Customer c1 = new Customer(clerk);
        Customer c2 = new Customer(clerk);

        p1.start();
        c1.start();
        c2.start();
    }

}

class Clerk {
    private int count = 0;

    public synchronized void getProduct() {//获得产品
        if (count < 20) {
            count++;
            System.out.println(Thread.currentThread().getName() + "开始获得第" + count + "个产品了");
            notify();

        }else{
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void saleProduct() {//卖出产品
        if (count > 0) {
            System.out.println(Thread.currentThread().getName() + "开始卖出第" + count + "个产品了");
            count--;
            notify();
        }else{
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer extends Thread {//生产者
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + "开始生产产品... ...");
        while (true) {
            try {
                sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.getProduct();
        }
    }
}

class Customer extends Thread {//消费者
    private Clerk clerk;

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + "开始消费产品... ...");
        while (true) {
            try {
                sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.saleProduct();
        }
    }
}
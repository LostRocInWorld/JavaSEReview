package com.dustin.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Dustin_Peng
 * @Description 线程池
 * @create 2022-09-30-03:09
 */
public class ThreadPool {
    public static void main(String[] args) {
        //1.返回ThreadPoolExecutor，提供指定数量的线程池
        ThreadPoolExecutor service = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        //2.设置线程池的属性
        service.setCorePoolSize(15);
//        service.getKeepAliveTime();
        service.setMaximumPoolSize(10);
        //3.执行指定的线程的操作。需要提供实现Runnable或Callable接口实现类的对象
        //适合使用Runnable
        service.execute(new NumThread1());
        //适合使用Callable
        service.submit(new NumThread2());
        //关闭线程池
        service.shutdown();
    }
    static void printNum(){
        for (int i = 1; i < 101; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
class NumThread1 implements Runnable{
    @Override
    public void run() {
        ThreadPool.printNum();
    }
}
class NumThread2 implements Callable {
    @Override
    public Object call() {
        ThreadPool.printNum();
        return null;
    }
}
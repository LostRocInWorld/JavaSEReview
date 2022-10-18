package com.dustin.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Dustin_Peng
 * @Description 创建线程的方式三---实现Callable接口
 * @create 2022-09-30-02:43
 */
public class ThreadNew {
    public static void main(String[] args) {
        //3
        NumThread numThread = new NumThread();
        //4
        FutureTask task = new FutureTask(numThread);
        FutureTask task2 = new FutureTask(numThread);
        //5
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
        Object sum = null;
        try {
            //6
            //get()方法返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值
            sum = task.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
//1
class NumThread implements Callable{

    //2
    @Override
    public Object call() throws Exception {
        //遍历100以内偶数，并返回和
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
            sum+=i;
        }
        return sum;//int-->Integer-->Object 多态
    }
}
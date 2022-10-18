package com.dustin.singleton;

/**
 * @Project JavaSEReview
 * @Package com.dustin.singleton
 * @ClassName SingletonTest1
 * @Description 饿汉式实现单例设计模式
 * @Date 2022/9/22   05:06
 * @Created by Dustin_Peng
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank b1 = Bank.getInstance();
        Bank b2 = Bank.getInstance();
        System.out.println(b1 == b2);
    }

}
class Bank{
    String name;
    //1.私有化类的构造器
    private Bank(String name){
        this.name = name;
    }

    //2.内部创建对象,
    //4.并要求此对象也声明为static
    public static Bank instance = new Bank("建设银行");

    //3.提供公共的惊天方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}

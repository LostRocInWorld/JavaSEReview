package com.dustin.singleton;

/**
 * @Project JavaSEReview
 * @Package com.dustin.singleton
 * @ClassName SingletonTest2
 * @Description 懒汉式实现单例设计模式
 * @Date 2022/9/22   05:13
 * @Created by Dustin_Peng
 */
public class SingletonTest2 {
}
class Order{
    //1.私有化类的构造器
    public Order() {
    }

    //2.声明当前类对象，没有初始化
    //4.此对象也必须声明为static
    private static Order instance ;

    //3.提供公共的静态方法，返回实例
    public static Order getInstance(){
        if(instance == null){
            instance = new Order();
        }
        return instance;
    }
}

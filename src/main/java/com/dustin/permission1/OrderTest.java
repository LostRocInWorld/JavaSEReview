package com.dustin.permission1;

/**
 * @Project JavaSEReview
 * @Package com.dustin.permission
 * @ClassName OrderTest
 * @Description 体会四种权限修饰符
 * @Date 2022/9/20   22:36
 * @Created by Dustin_Peng
 */
public class OrderTest {
    public static void main(String[] args) {
        Order o = new Order();
        o.orderDefault =1 ;
        o.orderProtected = 2;
        o.orderPublic = 3;

        o.methodDefault();
        o.methodProtected();
        o.methodPublic();

        //同一个包中的其他类，不可以调用Order类中的私有的属性丶方法
        //has private access
//        o.orderPrivate = 4;
//        o.methodPrivate();
    }
}

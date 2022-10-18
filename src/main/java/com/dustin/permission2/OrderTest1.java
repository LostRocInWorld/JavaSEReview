package com.dustin.permission2;

import com.dustin.permission1.Order;

/**
 * @Project JavaSEReview
 * @Package com.dustin.permission2
 * @ClassName OrderTest1
 * @Description 体会四种权限修饰符
 * @Date 2022/9/20   22:43
 * @Created by Dustin_Peng
 */
public class OrderTest1 {
    public static void main(String[] args) {
        Order o = new Order();
        o.orderPublic = 1;
        o.methodPublic();

        //在不同包的下的非子类要使用Order类，不可以调用声明为private丶缺省丶protected权限的属性丶方法
//        o.orderPrivate = 1;
//        o.orderDefault = 2;
//        o.orderProtected = 3;
//
//        o.methodPrivate();
//        o.methodDefault();
//        o.methodProtected();

    }
}

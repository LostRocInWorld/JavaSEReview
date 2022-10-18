package com.dustin.permission2;

import com.dustin.permission1.Order;

/**
 * @Project JavaSEReview
 * @Package com.dustin.permission2
 * @ClassName SubOrder
 * @Description 体会四种权限修饰符
 * @Date 2022/9/20   22:39
 * @Created by Dustin_Peng
 */
public class SubOrder extends Order {
    public void method() {
        orderProtected = 1;
        orderPublic = 2;

        methodProtected();
        methodPublic();

        //在不同包的子类中，不能调用Order类中声明为private和缺省权限的属性和方法
//        orderDefault = 1;
//        orderPrivate = 4;

        //Cannot be accessed from outside package
//     methodDefault();
//     methodPrivate();
    }
}

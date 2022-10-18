package com.dustin.encapsulation1;

import com.dustin.encapsulation.Order_3;

/**
 * @Project JavaSEReview
 * @Package com.dustin.encapsulation1
 * @ClassName OrderTest_1
 * @Description d
 * @Date 2022/9/17   04:57
 * @Created by Dustin_Peng
 */
public class OrderTest_1 {
    public static void main(String[] args) {
        Order_3 o = new Order_3();
        o.orderPublic = 2;
        //出了Order_3所属的包后，缺省和私有的结构不能被调用
//        o.orderDefault =1;
//        o.orderPrivate =3;//'orderPrivate' has private access in 'com.dustin.encapsulation.Order_3'
    }
}

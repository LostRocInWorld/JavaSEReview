package com.dustin.encapsulation;

/**
 * @Project JavaSEReview
 * @Package com.dustin.encapsulation
 * @ClassName OrderTest_2
 * @Description 测试权限修饰符
 * @Date 2022/9/17   04:51
 * @Created by Dustin_Peng
 */
public class OrderTest_2 {
    public static void main(String[] args) {
        Order_3 o = new Order_3();
        o.orderPublic = 2;
        o.orderDefault =1;
        //出了Order_3类之后，私有的结构都不能被调用
//        o.orderPrivate =3;//'orderPrivate' has private access in 'com.dustin.encapsulation.Order_3'
    }

}

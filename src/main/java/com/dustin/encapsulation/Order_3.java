package com.dustin.encapsulation;

/**
 * @Project JavaSEReview
 * @Package com.dustin.encapsulation
 * @ClassName Order_3
 * @Description 测试权限修饰符
 * @Date 2022/9/17   04:51
 * @Created by Dustin_Peng
 */
public class Order_3 {
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private void mePrivate(){
        orderPrivate=1;
        orderDefault=2;
        orderPublic=3;
    }

    void meDefault(){
        orderPrivate=1;
        orderDefault=2;
        orderPublic=3;
    }
    public void mePublic(){
        orderPrivate=1;
        orderDefault=2;
        orderPublic=3;
    }

}

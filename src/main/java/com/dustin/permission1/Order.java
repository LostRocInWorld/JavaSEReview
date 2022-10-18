package com.dustin.permission1;

/**
 * @Project JavaSEReview
 * @Package com.dustin.permission
 * @ClassName Order
 * @Description 体会四种不同的权限修饰符
 * @Date 2022/9/20   22:33
 * @Created by Dustin_Peng
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtected;
    public int orderPublic;

    //同一个类下可以调用private丶缺省丶protected丶public的属性和方法
    private void methodPrivate(){
        orderPrivate = 1;
        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;
    }

    void methodDefault(){
        orderPrivate = 1;
        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;
    }

    protected void methodProtected(){
        orderPrivate = 1;
        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;
    }

    public void methodPublic(){
        orderPrivate = 1;
        orderDefault = 2;
        orderProtected = 3;
        orderPublic = 4;
    }
}

package com.dustin.objectClass;

/**
 * @Project JavaSEReview
 * @Package com.dustin.objectClass
 * @ClassName ObjectTest
 * @Description Object类
 * @Date 2022/9/21   04:19
 * @Created by Dustin_Peng
 */
public class ObjectTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getClass().getSuperclass());//获取类.获取父类
    }
}
class Order{

}
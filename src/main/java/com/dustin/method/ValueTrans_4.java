package com.dustin.method;

/**
 * @Project JavaSEReview
 * @Package com.dustin.method
 * @ClassName ValueTrans_4
 * @Description 关于变量的赋值
 * @Date 2022/9/16   23:03
 * @Created by Dustin_Peng
 */
public class ValueTrans_4 {
    public static void main(String[] args) {
        //基本数据类型
        int m = 10;
        int n = m;//赋值以后，直接将存入的数据赋给n
        System.out.println("m=" + m + ",n=" + n);//m=10,n=10
        n = 20;
        System.out.println("m=" + m + ",n=" + n);//m=10,n=20
        System.out.println("---------------------------------------");

        //引用数据类型
        Order o1 = new Order();
        o1.orderId = 1001;
        Order o2 = o1;//赋值以后，o1和o2的地址值相同，都指向了堆空间中的同一个对象实体
        System.out.println("o1.orderId="+o1.orderId+",o2.orderId="+o2.orderId);//o1.orderId=1001,o2.orderId=1001
        o2.orderId = 1002;
        System.out.println("o1.orderId="+o1.orderId+",o2.orderId="+o2.orderId);//o1.orderId=1002,o2.orderId=1002
    }


}
class Order{
    int orderId;
}

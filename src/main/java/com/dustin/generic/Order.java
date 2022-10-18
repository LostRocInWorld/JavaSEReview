package com.dustin.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dustin_Peng
 * @Description 自定义泛型类
 * @create 2022-10-08-03:46
 */
public class Order<T> {
    String orderName;
    int orderId;
    //类的内部结构就可以使用类的泛型
    T orderT;

    public Order() {
    }

    public Order(String orderName, int orderId, T orderT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

//    public static void show(T t){
//    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }

    public <E,S> List<E> copyFromArrayToList(E[] arr){
        ArrayList<E> list = new ArrayList<>();
        for (E e:arr) {
            list.add(e);
        }
        return list;
    }
}

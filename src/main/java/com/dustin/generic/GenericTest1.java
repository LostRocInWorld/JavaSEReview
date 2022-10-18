package com.dustin.generic;

import org.junit.Test;

import java.util.List;

/**
 * @author Dustin_Peng
 * @Description 自定义泛型类/接口
 * @create 2022-10-08-03:49
 */
public class GenericTest1 {
    @Test
    public void test1(){
        //如果定义了泛型类，实例化时没有指明类的泛型，则认为此泛型类型Object类型
        //如果定义了泛型类，建议在实例化时要指明其类型
        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("ABC");

        Order<String> order1 = new Order<>("OrderAA",111,"desc");
        String orderT = order1.getOrderT();
    }

    @Test
    public void test2(){
        //由于子类在继承带泛型的父类时，指明了泛型类型，则实例化子类对象时，不再需要指明泛型类型，即类型确定了。
        SubOrder sub = new SubOrder();
        sub.setOrderT(123);//setOrderT(Integer orderT)
    }

    /**
     * 测试泛型方法
     */
    @Test
    public void test3(){
        Order<String> o1 = new Order<>();
        Integer[] arr = {1, 2, 3, 4};
        //泛型反法在调用时，指明泛型参数的类型
        List<Integer> list = o1.copyFromArrayToList(arr);
        System.out.println(list);
    }

}

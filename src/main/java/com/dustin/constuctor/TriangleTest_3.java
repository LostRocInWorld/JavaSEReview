package com.dustin.constuctor;

/**
 * @Project JavaSEReview
 * @Package com.dustin.encapsulation1
 * @ClassName TriangleTest_4
 * @Description 三角测试
 * @Date 2022/9/17   23:12
 * @Created by Dustin_Peng
 */
public class TriangleTest_3 {
    public static void main(String[] args) {
        TriAngle_2 t1 = new TriAngle_2();
        t1.setBase(1.0);
        t1.setHeight(2.4);
        System.out.println("base:"+t1.getBase()+",height:"+t1.getHeight());

        TriAngle_2 t2 = new TriAngle_2(2.0,3.4);
        System.out.println("base:"+t2.getBase()+",height:"+t2.getHeight());
    }
}

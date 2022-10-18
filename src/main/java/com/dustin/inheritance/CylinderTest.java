package com.dustin.inheritance;

/**
 * @Project JavaSEReview
 * @Package com.dustin.inheritance
 * @ClassName CylinderTest
 * @Description 继承性练习2
 * @Date 2022/9/20   05:27
 * @Created by Dustin_Peng
 */
public class CylinderTest {
    public static void main(String[] args) {

        Cylinder c = new Cylinder();
        c.setRadius(2.5);
        c.setLength(4.8);
        System.out.println("圆柱的体积为："+c.getVolume());
        //方法的重写
        System.out.println("圆柱的表面积为："+c.getArea());
    }
}

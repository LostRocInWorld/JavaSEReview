package com.dustin.kwstatic;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwstatick
 * @ClassName CircleTest
 * @Description static应用
 * @Date 2022/9/22   04:23
 * @Created by Dustin_Peng
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println("c1的id为："+c1.getId());
        System.out.println("c2的id为："+c2.getId());
        Circle c3 = new Circle(2.6);
        System.out.println(c3.findArea());
        System.out.println("创建的圆的个数是"+Circle.getTotal());
    }
}

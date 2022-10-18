package com.dustin.oop.exer;

/**
 * @Project JavaSEReview
 * @Package com.dustin.object.exer
 * @ClassName Circle_8
 * @Description 求圆的面积
 * @Date 2022/9/15   04:14
 * @Created by Dustin_Peng
 */
public class CircleTest_8 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 3.2;
        System.out.println(c.calArea());
    }
}
class Circle{
    /**
     * 圆的半径
     */
    double radius;

    public double calArea(){
        return Math.PI*radius*radius;
    }
}

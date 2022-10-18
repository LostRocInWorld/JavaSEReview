package com.dustin.inheritance;

/**
 * @Project JavaSEReview
 * @Package com.dustin.inheritance
 * @ClassName Circle
 * @Description 继承性练习2
 * @Date 2022/9/20   05:22
 * @Created by Dustin_Peng
 */
public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 求圆的面积
     * @return 圆的面积
     */
    public double getArea(){
        return Math.PI*radius*radius;
    }
}

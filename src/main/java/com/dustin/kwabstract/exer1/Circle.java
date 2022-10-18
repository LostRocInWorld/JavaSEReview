package com.dustin.kwabstract.exer1;

/**
 * @Project JavaSEReview
 * @Package com.dustin.polymorphism.exer1
 * @ClassName Circle
 * @Description 多态性练习
 * @Date 2022/9/21   03:51
 * @Created by Dustin_Peng
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI*radius*radius;
    }
}

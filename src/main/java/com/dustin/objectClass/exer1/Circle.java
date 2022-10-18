package com.dustin.objectClass.exer1;

import java.util.Objects;

/**
 * @Project JavaSEReview
 * @Package com.dustin.objectClass.exer1
 * @ClassName Circle
 * @Description Object练习
 * @Date 2022/9/21   23:01
 * @Created by Dustin_Peng
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color,double weight) {
        super(color,weight);
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return this.radius == circle.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

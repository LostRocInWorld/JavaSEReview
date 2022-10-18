package com.dustin.polymorphism.exer1;

/**
 * @Project JavaSEReview
 * @Package com.dustin.polymorphism.exer1
 * @ClassName MyRectangle
 * @Description 多态性练习
 * @Date 2022/9/21   03:52
 * @Created by Dustin_Peng
 */
public class MyRectangle extends GeometricObject{
    private double height;
    private double width;

    public MyRectangle(String color, double weight, double height, double width) {
        super(color, weight);
        this.height = height;
        this.width = width;
    }

    @Override
    public double findArea() {
        return height * width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

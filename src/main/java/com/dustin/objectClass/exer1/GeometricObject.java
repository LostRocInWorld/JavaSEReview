package com.dustin.objectClass.exer1;

/**
 * @Project JavaSEReview
 * @Package com.dustin.objectClass.exer1
 * @ClassName GeometricObject
 * @Description Object类练习
 * @Date 2022/9/21   23:00
 * @Created by Dustin_Peng
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject() {
        this.color = "white";
        this.weight = 1.0;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight =weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

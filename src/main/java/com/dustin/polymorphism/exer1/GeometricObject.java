package com.dustin.polymorphism.exer1;

/**
 * @Project JavaSEReview
 * @Package com.dustin.polymorphism.exer1
 * @ClassName GeometricObject
 * @Description 多态性练习
 * @Date 2022/9/21   03:48
 * @Created by Dustin_Peng
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    //--微积分
    public double findArea(){
      return 0.0;
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

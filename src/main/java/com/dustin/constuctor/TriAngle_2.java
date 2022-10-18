package com.dustin.constuctor;

/**
 * @Project JavaSEReview
 * @Package com.dustin.encapsulation1
 * @ClassName TriAngle_3
 * @Description 三角形
 * @Date 2022/9/17   23:10
 * @Created by Dustin_Peng
 */
public class TriAngle_2 {
    private double base;//底边长
    private double height;//高

    public TriAngle_2() {

    }

    public TriAngle_2(double b, double h) {
        base = b;
        height = h;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}

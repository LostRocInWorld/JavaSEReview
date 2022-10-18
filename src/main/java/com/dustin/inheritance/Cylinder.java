package com.dustin.inheritance;

/**
 * @Project JavaSEReview
 * @Package com.dustin.inheritance
 * @ClassName Cylinder
 * @Description 继承性练习2
 * @Date 2022/9/20   05:24
 * @Created by Dustin_Peng
 */
public class Cylinder extends Circle{
    private double length;

    public Cylinder() {
        this.length = 1.0;
    }

    public double getVolume(){
        return super.getArea() * length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * 求圆柱的表面积，方法的重写练习
     * @return 返回圆柱的表面积
     */
    @Override
    public double getArea() {
        return super.getArea()*2+2*Math.PI*getRadius()*getLength();
    }
}

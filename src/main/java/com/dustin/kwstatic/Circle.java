package com.dustin.kwstatic;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwstatick
 * @ClassName Circle
 * @Description static的应用
 * @Date 2022/9/22   04:21
 * @Created by Dustin_Peng
 */
public class Circle {
    private double radius;
    /**
     * id要求自动生成自增
     */
    private int id;

    /**
     * 造了多少个对象
     */
    private static int total;
    /**
     * 初始化的数字,static声明的属性被所有对象共享
     */
    private static int init = 1001;

    public Circle() {
        id = init++;
        total++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }

}

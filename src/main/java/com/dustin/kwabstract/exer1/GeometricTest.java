package com.dustin.kwabstract.exer1;

/**
 * @Project JavaSEReview
 * @Package com.dustin.polymorphism.exer1
 * @ClassName GeometricTest
 * @Description 多态性练习
 * @Date 2022/9/21   03:54
 * @Created by Dustin_Peng
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c = new Circle("白色", 1, 12.6);
        MyRectangle rec = new MyRectangle("白色", 1, 4.7, 2.4);
        MyRectangle rec1 = new MyRectangle("黑色", 2, 4.7, 2.4);
        test.displayArea(c);
        test.displayArea(rec);
        if (test.equalsArea(c, rec)) {
            System.out.println("面积相同");
        } else {
            System.out.println("面积不相同");
        }
        System.out.println(rec.desc);
    }

    public boolean equalsArea(GeometricObject a, GeometricObject b) {
        return a.findArea() == b.findArea();
    }

    public void displayArea(GeometricObject o) {
        System.out.println("面积为" + o.findArea());
    }
}

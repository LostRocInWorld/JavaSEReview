package com.dustin.objectClass.exer1;

/**
 * @Project JavaSEReview
 * @Package com.dustin.objectClass.exer1
 * @ClassName CircleTest
 * @Description Object类练习
 * @Date 2022/9/21   23:07
 * @Created by Dustin_Peng
 */
public class CircleTest {
    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        Circle c1 = new Circle(2.3);
        Circle c2 = new Circle(2.3, "white", 2.0);
        System.out.println("颜色是否相等"+c1.getColor().equals(c2.getColor()));
        System.out.println("半径是否相等"+c2.equals(c1));
        System.out.println(c1);
    }
}

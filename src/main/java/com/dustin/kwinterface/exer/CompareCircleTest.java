package com.dustin.kwinterface.exer;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwinterface.exer
 * @ClassName CompareCircleTest
 * @Description 练习2
 * @Date 2022/9/23   23:38
 * @Created by Dustin_Peng
 */
public class CompareCircleTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(3.4);
        ComparableCircle c2 = new ComparableCircle(3.2);
        int result = c1.compareTo(c2);
        System.out.println("c1和c2比较的结果:"+result);
    }
}

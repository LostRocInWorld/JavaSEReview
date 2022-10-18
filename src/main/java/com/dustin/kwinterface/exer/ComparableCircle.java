package com.dustin.kwinterface.exer;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwinterface.exer
 * @ClassName ComparableCircle
 * @Description 练习2
 * @Date 2022/9/23   23:31
 * @Created by Dustin_Peng
 */
public class ComparableCircle extends Circle implements CompareObject {
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (getClass() != o.getClass()) {
            return 1;
//            throw new RuntimeException("传入的对象类型不合适");
        }
        ComparableCircle c = (ComparableCircle) o;
//        if (getRadius() == c.getRadius()) {
//            return 0;
//        } else if (getRadius() > c.getRadius()) {
//            return 1;
//        } else {
//            return -1;
//        }
        return Double.compare(getRadius(),c.getRadius());//调用包装类的比较方法
    }
}

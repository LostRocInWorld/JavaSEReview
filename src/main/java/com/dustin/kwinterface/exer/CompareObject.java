package com.dustin.kwinterface.exer;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwinterface.exer
 * @ClassName CompareObject
 * @Description 练习
 * @Date 2022/9/23   23:27
 * @Created by Dustin_Peng
 */
public interface CompareObject {
    /**
     *  比较对象的大小
     * @param o 要比较的对象
     * @return 若返回值为0，代表相等；若为正数代表，当前对象大，负数代表当前对象小
     */
    public int compareTo(Object o);
}

package com.dustin.array;

import java.util.Arrays;

/**
 * @Project JavaSEReview
 * @Package com.dustin.array
 * @ClassName ArraysTest_12
 * @Description Arrays操作数组的工具类
 * @Date 2022/9/14   04:32
 * @Created by Dustin_Peng
 */
public class ArraysTest_12 {
    public static void main(String[] args) {
        //| 方法                              | 描述                                 |
        //| --------------------------------- | ------------------------------------ |
        //| boolean equals(int[] a,int[] b)   | 判断两个数组是否相等                 |
        //| String toString(int[] a)          | 输出数组信息                         |
        //| void fill(int[] a,int val)        | 将指定值填充到数组中                 |
        //| int binarySearch(int[] a,int key) | 对排序后的数组进行二分法检索指定的值 |

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 3, 2, 4};
        System.out.println(Arrays.equals(arr1, arr2));

        System.out.println(Arrays.toString(arr1));

        Arrays.fill(arr1, 10);//全部替换成10了
        Arrays.sort(arr2);//使用的快速排序
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {-98, -34, -21, 2, 32, 54, 66, 78, 108, 128, 137};
        System.out.println(Arrays.binarySearch(arr3,144));//返回数组长度负数没找到
    }
}

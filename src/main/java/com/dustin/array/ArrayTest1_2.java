package com.dustin.array;

/**
 * @Project JavaSEReview
 * @Package com.dustin.array
 * @ClassName ArrayTest1_2
 * @Description 一维数组
 * @Date 2022/9/13   02:03
 * @Created by Dustin_Peng
 */
public class ArrayTest1_2 {
    public static void main(String[] args) {
//                5. 数组元素的默认初始值
        int[] is = new int[4];
        for (int i = 0; i < is.length; i++) {
            System.out.println(is[i]);
        }
        String[] strs = new String[2];
        System.out.println(strs[0]);
//                6. 数组的内存解析
        int[] arr = new int[]{1,2,3};
        String[] arr1 = new String[4];
        arr1[1] = "一";
        arr1[2] = "二";
        arr1 = new String[3];
        System.out.println(arr1[2]);//null


    }
}

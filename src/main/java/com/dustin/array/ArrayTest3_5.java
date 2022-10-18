package com.dustin.array;

/**
 * @Project JavaSEReview
 * @Package com.dustin.array
 * @ClassName ArrayTest3_5
 * @Description 二维数组
 * @Date 2022/9/13   03:49
 * @Created by Dustin_Peng
 */
public class ArrayTest3_5 {
    public static void main(String[] args) {
        //二维数组分为外层数组元素，内存数组元素
//        //5.数组元素的默认初始化值
//        short[][] arr = new short[3][2];
//        System.out.println(arr[0]);//地址值
//        System.out.println(arr[0][0]);//0
//
//        System.out.println("*************");
//        float[][] arr1 = new float[3][2];
//        System.out.println(arr1[0]);//地址值
//        System.out.println(arr1[0][0]);//0.0
//
//        System.out.println("*************");
//        Integer[][] arr2 = new Integer[3][2];
//        System.out.println(arr2[0]);//地址值
//        System.out.println(arr2[0][0]);//null
//
//        System.out.println("*************");
//        double[][] arr3 = new double[3][];
//        System.out.println(arr3[0]);//null,因为二维数组的每个元素都是一维数组，一维数组并没有初始化，那么就是null
//        System.out.println(arr3[0][0]);//报错空指针异常

        //以如下代码为例
        int[][] arr1 = new int[4][];
        arr1[1]= new int[]{1,2,3};
        arr1[2]=new int[4];
        arr1[2][1]=30;
        arr1[3][1]=40;//报错空指针
    }
}

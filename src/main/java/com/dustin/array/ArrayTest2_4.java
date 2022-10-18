package com.dustin.array;

/**
 * @Project JavaSEReview
 * @Package com.dustin.array
 * @ClassName ArrayTest2_4
 * @Description 二维数组
 * @Date 2022/9/13   03:28
 * @Created by Dustin_Peng
 */
public class ArrayTest2_4 {
    public static void main(String[] args) {
        //1.二维数组的声明和初始化
        //静态初始化
        int[][] arr1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        //动态初始化
        //第一种方式
        String[][] arr2 = new String[3][2];
        //第二种方式
        String[][] arr3 = new String[3][];
        //第三种方式
        int arr4[][] = new int[][]{{1,2,3},{4,5},{6,7,8}};
        int[] arr5[] = {{1,2,3},{4,5},{6,7,8}};

        //2.如何调用数组的指定位置的元素
        System.out.println(arr1[0][2]);
        System.out.println(arr2[1][1]);//null

        arr3[1] = new String[4];
        System.out.println(arr3[1][0]);//null

        //3.获取数组的长度
        System.out.println(arr4.length);//3

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.println(arr4[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

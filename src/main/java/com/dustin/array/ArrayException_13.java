package com.dustin.array;

import java.util.Arrays;

/**
 * @Project JavaSEReview
 * @Package com.dustin.array
 * @ClassName ArrayException_13
 * @Description 数组中的常见异常
 * @Date 2022/9/14   04:44
 * @Created by Dustin_Peng
 */
public class ArrayException_13 {
    public static void main(String[] args) {
        //1.数组角标越界的异常:ArrayIndexOutOfBoundsException,角标从0开始，最大为length-1
        int[] arr = {1,2,3,4,5};
//        System.out.println(arr[5]);
//        System.out.println(arr[-2]);
        //2.空指针异常:NullPointerException
        //情况1
        int[] arr1 = {1,2,3};
        arr1 = null;
        System.out.println(arr1[0]);
        //情况2
        int[][] arr2 = new int[4][];
        System.out.println(arr2[0]);
        //情况3
        String[] arr3 ={"AA","BB","CC"};
        arr3[0]=null;
        System.out.println(arr3[0].toString());

//        int[] arr = {34, 5, 22, -76, 0, -3};
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
        System.out.println(Arrays.toString(arr));
        int dest = 22;
        for (int i = 0; i < arr.length; i++) {
            if (dest == arr[i]) {
                System.out.println("找到了" +
                        dest +
                        "的位置为：" + i);
                break;
            }else if(i == arr.length-1){
                System.out.println("没有找到，很遗憾");
            }
        }

    }
}

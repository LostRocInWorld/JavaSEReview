package com.dustin.array;

/**
 * @Project JavaSEReview
 * @Package com.dustin.array
 * @ClassName BubbleSortTest_10
 * @Description 冒泡排序
 * @Date 2022/9/14   03:20
 * @Created by Dustin_Peng
 */
public class BubbleSortTest_10 {
    public static void main(String[] args) {
        int[] arr = {43, 26, 78, 90, -21, 22, 323, 55, 6, 232, 64, 26, 90, 33, 443, 87};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}

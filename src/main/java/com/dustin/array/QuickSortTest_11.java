package com.dustin.array;

/**
 * @Project JavaSEReview
 * @Package com.dustin.array
 * @ClassName QuickSortTest_11
 * @Description 快速排序
 * @Date 2022/9/14   03:37
 * @Created by Dustin_Peng
 */
public class QuickSortTest_11 {
    /**
     * 交换数组中的两个元素
     */
    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    /**
     *快速排序算法
     */
    private static void subSort(int[] data, int start, int end) {
        if (start < end) {
            int base = data[start];
            int low = start;
            int high = end + 1;
            while (true) {
                while (low < end && data[++low] - base <= 0)//从定义的开始往后扫描，直到遇到大于基数的（即不满足终止循环）
                    ;
                while (high > start && data[--high] - base >= 0)//从数组末尾往前扫描，直到遇到小于基数的
                    ;
                if (low < high) {
                    swap(data, low, high);
                } else {
                    break;
                }
            }
            swap(data, start, high);

            subSort(data, start, high - 1);//递归调用，前半段扫描
            subSort(data, high + 1, end);//后半段扫描
        }
    }
    public static void quickSort(int[] data){
        subSort(data,0,data.length-1);
    }


    public static void main(String[] args) {
        int[] data = { 9, -16, 30, 23, -30, -49, 25, 21, 30 };
        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
        quickSort(data);
        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));

    }
}

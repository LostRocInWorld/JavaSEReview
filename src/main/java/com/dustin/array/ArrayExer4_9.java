package com.dustin.array;

/**
 * @Project JavaSEReview
 * @Package com.dustin.array
 * @ClassName ArrayExer4_9
 * @Description 数组的复制丶反转丶查找（线性查找丶二分法查找）
 * @Date 2022/9/14   01:49
 * @Created by Dustin_Peng
 */
public class ArrayExer4_9 {
    public static void main(String[] args) {
        //(1)声明array1和array2两个int型数组
        //(2)使用大括号{}，给array1初始化{2,3,5,7,11,13,17,19}
        //(3)显示array1的内容
        //(4)使得array2等于array1，修改array2中偶数索引元素，使其等于索引值，再打印出array1

        //数组的赋值
        int[] array1 = {2, 3, 5, 7, 11, 13, 17, 19};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
        int[] array2;
        array2 = array1;
        for (int i = 0; i < array2.length; i += 2) {
            array2[i] = i;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();

        //数组的复制
        array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        //数组的反转
        String[] str = new String[]{"JJ", "DD", "MM", "GG", "BB"};
//        String temp = "";
//        for (int i = 0; i < (str.length) / 2; i++) {
//            temp = str[i];
//            str[i] = str[str.length - 1 - i];
//            str[str.length - 1 - i] = temp;
//        }
//        //方法二
//        for (int i = 0,j=str.length; i <j ; i++,j--) {
//            temp = str[i];
//            str[i] = str[j];
//            str[j] = temp;
//        }
        //线性查找
        String dest = "MM";
        boolean flag = true;
        for (int i = 0; i < str.length; i++) {
            if (dest.equals(str[i])) {
                System.out.println("找到了指定的元素，位置为：" + (i + 1));
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("很遗憾没找到！");
        }
        //二分法查找
        //前提：所要查找的数字必须有序
        int[] arr2 = {-98, -34, -21, 2, 32, 54, 66, 78, 108, 128, 137};

        int dest1 = -34;
        int head = 0;//初始索引
        int end = arr2.length - 1;
        boolean isFlag =true;
        while (head <= end) {
            int middle = (head + end) / 2;
            if (dest1 == arr2[middle]) {
                System.out.println("找到了指定的元素，位置为：" + (middle + 1));
                isFlag = false;
                break;
            } else if (arr2[middle] > dest1) {
                end = middle - 1;
            } else {//arr2[middle]<dest1
                head = middle + 1;
            }
        }
        if(isFlag){
            System.out.println("没有找到需要的元素");
        }

    }
}

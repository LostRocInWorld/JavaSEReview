package com.dustin.array;

/**
 * @Project JavaSEReview
 * @Package com.dustin.array
 * @ClassName ArrayTest_1
 * @Description 一维数组
 * @Date 2022/9/13   01:41
 * @Created by Dustin_Peng
 */
public class ArrayTest_1 {
    public static void main(String[] args) {
//        1. 一维数组的声明和初始化
        int[] ids;//声明
        //1.1 静态初始化:数组的初始化和数组元素的赋值操作同时进行
//        ids = new int[]{1001, 1002, 1003, 1004};

        //1.2 动态初始化：数组的初始化和数组元素的赋值操作分开进行
        String[] names = new String[3];

        //错误的写法
//        int[] ids2 = new int[];
//        int[] ids3 = new int[3]{1,2,3};


//        2. 如何调用数组的指定位置的元素
        names[0] = "长江一号";
        names[1] = "嫦娥一号";
        names[2] = "追月一号";

//        3. 如何获取数组的长度
        System.out.println(names.length);//3
//        4. 如何遍历数组
        for (int i = 0; i < names.length-1; i++) {
            System.out.println(names[i]);
        }

    }
}

package com.dustin.array;

/**
 * @Project JavaSEReview
 * @Package com.dustin.array
 * @ClassName ArrayTest5_8
 * @Description 求数值型数组中元素的最大值丶最小值丶平均数丶总和等
 * @Date 2022/9/14   01:28
 * @Created by Dustin_Peng
 */
public class ArrayExer3_8 {
    public static void main(String[] args) {
        //定义一个int型的一维数组，包含10个元素，分别赋值一些随机整数。[10-99]
        //求出所有元素的最大值，最小值，和值，平均值，并输出出来

        int[] array= new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int) (Math.random() * 90 + 10);
        }
        int max = array[0];
        int min = array[0];
        int sum = 0;

        for (int j = 0; j < array.length; j++) {
            //求最大值
            if(array[j]>max){
                max=array[j];
            }else{//求最小值
                min=array[j];
            }
            //求总和
            sum+=array[j];
            System.out.print(array[j]+"\t");
        }
        System.out.println();
        int avg = sum/(array.length);
        System.out.println("最大值max为："+max);
        System.out.println("最小值min为："+min);
        System.out.println("总和sum为："+sum);
        System.out.println("平均值avg为："+avg);
    }
}

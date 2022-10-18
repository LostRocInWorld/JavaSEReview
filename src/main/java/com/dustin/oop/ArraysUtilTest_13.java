package com.dustin.oop;

/**
 * @Project JavaSEReview
 * @Package com.dustin.object.exer
 * @ClassName ArraysUtilTest_13
 * @Description 数组工具类测试
 * @Date 2022/9/16   04:05
 * @Created by Dustin_Peng
 */
public class ArraysUtilTest_13 {
    public static void main(String[] args) {
        ArraysUtil_12 util = new ArraysUtil_12();
        int[] arr = {1,32,33,345,66,4,-2,-434,34,34,43,43,32};
        util.sort(arr);
        util.print(arr);
        int index = util.getIndex(arr, 5);
        if(index > 0){
            System.out.println("找到了，索引为"+index);
        }else{
            System.out.println("没找到");
        }

    }
}

package com.dustin.method;

/**
 * @Project JavaSEReview
 * @Package com.dustin.method
 * @ClassName ValueTrans2_6
 * @Description 引用数据在方法中值传递
 * @Date 2022/9/16   23:35
 * @Created by Dustin_Peng
 */
public class ValueTrans2_6 {
    public static void main(String[] args) {
        ValueTrans2_6 test = new ValueTrans2_6();
        Data data = new Data();
        data.m = 10;
        data.n = 20;
        System.out.println("m=" + data.m + ",n=" + data.n);
        test.swap(data);
        System.out.println("m=" + data.m + ",n=" + data.n);


    }

    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n =temp;
    }
}
class Data{
    int m;
    int n;
}

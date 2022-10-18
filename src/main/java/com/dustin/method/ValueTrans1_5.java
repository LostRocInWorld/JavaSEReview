package com.dustin.method;

/**
 * @Project JavaSEReview
 * @Package com.dustin.method
 * @ClassName ValueTrans1_5
 * @Description 方法形参的传递机制
 * @Date 2022/9/16   23:16
 * @Created by Dustin_Peng
 */
public class ValueTrans1_5 {
    public static void main(String[] args) {
        ValueTrans1_5 test = new ValueTrans1_5();

        int m = 10;
        int n = 20;
        System.out.println("m=" + m + ",n=" + n);//m=10,n=10
        //交换
        test.swap(m,n);
        System.out.println("m=" + m + ",n=" + n);//m=10,n=10
    }

    public void swap(int m,int n){
        int temp = m;
        m = n;
        n =temp;
    }
}

package com.dustin.method;

import java.io.PrintStream;
import java.util.Arrays;

/**
 * @Project JavaSEReview
 * @Package com.dustin.method
 * @ClassName ValueTrans3_7
 * @Description 形参值传递内存解析
 * @Date 2022/9/17   01:18
 * @Created by Dustin_Peng
 */
public class ValueTrans3_7 {
    public static void main(String[] args) {
        ValueTrans3_7 test = new ValueTrans3_7();
        test.first();

        int a = 10;
        int b = 10;
        test.method(a,b);//需要在method方法被调用之后，仅打印出a = 100,b = 200,请写出method方法的代码
        System.out.println("a="+a);
        System.out.println("b="+b);

        int[] arr = new int[]{12,3,3,34,56,77,432};
//        int temp = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i]/temp ;
//        }
        for (int i = arr.length-1; i >=0 ; i--) {
            arr[i]/=arr[0];
        }
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {1,2,3};
        System.out.println(arr2);//输出地址值

        char[] arr1 = {'a','b','c'};
        System.out.println(arr1);//输出abc
    }

    public void first() {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v, i);
        System.out.println(v.i);


    }

    private void second(Value v, int i) {
        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.println(v.i + "" + i);
    }

    public void method(int a,int b){
        a *=10;
        b *=20;
        PrintStream ps = new PrintStream(System.out) {
            @Override
            public void println(String x) {
                if ("a=10".equals(x)) {
                    x = "a=100";
                } else if ("b=10".equals(x)) {
                    x = "b=200";
                }
                super.println(x);
            }
        };
        System.setOut(ps);
    }
}

class Value {
    int i = 15;
}
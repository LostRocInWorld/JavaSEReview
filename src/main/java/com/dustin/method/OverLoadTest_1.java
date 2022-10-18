package com.dustin.method;

/**
 * @Project JavaSEReview
 * @Package com.dustin.method
 * @ClassName OverLoadTest_1
 * @Description 方法的重载
 * @Date 2022/9/16   04:29
 * @Created by Dustin_Peng
 */
public class OverLoadTest_1 {
    public static void main(String[] args) {
        OverLoadTest_1 test = new OverLoadTest_1();
        test.getSum(1,2);
    }
    //注释掉该方法后调用了参数类型为double的方法（因为自动类型转换）
    public void getSum(int i,int j){
        System.out.println(1);
    }

    public void getSum(double d1,double d2){
        System.out.println(2);
    }

    public void getSum(String s,int i){
        System.out.println(3);
    }

    public void getSum(int i,String s){
        System.out.println(4);
    }

//    public int getSum(int i, int j){} //不行

//    public void getSum(int m,int n){} //不行

//    private void getSum(int i ,int j){} //不行
}


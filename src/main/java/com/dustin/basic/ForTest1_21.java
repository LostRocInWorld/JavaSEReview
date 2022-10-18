package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName ForTest1_21
 * @Description for循环例题
 * @Date 2022/9/10   02:07
 * @Created by Dustin_Peng
 */
public class ForTest1_21 {
    public static void main(String[] args) {
        for (int i = 0; i <= 150; i++) {
            System.out.print(i);
            if(i%3==0){
                System.out.print("    foo ");
            }
            if(i%5==0){
                System.out.print("    biz ");
            }
            if(i%7==0){
                System.out.print("    baz ");
            }
            //换行
            System.out.println();
        }
    }

}

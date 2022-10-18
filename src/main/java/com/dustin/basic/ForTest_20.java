package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName ForTest_20
 * @Description for循环
 * @Date 2022/9/10   01:46
 * @Created by Dustin_Peng
 */
public class ForTest_20 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello for loop");
        }
        int j = 0;
//        for (System.out.println('a'); j <= 3; System.out.println('c'), j++) {
//            System.out.println('b');
//        }
        for(System.out.println("初始化条件:j="+j);j<=3; j++,System.out.println("迭代体部分:j="+j) ){
            System.out.println("循环体部分:j="+j);
        }
        //输出结果:abcbcbc
        int sum =0;
        for (int k = 0; k < 100; k+=2) {
            System.out.println("k="+k);
            sum+=k;
        }
        System.out.println("sum="+sum);
    }
}

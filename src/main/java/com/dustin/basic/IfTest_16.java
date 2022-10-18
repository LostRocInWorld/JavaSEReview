package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName IfTest
 * @Description if-else结构
 * @Date 2022/9/9   02:37
 * @Created by Dustin_Peng
 */
public class IfTest_16 {
    public static void main(String[] args) {
//        //第一种结构
//        int heartBeats = 30;
//        if (heartBeats < 60 || heartBeats > 100) {
//            System.out.println("需要做进一步检查");
//        }
//
//        //第二种结构
//        int age = 23;
//        if (age < 18) {
//            System.out.println("多看看动画片");
//        } else {
//            System.out.println("多看看艺术片");
//        }
//
//        //第三种结构
//        if (age < 0) {
//            System.out.println("输入的年龄数据非法");
//        } else if (age < 18) {
//            System.out.println("青少年时期");
//        } else if (age < 35) {
//            System.out.println("青壮年时期");
//        } else if (age < 60) {
//            System.out.println("中年时期");
//        } else {
//            System.out.println("老年时期");
//        }
        //手动实现
        int i1 = 60;
        int i2 = i1 & 15;//15的最后四位全是1111,其他是0，这样取出60的最后四位
        String j = (i2 > 9) ? (char) (i2 - 10 + 'A') + "" : i2 + "";//十六进制，0-9和A-F，如果大于9，减去大于9的部分再加上'A'来获得字母
        int temp = i1 >>> 4;//无符号右移，将倒数第二个4位数字移到最后
        //重复以上步骤
        i2 = temp & 15;
        String k = (i2 > 9) ? (char) (i2 - 10 + 'A') + "" : i2 + "";
        System.out.println(k + j);
    }
}

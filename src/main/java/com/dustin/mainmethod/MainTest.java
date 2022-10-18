package com.dustin.mainmethod;

/**
 * @Project JavaSEReview
 * @Package com.dustin.mainmethod
 * @ClassName MainTest
 * @Description main方法理解
 * @Date 2022/9/23   00:57
 * @Created by Dustin_Peng
 */
public class MainTest {
    public static void main(String[] args) {
        Main.main(new String[100]);
    }
}
class Main{
    public static void main(String[] args) {
        args = new String[100];
        for (int i = 0; i < args.length; i++) {
            args[i] = "args_"+i;
            System.out.println(args[i]);
        }
    }
}
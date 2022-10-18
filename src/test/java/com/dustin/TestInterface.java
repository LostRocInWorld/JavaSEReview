package com.dustin;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName TestInterface
 * @Description interface
 * @Date 2022/9/24   00:48
 * @Created by Dustin_Peng
 */
public class TestInterface {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        System.out.println(s.NUM);
    }
}
interface Father{
    int NUM = 1;
}
class SubClass implements Father{
    void myMethod(){
        System.out.println(NUM);//可以调用
    }

    {
        int i = NUM + 1;//可以调用
    }
}
package com.dustin.polymorphism.exer2;



/**
 * @Project JavaSEReview
 * @Package com.dustin.polymorphism.exer2
 * @ClassName InterviewTest
 * @Description 多态
 * @Date 2022/9/21   04:06
 * @Created by Dustin_Peng
 */
public class InterviewTest {
    public static void main(String[] args) {
        Base base=new Sub();
        base.add(1,2,3);//输出sub1

        Sub s = (Sub) base;
        s.add(1,2,3);//sub2，因为我参数确定了
    }
}
class Base{
    public void add(int i,int... arr){
        System.out.println("base1");
    }
}

class Sub extends Base{
    public void add(int i,int[] arr){
        System.out.println("sub1");
    }

    //我不构成重写，因为base没有
    public void add(int i,int j,int k){
        System.out.println("sub2");
    }
}

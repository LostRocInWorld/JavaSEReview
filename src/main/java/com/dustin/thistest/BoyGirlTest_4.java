package com.dustin.thistest;

/**
 * @Project JavaSEReview
 * @Package com.dustin.thistest
 * @ClassName BoyGirlTest_4
 * @Description this练习
 * @Date 2022/9/18   02:08
 * @Created by Dustin_Peng
 */
public class BoyGirlTest_4 {
    public static void main(String[] args) {
        Boy_2 b = new Boy_2("罗密欧", 21);
        b.shout();

        Girl_3 g = new Girl_3(23,"朱丽叶");
        g.marry(b);


        Girl_3 g1 = new Girl_3(19, "祝英台");
        int compare = g1.compare(g);
        if(compare>0){
            System.out.println(g1.getName()+"大");
        }else if(compare<0){
            System.out.println(g.getName()+"大");
        } else{
            System.out.println(g.getName()+"和"+g1.getName()+"一样大");
        }
    }
}

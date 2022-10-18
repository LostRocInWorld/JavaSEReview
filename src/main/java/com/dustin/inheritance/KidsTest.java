package com.dustin.inheritance;

/**
 * @Project JavaSEReview
 * @Package com.dustin.inheritance
 * @ClassName KidsTest
 * @Description 继承性练习1
 * @Date 2022/9/20   05:19
 * @Created by Dustin_Peng
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids(12);
        someKid.printAge();

        someKid.setSalary(0);
        someKid.setSex(1);
        someKid.manOrWoman();

        someKid.employed();

    }
}

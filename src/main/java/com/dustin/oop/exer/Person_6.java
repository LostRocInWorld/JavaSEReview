package com.dustin.oop.exer;

/**
 * @Project JavaSEReview
 * @Package com.dustin.object.exer
 * @ClassName Person
 * @Description 測試
 * @Date 2022/9/15   04:02
 * @Created by Dustin_Peng
 */
public class Person_6  {
    String name;
    int age;
    /**
     * sex=1,男性
     * sex=0,女性
     */
    int sex;

    /**
     * 输出study
     */
    public void study(){
        System.out.println("study");
    }

    /**
     * 显示当前年龄age
     */
    public void showAge(){
        System.out.println("age:"+age);
    }

    /**
     * 增加年龄
     * @param i 需要增加的年龄，int
     * @return 返回age
     */
    public int addAge(int i){
        age +=i;
        return age;
    }
}

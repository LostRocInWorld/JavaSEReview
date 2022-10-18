package com.dustin.oop.exer;


/**
 * @Project JavaSEReview
 * @Package com.dustin.object.exer
 * @ClassName PersonTest_7
 * @Description Person測試
 * @Date 2022/9/15   04:02
 * @Created by Dustin_Peng
 */
public class PersonTest_7 {
    public static void main(String[] args) {
        Person_6 p1 = new Person_6();
        p1.name = "Tom";
        p1.age = 12;
        p1.sex = 1;
        p1.study();
        p1.showAge();
        int newAge = p1.addAge(2);
        System.out.println(newAge);
        p1.showAge();

        Person_6 p2 = new Person_6();
        p2.showAge();

        Student[] stus = new Student[5];
        stus[0] = new Student();
        System.out.println(stus[0].state);//1
        System.out.println(stus[1]);//null
//        System.out.println(stus[1].number);//异常
        stus[1] = new Student();
        System.out.println(stus[1].number);//0
    }
}

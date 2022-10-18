package com.dustin.oop;

/**
 * @Project JavaSEReview
 * @Package com.dustin.object
 * @ClassName PersonTest2_3
 * @Description 类的成员
 * @Date 2022/9/15   02:20
 * @Created by Dustin_Peng
 */
public class PersonTest2_3 {
    public static void main(String[] args) {
        //创建Person类的对象
        People p1 = new People();
        //调用对象的结构:属性，方法
        //调用属性：对象.属性
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);
        //调用方法：对象.方法
        p1.walk();
        p1.talk("English");

        //类的多个对象
        People p2 = new People();
        System.out.println(p2.name);//null 默认
        System.out.println(p2.isMale);//false 默认

        //************
        People p3 = p1;
        System.out.println(p3.name);//tom
        p3.age =10;
        System.out.println(p1.age);//10

    }
}
class People{
    //成员变量
    String name;
    int age = 1;
    boolean isMale;

    //方法
    public void walk(){
        System.out.println("人在走路");
    }
    public void talk(String language){
        System.out.println("人在讲"+language);
    }
    public void sleep(){
        System.out.println("人在睡觉");
    }
}

package com.dustin.kwstatic;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwstatick
 * @ClassName Chinese
 * @Description 关键字static
 * @Date 2022/9/22   03:18
 * @Created by Dustin_Peng
 */
public class Chinese {
    static String nation;
    String name;
    int age;


    public void eat(){
        System.out.println("吃中餐");
        //调用非静态结构
        this.info();
        System.out.println("name="+name);
        //调用静态结构
        show();
        System.out.println("station="+nation);
    }

    public static void show(){
        System.out.println("I am a Chinese!!!"+"nation="+nation);
    }

    public void info() {
        System.out.println("Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}');
    }
}

package com.dustin.oop;

/**
 * @Project JavaSEReview
 * @Package com.dustin.object
 * @ClassName PersonTest_2
 * @Description 类
 * @Date 2022/9/15   01:32
 * @Created by Dustin_Peng
 */
public class PersonTest_2 {
    public static void main(String[] args) {

    }
}

class Person {
    //属性 = 成员变量 = Field = 域或者字段
    String name;
    int age = 1;
    boolean isMale;
    //代码块
    {
        name = "XiaoMing";
        age = 17;
        isMale = true;
    }
    //构造器
    public Person() {
    }
    public Person(String n, boolean im) {
        name = n;
        isMale = im;
    }
    //方法 = 成员方法 = Method = 函数
    public void walk() {
        System.out.println("人走路");
    }
    public void talk(String language){
        System.out.println("Tom讲的是"+language);
    }
    public String display() {
        return "名字是" +
                name +
                ",是否结婚：" +
                isMale;
    }
    public void sleep(){
        System.out.println("人睡觉...");
    }
    //内部类
    class Pet {
        String name;
        String race;
    }
}

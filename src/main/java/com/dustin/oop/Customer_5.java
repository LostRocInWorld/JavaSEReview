package com.dustin.oop;

/**
 * @Project JavaSEReview
 * @Package com.dustin.object
 * @ClassName Customer_5
 * @Description 类中方法的使用
 * @Date 2022/9/15   03:09
 * @Created by Dustin_Peng
 */
public class Customer_5 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.eat();
        customer.sleep(10);
    }
}

class Customer {
    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat() {
        System.out.println("客户吃饭");
    }

    public void sleep(int hour) {
        System.out.println("休息了" +
                hour +
                "个小时");
    }

    public String getName() {
        return name;
    }

    public String getNation(String nation) {
        String info = "我的国籍是" +
                nation;
        return info;
    }
}
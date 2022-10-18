package com.dustin.oop;

/**
 * @Project JavaSEReview
 * @Package com.dustin.object
 * @ClassName InstanceTest_10
 * @Description 匿名对象
 * @Date 2022/9/16   03:44
 * @Created by Dustin_Peng
 */
public class InstanceTest_11 {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p);

        p.sendEmail();
        p.playGame();

        //匿名
        new Phone().sendEmail();
        new Phone().showPrice(1999);

        PhoneMall mall = new PhoneMall();
        mall.show(new Phone());

    }
}
class Phone{
    double price;
    public void sendEmail(){
        System.out.println("发送邮件");
    }

    public void playGame(){
        System.out.println("打游戏");
    }

    public void showPrice(double pri){
        price = pri;
        System.out.println("手机价格为"+price);
    }
}

class PhoneMall {
    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}
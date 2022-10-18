package com.dustin.kwinterface;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwinterface
 * @ClassName InterfaceTest
 * @Description 接口
 * @Date 2022/9/23   21:58
 * @Created by Dustin_Peng
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);//静态
//        Flyable.MIN_SPEED = 2;    //final的
        Plane p = new Plane();
        p.fly();

        MonkeyKite m = new MonkeyKite();
        m.fly();
        m.stop();
        System.out.println(m.MIN_SPEED);

    }
}

package com.dustin.kwinterface.exer;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwinterface
 * @ClassName Ball
 * @Description 练习
 * @Date 2022/9/23   23:24
 * @Created by Dustin_Peng
 */
public class Ball implements Rollable{



        private String name;
        //name的getter和setter


    public Ball(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //play()仍为是对两个接口的play()方法都重写了
        public void play(){
            //ball = new Ball("FootBall");//ball为静态和final的，不能重新赋值
            ball.setName("FootBalll");
            System.out.println(ball.getName());
        }
    }

interface Playable {
    void play();
}
interface Bounceable {
    void play();
}
interface Rollable extends Playable,Bounceable {
    Ball ball = new Ball("PingPong");
}
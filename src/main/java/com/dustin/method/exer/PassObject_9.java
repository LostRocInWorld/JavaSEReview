package com.dustin.method.exer;

import javafx.scene.shape.Circle;

/**
 * @Project JavaSEReview
 * @Package com.dustin.method.exer
 * @ClassName PassObject_9
 * @Description 练习2
 * @Date 2022/9/17   02:00
 * @Created by Dustin_Peng
 */
public class PassObject_9 {
    public static void main(String[] args) {
        PassObject_9 test = new PassObject_9();
        Circle_8 c = new Circle_8();
        test.printArea(c,6);
        System.out.println("radius is:"+c.radius);
    }
    public void printArea(Circle_8 c,int times){
        if(times>0){
            for (int i = 1; i <= times; i++) {
                c.radius = i;
                System.out.println("Radius:"+i+"\t\t"+"Area:"+c.getArea());
            }
            c.radius++;
        }
    }
}

package com.dustin.reflection;

import java.io.Serializable;

/**
 * @author Dustin_Peng
 * @Description 反射
 * @create 2022-10-17-22:28
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;
    public void breath(){
        System.out.println("生物呼吸");
    }
    public void eat(){
        System.out.println("生物吃东西");
    }

}

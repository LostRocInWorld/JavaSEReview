package com.dustin.basic;

/**
 * @Project JavaSEReview
 * @Package com.dustin
 * @ClassName LogicExer_13
 * @Description 逻辑运算
 * @Date 2022/9/8   04:03
 * @Created by Dustin_Peng
 */
public class LogicExer_13 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        short z = 42;
        //if ( y == true)
        if((z++==42)&&(y=true))z++;//44
        if((x=false)||(++z==45))z++;//46
        //求z的值
        System.out.println("z="+z);
    }
}

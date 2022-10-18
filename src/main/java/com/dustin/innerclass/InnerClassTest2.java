package com.dustin.innerclass;

/**
 * @Project JavaSEReview
 * @Package com.dustin.innerclass
 * @ClassName InnerClassTest2
 * @Description 内部类使用的注意点
 * @Date 2022/9/24   02:23
 * @Created by Dustin_Peng
 */
public class InnerClassTest2 {
    public void method(){
        //局部变量
        int num = 10;
        class AA{
            public void show(){
                System.out.println(num);
//                num = 20; //内部类使用所属方法中的局部变量不能重新赋值
            }
        }
    }
}

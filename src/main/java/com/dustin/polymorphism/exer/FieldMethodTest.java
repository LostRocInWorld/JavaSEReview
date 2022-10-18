package com.dustin.polymorphism.exer;

/**
 * @Project JavaSEReview
 * @Package com.dustin.polymorphism.exer
 * @ClassName FieldMethodTest
 * @Description 多态性练习
 * @Date 2022/9/21   03:32
 * @Created by Dustin_Peng
 */
public class FieldMethodTest {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);//20
        s.display();//20
        Base b = s;
        //"=="对于引用数据来讲，比较两个引用数据类型变量的内存地址是否相同
        System.out.println(b == s);//true(内存地址)
        System.out.println(b.count);//10
        b.display();//20
    }
}
class Base{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
}

class Sub extends Base{
    int count = 20;
    public void display(){
        System.out.println(this.count);
    }
}
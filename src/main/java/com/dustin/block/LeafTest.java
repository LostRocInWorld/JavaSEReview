package com.dustin.block;

/**
 * @Project JavaSEReview
 * @Package com.dustin.block
 * @ClassName LeafTest
 * @Description 代码块练习
 * @Date 2022/9/23   01:40
 * @Created by Dustin_Peng
 */
public class LeafTest {
    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        System.out.println("********");
        Leaf leaf1 = new Leaf();

    }
}
class Root{
    static{
        System.out.println("Root的静态代码块");
    }
    {
        System.out.println("Root的普通代码块");
    }
    public Root() {
        System.out.println("Root的无参构造器");
    }
}
class Mid extends Root{
    static{
        System.out.println("Mid的静态代码块");
    }
    {
        System.out.println("Mid的普通代码块");
    }
    public Mid() {
        System.out.println("Mid的无参构造器");
    }
    public Mid(String msg){
        this();
        System.out.println("Mid的带参构造器，其参数值msg为："+msg);
    }
}

class Leaf extends Mid{
    static{
        System.out.println("Leaf的静态代码块");
    }
    {
        System.out.println("Leaf的普通代码块");
    }
    public Leaf() {
        //调用父类的带参构造器
        super("尚硅谷");
        System.out.println("Leaf的无参构造器");
    }
}

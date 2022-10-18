package com.dustin.constuctor;

/**
 * @Project JavaSEReview
 * @Package com.dustin.encapsulation1
 * @ClassName UserTest_5
 * @Description 属性赋值的顺序
 * @Date 2022/9/17   23:17
 * @Created by Dustin_Peng
 */
public class UserTest_4 {
    public static void main(String[] args) {
        //默认没有构造器和属性显示赋值
        User u = new User();
        System.out.println(u.age);//0
        u.age=1;
        System.out.println(u.age);//1
        //有构造器和属性显示赋值
        User u1 = new User(2);
        System.out.println(u1.age);
        u1.setAge(3);
        System.out.println(u1.age);
    }

}
class User{
    String name;
    int age = 1;

    public User(){}

    public User(int a){
        age = a;
    }

    public void setAge(int a){
        age =a ;
    }
}

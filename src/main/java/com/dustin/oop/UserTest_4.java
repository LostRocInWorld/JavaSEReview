package com.dustin.oop;

/**
 * @Project JavaSEReview
 * @Package com.dustin.object
 * @ClassName UserTest_4
 * @Description 类中属性的使用
 * @Date 2022/9/15   02:45
 * @Created by Dustin_Peng
 */
public class UserTest_4 {
    public static void main(String[] args) {
        //成员变量 vs 局部变量
        //默认初始化值
        User user = new User();
        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.isMale);

        //局部变量在调用时必须赋值
        user.talk("日语");
    }

}

class User {
    //属性(或成员变量)
    String name;
    int age;
    boolean isMale;

    /**
     *
     * @param language 说的什么语言
     */
    public void talk(String language) {//language:形参，也是局部变量
        System.out.println("我们使用" + language + "进行交流");
    }

    public void eat() {
        String food = "烙饼";//局部变量
        System.out.println("北方人喜欢吃" + food);
    }
}

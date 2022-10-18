package com.dustin.innerclass;

/**
 * @Project JavaSEReview
 * @Package com.dustin.innerclass
 * @ClassName InnerClassTest
 * @Description 内部类
 * @Date 2022/9/24   01:09
 * @Created by Dustin_Peng
 */
public class InnerClassTest {
    public static void main(String[] args) {
        //创建Dog实例(静态的成员内部类)
        Person.Dog dog = new Person.Dog();
        dog.show();
        //创建Bird实例(非静态的成员内部类)
        Person.Bird bird = new Person().new Bird("八阿哥");
        bird.sing();
        bird.display("黄鹂");
    }

}
class Person{
    String name;
    int age;

    public void eat(){
        System.out.println("吃饭");
    }

    public static void walk(){
        System.out.println("走路");
    }
    //局部内部类
    public void method(){
        class AA{
        }
    }
    {
        class BB{
        }
    }

    public Person() {
        class CC{
        }
    }

    //静态成员内部类
    static class Dog{
        String name;
        int age;

        public void show(){
            System.out.println("卡莱是条狗");
//            eat();//静态的成员内部类不能调用非静态的
        }
    }
    //非静态成员内部类
    class Bird {
        String name;

        public Bird(String name) {
            this.name = name;
        }

        public void sing(){
            System.out.println("我是一只小小鸟");
            Person.this.eat();//调用外部类的属性
        }

        public void display(String name){
            System.out.println(name);//方法的形参
            System.out.println(this.name);//内部类的属性
            System.out.println("主人是："+Person.this.name);//外部类的属性
        }
    }
    //成员内部类
    abstract class Cat{}
}
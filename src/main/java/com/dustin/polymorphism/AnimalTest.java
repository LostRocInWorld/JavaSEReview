package com.dustin.polymorphism;

/**
 * @Project JavaSEReview
 * @Package com.dustin.polymorphism
 * @ClassName AnimalTest
 * @Description 多态性举例
 * @Date 2022/9/21   01:57
 * @Created by Dustin_Peng
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());
    }
    public void func(Animal animal){
        animal.eat();
        animal.shot();
    }
}

class Animal{
    public void eat(){
        System.out.println("动物进食");
    }

    public void shot(){
        System.out.println("动物叫");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void shot(){
        System.out.println("汪汪汪");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void shot(){
        System.out.println("喵喵喵");
    }
}
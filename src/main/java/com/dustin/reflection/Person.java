package com.dustin.reflection;

/**
 * @author Dustin_Peng
 * @Description 反射
 * @create 2022-10-17-22:28
 */
class Person {
    private String name;
    int age;
    public int id;


    public Person() {
        System.out.println("调用Person的空参构造器");
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
    }


    public void show() {
        System.out.println("你好我是一个人");
    }

    private String showNation(String nation) {
        System.out.println("我的国籍是" + nation);
        return nation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

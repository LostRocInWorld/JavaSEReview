package com.dustin.keywordsuper;

import java.util.Objects;

/**
 * @Project JavaSEReview
 * @Package com.dustin.keywordsuper
 * @ClassName Student
 * @Description super关键字的使用
 * @Date 2022/9/20   22:57
 * @Created by Dustin_Peng
 */
public class Student extends Person {
    String major;
    /**
     * 学号
     */
    int id = 1002;

    public Student() {
    }

    public Student(String major) {
        this.major = major;
    }

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生：多吃有营养的食物");
    }

    public void study() {
        System.out.println("学生学习知识");
        eat();//调用重写的方法
        super.eat();//调用父类的方法
    }

    public void show() {
        System.out.println("name = " + this.name + ", age = " + super.age + ", id = " + id);//id=1002
        System.out.println("id = " + super.id);//调用父类的id，id=1001
    }

//    /**
//     * 比较两个的实体内容是否相同，手动实现
//     *
//     * @param obj 需要比较的对象，Student类
//     * @return 比较的结果
////     */
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if(obj == null){
//            return false;
//        }
//        if (obj instanceof Student) {
//            Student anotherStudent = (Student) obj;
//            return anotherStudent.major.equals(this.major) && anotherStudent.name.equals(this.name) && anotherStudent.age == this.age;
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        if(student.name == null || student.major == null) return false;
        if(this.name == null || this.major == null) return false;
        return age == student.age && name.equals(student.name) && id == student.id && major.equals(student.major);

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", major='" + major + '\'' +
                ", id=" + id +
                '}';
    }
}

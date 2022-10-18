package com.dustin.maps;

import java.util.Objects;

/**
 * @author Dustin_Peng
 * @Description Person类
 * @create 2022-10-06-05:12
 */
public class Person implements Comparable {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
//        System.out.println("调用了Person的equals方法");
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && getName().equals(person.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
//        System.out.println("调用了Person的hashCode()");
        int hash = Objects.hash(getName(), getAge());
//        System.out.println(hash);
        return hash;
    }

    @Override
    public int compareTo(Object o) {
        //按照姓名，年龄从小到大排序
        if (o instanceof Person) {
            Person p = (Person) o;
            int compare = this.getName().compareTo(p.getName());
            if (0 != compare) {
                return compare;
            } else {
                return Integer.compare(this.getAge(), p.getAge());
            }
        }
        throw new ClassCastException("类型不匹配");
    }
}

package com.dustin.iostream;

import org.junit.Test;

import java.io.*;

/**
 * @author Dustin_Peng
 * @Description 对象流的使用
 * 1.ObjectInputStream
 * 2.ObjectOutputStream
 * @create 2022-10-12-04:23
 */
public class ObjectIOTest {
    @Test
    public void test1() {
        //序列化过程，将内存中的java对象保存到磁盘中或通过网络传输出去
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
            oos.writeObject(new String("Hello 中国!"));
            oos.writeObject(new Person("王二",23,32,new Account(10000)));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2() {
        //反序列化过程
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));
            //读取仍然按照写入顺序，一般传输都是同一个类型
            String o = (String) ois.readObject();
            Person p = (Person) ois.readObject();
            System.out.println("o = " + o);
            System.out.println(p);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class Person implements Serializable{//标识接口
    private String name;
    private int age;
    private int id;
    private Account ac;
    public static final long serialVersionUID = 47841484151155L;//序列版本号

    //构造器，toString，getter&setter


    public Person(String name, int age, int id, Account ac) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.ac = ac;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getAc() {
        return ac;
    }

    public void setAc(Account ac) {
        this.ac = ac;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", ac=" + ac +
                '}';
    }
}
class Account  implements Serializable{
    private double balance;
    private static final long serialVersionUID = 51484845485415l;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "余额为"+ balance;
    }
}
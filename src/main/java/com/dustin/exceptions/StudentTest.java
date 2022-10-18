package com.dustin.exceptions;

/**
 * @Project JavaSEReview
 * @Package com.dustin.exceptions
 * @ClassName StudentTest
 * @Description throw抛出异常
 * @Date 2022/9/26   23:09
 * @Created by Dustin_Peng
 */
public class StudentTest {
    public static void main(String[] args)  {
        try {
            Student s = new Student();
            s.register(-1001);
            System.out.println(s.id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class Student{
    int id;
    public void register(int id)  {
        if (id > 0){
            this.id = id;
        }else {
//            System.out.println("您输出的数据非法!");
            //手动抛出异常
//            throw new RuntimeException("你输入的数据非法");
            throw new MyException("你输入的数据非法");//Exception包括编译时异常，需要进行异常的处理
        }
    }
}

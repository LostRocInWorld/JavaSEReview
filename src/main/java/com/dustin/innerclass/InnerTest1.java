package com.dustin.innerclass;

/**
 * @Project JavaSEReview
 * @Package com.dustin.innerclass
 * @ClassName InnerTest1
 * @Description 内部类
 * @Date 2022/9/24   01:29
 * @Created by Dustin_Peng
 */
public class InnerTest1 {
    //开发很少见
    public void method(){
        class AA{}
    }
    //返回一个实现了Comparable接口的对象
    public Comparable getComparable(){
        //创建了一个实现了Comparable接口的非匿名类的匿名对象
//        class MyComparable implements Comparable{
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new MyComparable();
//
        //方式二:匿名实现类的匿名对象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}

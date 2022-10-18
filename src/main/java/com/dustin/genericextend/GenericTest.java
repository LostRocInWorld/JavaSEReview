package com.dustin.genericextend;

import org.junit.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Dustin_Peng
 * @Description 泛型在继承的体现
 * @create 2022-10-08-04:41
 */
public class GenericTest {
    @Test
    public void test1(){
        Object obj = null;
        String str = null;
        obj = str;

        Object[] arr1 = null;
        String[] arr2 = null;
        arr1 = arr2;

        List<Object> list1 = null;
        List<String> list2 = null;
        //此时list1和list2的类型不具备子父类关系
//        list1 = list2;
        //反证法：
        // 架设list1=list2;  两者在堆空间指向同一对象实体
        //list1.add(123);//导致混入非String的数据，出错

        AbstractList<String> list3 = null;//抽象类
        List<String> list4 = null;//接口
        ArrayList<String> list5 = null;
        list4 = list3;
        list4 = list5;
    }

    @Test
    public void test3(){
//        List<Object> list1 = null;
//        List<String> list2 = null;
        List<?> list = null;//作为上述的通用父类
//编译通过
//        list = list1;
//        list = list2;
//        print(list2);
        //
        List<String> list3 = new ArrayList<>();
        list3.add("AA");
        list3.add("BB");
        list3.add("CC");
        list = list3;
        //写入数据:对应List<?>就不能向其内部写入数据
        //除了添加null之外
        list.add(null);
        //读取数据，允许读取数据
        System.out.println(list.get(1));


    }

    /**
     * 有限制条件的使用
     */
    @Test
    public void test4(){
        List<? extends Person> list1 = null;
        List<? super Person> list2 = null;

        List<Object> list3 = new ArrayList<>();
        List<Person> list4 = new ArrayList<>();
        List<Student> list5 = new ArrayList<>();

//        list1 = list3;//编译不通过
        list1 = list4;
        list1 = list5;

        list2 = list3;
        list2 = list4;
//        list2 = list5;////编译不通过
        //读取数据
//        Person person = list1.get(0);
//        Object object = list2.get(0);

        //写入数据
//        list1.add(new Person());//编译通过，不可写入任何非null数据
        list2.add(new Person());//可以写入小于Person的数据
        list2.add(new Student());
//        list2.add(new Object());//不可写入大于Person的非null数据
    }

    public void print(List<?> list){
        Iterator<?> it = list.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}

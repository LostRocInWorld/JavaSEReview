package com.dustin.collectionclass;

import org.junit.Test;

import java.util.*;

/**
 * @author Dustin_Peng
 * @Description 遍历集合
 * @create 2022-10-06-02:56
 */
public class IteratorTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("bb");
        coll.add(123);
        coll.add(false);
        coll.add(new Person("Jerry", 25));
        coll.add(new String("Tom"));

        Iterator iterator = coll.iterator();
        //next可能会抛出NoSuchElementException
        //方式一
        for (int i = 0; i < coll.size() - 1; i++) {
            System.out.println(iterator.next());
        }
        //方式二
        Iterator it = coll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Test
    public void test2() {
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("bb");
        coll.add(123);
        coll.add(false);
        coll.add(new Person("Jerry", 25));
        coll.add(new String("Tom"));

        Iterator it = coll.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if ("Tom".equals(obj)) {
                //删除集合中数据  "Tom"
                it.remove();
            }
        }
        System.out.println(coll);
    }

    /**
     * foreach循环
     */
    @Test
    public void test3() {
        ArrayList coll = new ArrayList();
        coll.add("AA");
        coll.add("bb");
        coll.add(123);
        coll.add(false);
        coll.add(new Person("Jerry", 25));
        coll.add(new String("Tom"));
        //for(集合/数组元素类型 局部变量 : 集合/数组对象)
        for (Object obj :
                coll) {
            System.out.println(obj);
        }

        int[] arr = {1, 2, 3, 4};
        for (int i :
                arr) {
            System.out.println(i);
        }

    }

    /**
     * foreach练习
     */
    @Test
    public void test4(){
        String[] arr = {"MM", "MM", "MM"};
        //普通for循环
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "GG";
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        //foreach循环
        for (String s :
                arr) {
            s = "GG";
        }
        for (String s :
                arr) {
            System.out.println(s);//都是MM
        }

        int[] arr1 = {1, 2, 3, 4};
        for (int i :
                arr1) {
            i = 6;
        }
        System.out.println(Arrays.toString(arr1));

        Person p1 = new Person("Jerry", 25);
        Person p2 = new Person("Tom", 25);
        Person p3 = new Person("linx", 25);

        Person[] people = {p1, p2, p3};
        for (Person p :
                people) {
            p.setName("ss");
            p.setAge(12);
        }
        System.out.println(Arrays.toString(people));

    }

    @Test
    public void test5(){
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("bb");
        coll.add(123);
        coll.add(false);
        coll.add(new Person("Jerry", 25));
        coll.add(new String("Tom"));

        coll.forEach(System.out::println);
    }
}

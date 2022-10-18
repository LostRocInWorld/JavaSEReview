package com.dustin.generic;

import org.junit.Test;

import java.util.*;

/**
 * @author Dustin_Peng
 * @Description 泛型的使用
 * @create 2022-10-08-03:08
 */
public class GenericTest {
    /**
     * 在集合使用泛型之前
     */
    @Test
    public void test1() {
        ArrayList list = new ArrayList();
        //表示放学生成绩
        list.add(78);
        list.add(89);
        list.add(90);
        list.add(88);
        //问题一：类型不安全
        list.add("Tom");

        for (Object score : list) {
            //问题二：强转时，可能出现类型转换异常（ClassCastException）
            int stuScore = (Integer) score;
            System.out.println(stuScore);
        }
    }

    /**
     * 在集合中使用泛型
     */
    @Test
    public void test2() {
        //泛型是类类型，需要声明类，而不是基本数据类型
        ArrayList<Integer> list = new ArrayList<Integer>();
        //表示放学生成绩
        list.add(78);
        list.add(89);
        list.add(90);
        list.add(88);

//        list.add("Tom");//编译时进行类型检查，保证数据安全
        for (Integer score : list) {
            //避免强转操作
            int stuScore = score;
        }
//使用迭代器时也会使用泛型,public Iterator<E> iterator()
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int stuScore = it.next();
        }
    }

    /**
     * 在HashMap中使用泛型
     */
    @Test
    public void test3() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key",1);
        //泛型的嵌套
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey()+"===>"+entry.getValue());
        }
    }

}

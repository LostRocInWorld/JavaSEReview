package com.dustin.maps;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Dustin_Peng
 * @Description TreeMap
 * @create 2022-10-07-04:36
 */
public class TreeMapTest {
    @Test
    public void test1(){
        //自然排序
        TreeMap map = new TreeMap();
        Person p1 = new Person("Tom", 14);
        Person p2 = new Person("Jerry", 18);
        Person p3 = new Person("Jack", 15);
        Person p4 = new Person("Rose", 16);
        map.put(p1,98);
        map.put(p2,89);
        map.put(p3,77);
        map.put(p4,100);
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey() + "===>" + entry.getValue());
        }

        //定制排序
        TreeMap map1 = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    return Integer.compare(((Person) o1).getAge(),((Person) o2).getAge());
                }
                throw new RuntimeException("输入类型不匹配");
            }
        });

        map1.put(p1,98);
        map1.put(p2,89);
        map1.put(p3,77);
        map1.put(p4,100);
        Iterator it1 = map1.entrySet().iterator();
        while(it1.hasNext()){
            Map.Entry entry = (Map.Entry) it1.next();
            System.out.println(entry.getKey() + "===>" + entry.getValue());
        }
    }
}

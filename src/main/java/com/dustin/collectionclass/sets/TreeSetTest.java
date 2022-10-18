package com.dustin.collectionclass.sets;

import com.dustin.collectionclass.Person;
import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Dustin_Peng
 * @Description TreeSet
 * @create 2022-10-06-22:36
 */
public class TreeSetTest {
    @Test
    public void test1() {
        TreeSet set = new TreeSet();
        //不能添加不同类的数据
//        set.add(456);
//        set.add(123);
//        set.add("AA");
//        set.add("CC");
        //添加Integer数据
//        set.add(456);
//        set.add(123);
//        set.add(34);
//        set.add(-12);
//        set.add(8);
        //添加自定义对象
        set.add(new Person("Tom",20));
        set.add(new Person("Jerry",23));
        set.add(new Person("Jack",45));
        set.add(new Person("Jack",56));


        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    @Test
    public void test2() {
        TreeSet set = new TreeSet(new Comparator() {
            //按照年龄从小到大排序
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                return Integer.compare(((Person) o1).getAge(),((Person) o2).getAge());}
                throw new RuntimeException("输入的数据不匹配");
            }
        });
        set.add(new Person("Tom",20));
        set.add(new Person("Jerry",23));
        set.add(new Person("Jack",45));
        set.add(new Person("Jack",56));
        set.add(new Person("Mary",23));
        set.add(new Person("Dicky",20));
        System.out.println(set);
    }
}

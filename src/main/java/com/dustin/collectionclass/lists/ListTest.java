package com.dustin.collectionclass.lists;

import com.dustin.collectionclass.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author Dustin_Peng
 * @Description List接口
 * @create 2022-10-06-03:38
 */
public class ListTest {
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom",22));
        list.add(456);
        System.out.println(list);

        //void add(int index,Object ele)
        list.add(1,"BB");
        List list1 = Arrays.asList(1, 2, 3);
        //boolean addAll(int index,Collection ele)
        list.addAll(2,list1);
        //Object get(int index)
        System.out.println(list.get(1));
        //int indexOf(Object obj)
        System.out.println(list.indexOf(456));//如果不存在返回-1
        //int lastIndexOf(Object obj)
        System.out.println(list.lastIndexOf(456));//如果不存在返回-1
        //Object remove(int index)
        Object remove = list.remove(1);
        //Object set(int index,Object ele)
        Object set = list.set(1, "CC");
        //List subList(int fromIndex,int toIndex)
        List list2 = list.subList(2, 4);

        //方式一:迭代器
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //方式二:foreach
        for (Object obj :
                list) {
            System.out.println(obj);
        }
        //方式三:普通循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

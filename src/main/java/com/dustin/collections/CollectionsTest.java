package com.dustin.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Dustin_Peng
 * @Description Collections--操作Collection丶Map的工具类
 * @create 2022-10-07-22:45
 */
public class CollectionsTest {
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(123);
        list.add(89);
        list.add(765);
        list.add(-97);
        list.add(0);
        //reverse(List)
        Collections.reverse(list);//[0, -97, 765, 89, 123]
        //shuffle(List)
        Collections.shuffle(list);//[89, 123, -97, 765, 0]--变化
        //sort(List)
        Collections.sort(list);//[-97, 0, 89, 123, 765]
        //swap(List,int i,int j)
        Collections.swap(list,2,4);//[-97, 0, 765, 123, 89]
        //int frequency(Collection,Object)
        System.out.println(Collections.frequency(list, 765));//1
        //void copy(List dest,List src)
        //错误方式
//        List dest = new ArrayList();
//        Collections.copy(dest,list);//java.lang.IndexOutOfBoundsException: Source does not fit in dest
        List dest = Arrays.asList(new Object[list.size()]);
        Collections.copy(dest,list);//dest:[-97, 0, 765, 123, 89]
        System.out.println(dest);
        System.out.println(list);

        //List<T> synchronizedList(List<T> list)返回的List即为线程安全的list
        List list1 = Collections.synchronizedList(list);
    }
}

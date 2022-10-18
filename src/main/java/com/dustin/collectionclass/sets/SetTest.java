package com.dustin.collectionclass.sets;

import com.dustin.collectionclass.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author Dustin_Peng
 * @Description Set接口
 * @create 2022-10-06-05:14
 */
public class SetTest {
    @Test
    public void test1(){
        HashSet set = new HashSet();
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new Person("Tom",20));
        set.add(new Person("Tom",20));
        set.add(129);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Test
    public void test2(){
        LinkedHashSet set = new LinkedHashSet();
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new Person("Tom",20));
        set.add(new Person("Tom",20));
        set.add(129);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

package com.dustin.collectionclass;

import org.junit.Test;

import java.util.*;

/**
 * @author Dustin_Peng
 * @Description Collection接口的方法
 * @create 2022-10-06-01:38
 */
@SuppressWarnings("rawtypes")
public class CollectionTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();
        //add(Object e):将元素e添加到集合中
        coll.add("AA");
        coll.add("bb");

        //size()：获取添加的元素的个数
        System.out.println(coll.size());
        //addAll(Collection col1):将col1集合的元素添加到当前的集合中
        Collection coll1 = new ArrayList();
        coll1.add(123);
        coll1.add(new Date());
        coll.add(coll1);
        System.out.println(coll);
        //clear():清空集合元素
        coll.clear();
        //isEmpty():判断当前集合是否为空（size()=0）
        System.out.println(coll.isEmpty());
        //contains(Object obj):判断当前集合是否包含obj，我们在判断时会调用obj对象所在类的equals()方法
        coll.add(false);
        coll.add(new String("Tom"));
        coll.add(new Person("Jerry", 25));
        coll.contains(123);
        System.out.println(coll.contains(new String("Tom")));//true
        System.out.println(coll.contains(new Person("Jerry", 25)));//false，调用equals方法，需要重写
        //containsAll(Collect coll1):判断coll1中的所有元素是否都存在于当前集合
        Collection coll2 = Arrays.asList(123, false);
        System.out.println(coll.containsAll(coll2));//false
    }

    @Test
    public void test2() {
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("bb");
        coll.add(123);
        coll.add(new Person("Jerry", 25));
        //remove(Object obj):从当前集合中移除obj元素
        coll.remove(123);
        System.out.println(coll);
        System.out.println(coll.remove(new Person("Jerry", 25)));
        //removeAll(Collection coll1):从当前集合中移除coll1中所有的元素---差集
        Collection coll2 = Arrays.asList(123, false, "bb");
        coll.removeAll(coll2);
//        //retainAll(Collection coll1):获取当前集合与coll1中的交集，并返回给当前集合
//        Collection coll3 = Arrays.asList("AA",false,"bb");
//        coll.retainAll(coll3);
//        System.out.println(coll);
        //equals(Object obj):判断当前集合与形参集合元素都相同
        Collection coll3 = new ArrayList();
        coll3.add("AA");
        System.out.println(coll.equals(coll3));
    }

    @Test
    public void test3() {
        //hashCode():返回当前对象的哈希值
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("bb");
        coll.add(123);
        coll.add(new Person("Jerry", 25));
        System.out.println(coll.hashCode());//1652177274
        //toArray():集合转换为数组
        Object[] array = coll.toArray();
        System.out.println(Arrays.toString(array));
        //拓展：数组--->集合，调用Arrays.asList()方法
        List<String> list = Arrays.asList(new String[]{"aa", "bb", "cc"});//[aa, bb, cc]
        //注意，基本数据类型数组
        System.out.println(Arrays.asList(new int[]{1, 2, 3}));//[[I@61e4705b]  当成了一个集合元素
        System.out.println(Arrays.asList(new Integer[]{1, 2, 3}));//[1, 2, 3]
        //iterator():返回Iterator接口的实例，用于遍历集合元素

    }
}

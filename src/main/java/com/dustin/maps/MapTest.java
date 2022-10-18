package com.dustin.maps;

import org.junit.Test;

import java.util.*;


/**
 * @author Dustin_Peng
 * @Description Map接口
 * @create 2022-10-07-01:21
 */
public class MapTest {
    @Test
    public void MapTest(){
        HashMap map = new HashMap();
        Hashtable table = new Hashtable();
        map.put(null,null);
//        table.put(null,null);//NullPointerException
    }

    @Test
    public void HashMapTest(){
        HashMap map = new HashMap();//在实例化后，底层创建了一个长度16的一维数组Entry[] table
        //第n次put
        map.put("key1","value1");//调用key1.hashCode()方法（key1所在类重写）计算key1的哈希值，
        // 哈希值经过某种算法计算后，得到在Entry数组中的存放位置
        //如果此位置上数据为空，此时的“key1-value1”添加成功--->情况1
        //如果此位置上的数据不为空（意味着此位置上一个或多个以链表形式存在的数据），比较”key1“和已经存在的一个或多个数据的哈希值
        //      如果key1的哈希值与已存在的数据的哈希值都不相同，此时”key1-value1“添加成功--->情况2
        //      如果key1的哈希值与已存在的数据的哈希值相同，继续使用“key1”所在类的equals()方法进行比较
        //              如果equals()方法返回false，此时”key1-value1“添加成功--->情况3
        //              如果equals()方法返回true，使用“value1”替换相同key的value值
        //关于情况2和情况3，此时“key1-value1”与原来的数据以链表的方式存储
        //在不断的添加过程中，会涉及到扩容问题，默认扩容方式会扩容为原来容量的2倍，并将原有的数据复制过来

        LinkedHashMap map1 = new LinkedHashMap();
        map1.put(123,"AA");
        map1.put(456,"BB");
        map1.put(789,"CC");
        map1.put(111,"DD");
        System.out.println(map1);
    }
    @Test
    public void MapMethodTest(){

        HashMap map = new HashMap();
        //put(Object key,Object value)
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);
        map.put("AA",87);//修改
        System.out.println(map);//{AA=87, BB=56, 45=123}
        HashMap map1 = new HashMap();
        map1.put("CC",123);
        map1.put("DD",123);
        //putAll(Map m)
        map.putAll(map1);//{AA=87, BB=56, CC=123, DD=123, 45=123}
        //remove(Object key)
        map.remove("DD");
        System.out.println(map);//{AA=87, BB=56, CC=123, 45=123}

        //clear()
        map.clear();

        //size()
        System.out.println(map.size());//0
    }

    @Test
    public void MapMethodTest1() {

        HashMap map = new HashMap();
        //put(Object key,Object value)
        map.put("AA", 123);
        map.put(45, 123);
        map.put("BB", 56);

        //Object get(Object key)
        System.out.println(map.get("AA"));//123
        //boolean containsKey(Object key)
        System.out.println(map.containsKey("BB"));//true
        //boolean containsValue(Object value)
        System.out.println(map.containsValue(123));//true
        //int size()
        //boolean isEmpty()
        System.out.println(map.isEmpty());
        //boolean equals(Object obj)

        //元视图Set keySet()
        Set keySet = map.keySet();
        Iterator it = keySet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //Collection values()
        Collection values = map.values();
        Iterator it1 = values.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        //Set entrySet()
        Set entrySet = map.entrySet();
        Iterator it2 = entrySet.iterator();
        while(it2.hasNext()){
            Map.Entry entry = (Map.Entry) it2.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

}

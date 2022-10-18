package com.dustin.generic.exer;

import java.util.*;

/**
 * @author Dustin_Peng
 * @Description 自定义泛型练习
 * @create 2022-10-09-04:25
 */
public class DAO<T> {
    private Map<String,T> map = new HashMap<>();

    //保存T类型的对象到Map成员中
    public void save(String id,T entity){
        map.put(id,entity);
    }
    //从map中获取id对应的值
    public T get(String id){
        return map.get(id);
    }

    //替换map中key为id的内容，改为entity对象
    public void update(String id,T entity){
        if (map.containsKey(id)) {
            map.put(id,entity);
        }
    }
    //返回map中存放的所有T对象
    public List<T> list(){
        Collection<T> values = map.values();
        ArrayList<T> list = new ArrayList<>(values);
        return list;
    }

    //删除指定id的对象
    public void delete(String id){
        map.remove(id);
    }

}

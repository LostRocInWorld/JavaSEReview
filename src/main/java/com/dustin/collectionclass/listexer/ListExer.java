package com.dustin.collectionclass.listexer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dustin_Peng
 * @Description List面试题
 * @create 2022-10-06-05:04
 */
public class ListExer {
    @Test
    public void testListRemove(){
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);//add的实际是对象
        updateList(list);
        System.out.println(list);//[1,2]
    }

    private void updateList(List list) {
        list.remove(2);
    }
}

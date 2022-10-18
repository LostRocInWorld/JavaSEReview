package com.dustin.java8newfeature;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/**
 * @author Dustin_Peng
 * @Description Java内置的4大核心函数式接口
 * @create 2022-10-18-04:03
 */
public class LambdaTest2 {
    @Test
    public void test1(){
        happyTime(500,money -> System.out.println("学习太累了，去天上人间买了瓶矿泉水，花了"+money+"元"));
    }
    public void happyTime(double money, Consumer<Double> con){
        con.accept(money);
    }

    @Test
    public void test2(){
        List<String> list = Arrays.asList("北京", "天津", "东京", "西京", "普京");
        List<String> list1 = filterString(list, s -> s.contains("京"));
        System.out.println(list1);
    }
    //根据给定的规则，过滤集合中的字符串，此规则由Predicate决定
    public List<String> filterString(List<String> list, Predicate<String> pre){
        ArrayList<String> filterList = new ArrayList<>();
        for(String s : list){
            if(pre.test(s)){
                filterList.add(s);
            }
        }
        return filterList;
    }
}

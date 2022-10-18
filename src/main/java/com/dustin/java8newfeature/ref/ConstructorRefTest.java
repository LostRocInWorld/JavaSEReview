package com.dustin.java8newfeature.ref;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author Dustin_Peng
 * @Description 构造器引用
 * @create 2022-10-18-05:07
 */
public class ConstructorRefTest {
    @Test
    public void test1(){
        //Supplier中的T get()
        //Employee的空参构造器:Employee()
        Supplier<Employee> sup1 = () -> new Employee();

        Supplier<Employee> sup2 = Employee::new;
        System.out.println(sup2.get());
    }

    @Test
    public void test2(){
        //Function中的R apply(T t)
        //Employee中的构造器Employee(int id)
        Function<Integer,Employee> f1 = id -> new Employee(id);
        Employee e1 = f1.apply(1001);
        Function<Integer,Employee> f2 = Employee::new;
        Employee e2 = f2.apply(1003);
    }

    @Test
    public void test3(){
        //BiFunction中的R apply(T t,U u)
        //Employee中的构造器Employee(int id, String name)
        BiFunction<Integer,String,Employee> b1 = (id,name)->new Employee(id,name);
        Employee tom = b1.apply(1001, "Tom");
        BiFunction<Integer,String,Employee> b2 = Employee::new;
        Employee jack = b2.apply(1008, "Jack");
    }

    /**
     * 数组引用
     */
    @Test
    public void test4(){
        Function<Integer,String[]> f1 = length -> new String[length];
        String[] arr1 = f1.apply(12);
        System.out.println(Arrays.toString(arr1));
        Function<Integer,String[]> f2 = String[]::new;
    }
}

package com.dustin.java8newfeature.ref;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author Dustin_Peng
 * @Description 方法引用
 * @create 2022-10-18-04:38
 */
public class MethodRefTest {
    @Test
    public void test1() {
        //Consumer中的void accept(String t)
        //PrintStream中的void println(String s)
        //Lambda表达式
        Consumer<String> con1 = str -> System.out.println(str);
        con1.accept("北京");
        //方法引用
        Consumer<String> con2 = System.out::println;
        con2.accept("东京");
    }

    @Test
    public void test2() {
        //Supplier中的T get()
        //Employee中的String getName()
        Employee tom = new Employee(1001, "Tom", 23, 5600);
        Supplier<String> sup1 = () -> tom.getName();

        Supplier<String> sup2 = tom::getName;
        System.out.println(sup2.get());
    }

    @Test
    public void test3() {
        //Comparator中的int compare(T t1,T t2)
        //Integer中的int compare(T t1,T t2)
        Comparator<Integer> com1 = (t1,t2)->Integer.compare(t1,t2);
        System.out.println(com1.compare(12, 21));

        Comparator<Integer> com2 = Integer::compare;
    }

    @Test
    public void test4() {
        //Function中的R apply(T t)
        //Math中的Long round(Double d)
        Function<Double,Long> f1 = t -> Math.round(t);
        System.out.println(f1.apply(12.3));

        Function<Double,Long> f2 = Math::round;
        System.out.println(f2.apply(13.7));
    }
    @Test
    public void test5() {
        //Comparator中的 int compare(T t1,T t2)
        //String 中的 int t1.compareTo(t2)
        Comparator<String> com1 = (s1,s2)->s1.compareTo(s2);
        System.out.println(com1.compare("abc", "abd"));

        Comparator<String> com2 = String::compareTo;
        System.out.println(com2.compare("ace", "aae"));
    }

    @Test
    public void test6() {
        //BiPredicate中的boolean test(T t1,T t2)
        //String中的boolean t1.equals(t2)
        BiPredicate<String,String> pre1 =(s1,s2)->s1.equals(s2);
        System.out.println(pre1.test("nihao", "nihao"));

        BiPredicate<String,String> pre2 = String::equals;
        System.out.println(pre1.test("nihao", "nuhao"));
    }
    @Test
    public void test7(){
        //Function中的R apply(T t)
        //Employee中的int getAge()
        Employee tom = new Employee(1001, "Tom", 23, 5600);
        Function<Employee,Integer> f1 = e -> e.getAge();
        System.out.println(f1.apply(tom));

        Function<Employee,Integer> f2 = Employee::getAge;
        System.out.println(f2.apply(tom));
    }

}

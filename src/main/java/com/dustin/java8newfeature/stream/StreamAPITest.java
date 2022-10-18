package com.dustin.java8newfeature.stream;

import com.dustin.java8newfeature.ref.Employee;
import com.dustin.java8newfeature.ref.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Dustin_Peng
 * @Description Stream
 * @create 2022-10-18-22:41
 */
public class StreamAPITest {
    @Test
    public void test1(){
        //创建Stream方式一：通过集合
        //default Stream<E> stream() 返回一个顺序流，Collection接口中
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Employee> stream = employees.stream();
        //default Stream<E> parallelStream() 返回一个并行流，Collection接口中
        Stream<Employee> parallelStream = employees.parallelStream();
    }

    @Test
    public void test2() {
        int[] arr = {1,2,3,4,5,6};
        //创建Stream方式二：通过数组
        //Arrays类中static <T> Stream<T> stream(T[] array)
        IntStream stream = Arrays.stream(arr);
        Employee e1  = new Employee(1001,"Tom");
        Employee e2  = new Employee(1002,"Jerry");
        Employee[] employees = {e1, e2};
        Stream<Employee> stream1 = Arrays.stream(employees);
    }

    @Test
    public void test3() {
        //创建Stream方式三：通过Stream的of()
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);

    }
    @Test
    public void test4() {
        //创建Stream方式四：创建无限流
        //迭代：public static<T> Stream<T> iterate(final T seed,final UnaryOperator<T> f)
        //遍历前10个偶数，limit中间操作，forEach终止操作
        Stream.iterate(0,t -> t+2).limit(10).forEach(System.out::println);
        //生成：public static<T> Stream<T> generate(Supplier<T> s)
        //生成10个0-1的随机数
        Stream.generate(Math::random).limit(10).forEach(System.out::println);

    }



}

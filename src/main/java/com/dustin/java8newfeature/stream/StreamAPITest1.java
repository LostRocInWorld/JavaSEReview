package com.dustin.java8newfeature.stream;

import com.dustin.java8newfeature.ref.Employee;
import com.dustin.java8newfeature.ref.EmployeeData;
import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dustin_Peng
 * @Description Stream中间操作
 * @create 2022-10-18-23:06
 */
public class StreamAPITest1 {
    //将字符串的多个字符构成的集合转换为对应的Stream的实例
    public static Stream<Character> fromStringToStream(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            list.add(c);
        }
        return list.stream();
    }

    @Test
    public void test1() {
        List<Employee> list = EmployeeData.getEmployees();
        //filter(Predicate p)接收Lambda，从流中排除某些元素
        Stream<Employee> stream = list.stream();
        Stream<Employee> stream1 = list.stream();
        Stream<Employee> stream2 = list.stream();
        //练习：查询工资大于7000的
        stream.filter(e -> e.getSalary() > 7000).forEach(System.out::println);
        //limit(long maxSize)截断流，使其元素不超过给定数量互补。已经执行终止操作的流不能再被使用！！！
        list.stream().limit(3).forEach(System.out::println);
        //skip(long n)跳过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空流。与limit(n)
        list.stream().skip(3).forEach(System.out::println);
        list.stream().skip(30).forEach(System.out::println);//空流
        //distinct()筛选，通过流所生成元素的hashCode()和equals去除重复元素
        list.add(new Employee(1010, "扎克伯格", 35, 2500.32));
        list.add(new Employee(1002, "马云", 12, 9876.12));
        list.stream().distinct().forEach(System.out::println);
    }

    @Test
    public void test2() {
        //map(Function f)接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射为一个新的元素。类似于list中的add()，将返回整个流当做一个元素
        List<String> list = Arrays.asList("AA", "BB", "CC", "DD");
        //转换为小写
        list.stream().map(String::toLowerCase).forEach(System.out::println);
        //获取员工姓名长度大于3的员工的姓名
        List<Employee> list1 = EmployeeData.getEmployees();
        Stream<String> stringStream = list1.stream().map(Employee::getName);
        stringStream.filter(name -> name.length() > 3).forEach(System.out::println);
        //<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流。类似于list中的addAll()，将所有子流中的元素取出用于合并成一个新的流
        //体会map和flatMap的区别。练习1：map()
        Stream<Stream<Character>> streamStream = list.stream().map(StreamAPITest1::fromStringToStream);
        streamStream.forEach(s -> s.forEach(System.out::println));
        //练习2：flatMap
        Stream<Character> charStream = list.stream().flatMap(StreamAPITest1::fromStringToStream);
        charStream.forEach(System.out::println);
    }

    @Test
    public void test3() {
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList list2 = new ArrayList();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        list1.add(list2);//4个元素
        System.out.println(list1);//[1, 2, 3, [4, 5, 6]]
        list1.addAll(list2);//6个元素
        System.out.println(list1);//[1, 2, 3, [4, 5, 6], 4, 5, 6]
    }

    @Test
    public void test4() {
        //sort()自然排序
        List<Integer> list = Arrays.asList(12, 34, 32, 56, 53, 3132, 323, 9);
        list.stream().sorted().forEach(System.out::println);

        List<Employee> list1 = EmployeeData.getEmployees();
//        list1.stream().sorted().forEach(System.out::println);//抛出异常，要求类实现Comparable接口，重写compare方法
        //sorted(Comparator com)按比较器顺序排序
        list1.stream().sorted((e1, e2) -> {
            int ageVal = Integer.compare(e1.getAge(), e2.getAge());
            if (ageVal == 0) {
                return -Double.compare(e1.getSalary(), e2.getSalary());
            }
            return ageVal;
        })
                .forEach(System.out::println);
    }

    @Test
    public void test5() {
        List<Employee> list = EmployeeData.getEmployees();
        //allMatch(Predicate p)	检查是否匹配所有元素
        //是否所有员工的年龄大于18
        boolean allMatch = list.stream().allMatch(e -> e.getAge() > 18);
        System.out.println(allMatch);
        //anyMatch(Predicate p)	检查是否至少匹配一个元素
        //是否存在员工的工资大于1w
        boolean anyMatch = list.stream().anyMatch(e -> e.getSalary() > 10000);
        System.out.println(anyMatch);
        //noneMatch(Predicate p)	检查是否没有匹配所有元素
        //是否存在员工姓"雷"
        boolean noneMatch = list.stream().noneMatch(e -> e.getName().startsWith("雷"));
        System.out.println(!noneMatch);
        //findFirst()	返回第一个元素
        Optional<Employee> firstE = list.stream().findFirst();
        System.out.println(firstE);
        //findAny()	返回当前流中的任意元素
        //返回任意一个姓“马”的员工
        Optional<Employee> any = list.stream().filter(e -> e.getName().startsWith("马")).findAny();
        System.out.println(any);

    }

    @Test
    public void test6() {
        List<Employee> list = EmployeeData.getEmployees();
        //count()	返回流中元素总数
        //返回工资大于5000有多少员工
        long count = list.stream().filter(e -> e.getSalary() > 5000).count();
        System.out.println(count);
        //max(Comparator c)	返回流中最大值
        //返回最高的工资
        Optional<Double> maxSalary = list.stream().map(Employee::getSalary).max(Double::compare);
        System.out.println(maxSalary);
        //min(Comparator c)	返回流中最小值
        ////返回最低工资的员工
        Optional<Employee> minE = list.stream().min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(minE);
        //forEach(Consumer c)	内部迭代(使用Collection接口需要用户去做迭代，称为外部迭代。相反，StreamAPI使用内部迭代，它帮你把迭代做了)
        list.stream().forEach(System.out::println);
    }

    @Test
    public void test7() {
        //归约
//    reduce(T iden, BinaryOperator b)	可以将流中元素反复结合起来，得到一个值，返回T
        //计算1-10的自然数的和
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);
//    reduce(BinaryOperator b)	可以将流中元素反复结合起来，得到一个值，返回Optional<T>
        //计算公司中所有员工工资的总和
        List<Employee> list1 = EmployeeData.getEmployees();
        Stream<Employee> employeeStream = list1.stream();
        Stream<Double> salaryStream = employeeStream.map(Employee::getSalary);
        Optional<Double> sum1 = salaryStream.reduce((d1, d2) -> d1 + d2);
        System.out.println(sum1);
    }

    @Test
    public void test8() {
        //收集
        List<Employee> list = EmployeeData.getEmployees();
        //toList()
        List<Employee> list1 = list.stream().filter(e -> e.getSalary() > 6000).collect(Collectors.toList());
        list1.forEach(System.out::println);//Iterable中的方法
        System.out.println();
        //toSet()
        Set<Employee> set = list.stream().filter(e -> e.getSalary() > 6000).collect(Collectors.toSet());
        set.forEach(System.out::println);
        //toMap(Function<T,K> k,Function<T,U> v)
        Map<Integer, Employee> map = list.stream().filter(e -> e.getSalary() > 6000).collect(Collectors.toMap(Employee::getId, e -> e));
        map.forEach((key, value) -> System.out.println(key + "=" + value));
        //toCollection(Supplier<C> c)
        ArrayList<Employee> list2 = list.stream().collect(Collectors.toCollection(ArrayList::new));
        //counting(),求员工个数
        Long cnt = list.stream().collect(Collectors.counting());
        //summingDouble(ToDoubleFunction<T> m),求员工总工资
        Double sumSalary = list.stream().collect(Collectors.summingDouble(Employee::getSalary));
        //averagingInt(ToIntFunction<T> m)
        Double avrSalary = list.stream().collect(Collectors.averagingInt(Employee::getAge));
        //summarizingDouble(ToDoubleFunction<T> m)，求员工工资的统计情况
        DoubleSummaryStatistics statistics = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        double davr = statistics.getAverage();
        double dmax = statistics.getMax();
        //joining()把员工的姓名连接成字符串显示
        Stream<String> stringStream = list.stream().map(Employee::getName);
        String nameString = stringStream.collect(Collectors.joining("/"));
    }
}

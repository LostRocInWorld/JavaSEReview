package com.dustin.compare;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Dustin_Peng
 * @Description Jaba比较器。正常情况下，只能进行 == 或 != ，不能使用  > 或 <
 * 但是在开发场景中，我们需要对多个对象进行排序，言外之意，就需要比较对象的大小
 * @create 2022-10-04-01:08
 */
public class CompareTest {
    /**
     * Comparable接口使用--自然排序
     * 1.像String丶包装类等实现了Comparable接口，重写了compareTo(Object obj)方法，给出了比较两个对象大小的方式，进行了从小到大的排序
     * 2.重写compareTo()的规则:如果当前对象this大于形参对象obj，则返回正整数，若小于则返回负数，若等于则返回零
     * 3.对于自定义类，如果需要排序，我们可以让它实现Comparable接口，重写compareTo()并在方法中指明如何排序
     */
    @Test
    public void testComparable() {
        String[] arr = new String[]{"aa", "cc", "jj", "mm", "gg", "dd"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2() {
        Goods[] arr = new Goods[6];
        arr[0] = new Goods("LenovoMouse", 34);
        arr[1] = new Goods("DellMouse", 43);
        arr[2] = new Goods("XiaomiMouse", 12);
        arr[3] = new Goods("LogeticMouse", 65);
        arr[4] = new Goods("MicroMouse", 65);
        arr[5] = new Goods("HuaweiMouse", 43);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Comparator接口，定制排序
     */
    @Test
    public void test3() {
        String[] arr = new String[]{"aa", "cc", "jj", "mm", "gg", "dd"};
        //按照字符串从大到小排序
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("传入的类型不一致!");
            }
        });

        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test5() {
        Goods[] arr = new Goods[7];
        arr[0] = new Goods("LenovoMouse", 34);
        arr[1] = new Goods("DellMouse", 43);
        arr[2] = new Goods("XiaomiMouse", 12);
        arr[3] = new Goods("LogeticMouse", 65);
        arr[4] = new Goods("MicroMouse", 65);
        arr[5] = new Goods("HuaweiMouse", 43);
        arr[6] = new Goods("HuaweiMouse", 78);
        //产品名称从低到高，再按照价格从高到低
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Goods && o2 instanceof Goods) {
                    Goods s1 = (Goods) o1;
                    Goods s2 = (Goods) o2;
                    if (s1.getName().equals(s2.getName())) {
                        return -Double.compare(s1.getPrice(), s2.getPrice());
                    } else {
                        return s1.getName().compareTo(s2.getName());
                    }
                }
                throw new RuntimeException("传入数据类型不一致");
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}

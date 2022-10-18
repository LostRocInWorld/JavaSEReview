package com.dustin.collectionclass.exer;

import org.junit.Test;

import java.util.*;

/**
 * @author Dustin_Peng
 * @Description 练习
 * @create 2022-10-07-23:25
 */
public class CollectionExer {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int cnt = 1;
        ArrayList list = new ArrayList();
        while (cnt <= 10) {
            int i = readInt();
            if (i != Integer.MIN_VALUE) {
                list.add(i);
                cnt++;
            }
        }

        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Integer && o2 instanceof Integer) {
                    return -Integer.compare((Integer) o1, (Integer) o2);
                }
                throw new ClassCastException("list的类型不为整数");
            }
        });
        System.out.println(list);
    }

    public static int readInt() {
        System.out.print("请输入整数型数字：");
        int num;
        while (true) {
            String str = scanner.nextLine();
            try {
                num = Integer.parseInt(str);
                break;
            } catch (Exception e) {
                System.out.print("输入不正确，请重新输入：");
            }
        }
        return num;
    }

    @Test
    public void test2() {
        HashMap map = new HashMap();
        Map.Entry entry = (Map.Entry)map.entrySet();

    }
}

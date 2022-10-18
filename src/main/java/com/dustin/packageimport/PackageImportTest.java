package com.dustin.packageimport;

import com.dustin.oop.exer.Person_6;
import com.dustin.thistest.exer1.Account;

import java.lang.reflect.Field;
import java.util.*;

import static java.lang.System.out;

/**
 * @Project JavaSEReview
 * @Package com.dustin.packageimport
 * @ClassName PackageImportTest
 * @Description package和import的使用
 * @Date 2022/9/18   02:48
 * @Created by Dustin_Peng
 */
public class PackageImportTest {
    public static void main(String[] args) {
        String info = Arrays.toString(new int[]{1, 2, 3});
        System.out.println(info);

        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Scanner s = new Scanner(System.in);
        Person_6 p = new Person_6();

            Account a1 = new Account(1,2200,0.012);
            com.dustin.thistest.exer2.Account a2 = new com.dustin.thistest.exer2.Account(2322);

        Date d1 = new Date();
        java.sql.Date d2 = new java.sql.Date(5839353400853l);

        Field field = null;

        out.println("nihao");
    }
}


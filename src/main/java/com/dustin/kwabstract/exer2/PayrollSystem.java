package com.dustin.kwabstract.exer2;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwabstract.exer2
 * @ClassName PayrollSystem
 * @Description 工资系统
 * @Date 2022/9/23   05:13
 * @Created by Dustin_Peng
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] emps = new Employee[2];
        emps[0] = new SalariedEmployee("张三", 1002, new MyDate(2002, 10, 8), 10000);
        emps[1] = new HourlyEmployee("李四", 1003, new MyDate(2002, 5, 8), 70, 240);

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入本月的月份：");
        int month = scanner.nextInt();
        //方式二：
        Calendar calendar = Calendar.getInstance();
        int m = calendar.get(Calendar.MONTH)+1;
//        System.out.println(Arrays.toString(emps));
        for (int i = 0; i < emps.length; i++) {
            double earning = emps[i].earning();
            if (month == emps[i].getBirthday().getMonth()) {
                System.out.println("生日快乐，奖励100");
                earning += 100;
            }
            System.out.println("月工资为：" + earning);
        }


    }

}

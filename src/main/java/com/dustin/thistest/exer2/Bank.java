package com.dustin.thistest.exer2;

import java.util.Arrays;

/**
 * @Project JavaSEReview
 * @Package com.dustin.thistest.exer2
 * @ClassName Bank
 * @Description this练习2
 * @Date 2022/9/18   02:31
 * @Created by Dustin_Peng
 */
public class Bank {
    private Customer[] customers;//存放多个客户
    private int numberOfCustomers;//记录客户的个数

    public Bank() {
        customers = new Customer[10];
    }

    //添加客户
    public void addCustomer(String f, String l) {
        customers[numberOfCustomers++] = new Customer(f, l);
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index > numberOfCustomers) {
            throw new RuntimeException("不存在这个客户");
        }
        return customers[index];
    }
}

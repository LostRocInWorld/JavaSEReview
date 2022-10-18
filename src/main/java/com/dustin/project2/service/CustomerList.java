package com.dustin.project2.service;

import com.dustin.project2.bean.Customer;

/**
 * @Project JavaSEReview
 * @Package com.dustin.project2.service
 * @ClassName CustomerList
 * @Description 为Customer对象的管理模块，内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法，供CustomerView调用
 * @Date 2022/9/20   01:04
 * @Created by Dustin_Peng
 */
public class CustomerList {
    /**
     * 客户列表
     */
    private Customer[] customers;
    /**
     * 记录保存的客户对象的个数
     */
    private int total;

    /**
     * 用来初始化客户数组的构造器
     *
     * @param total 用来指定客户数组的长度
     */
    public CustomerList(int total) {
        this.customers = new Customer[total];
    }

    /**
     * 将指定客户添加到客户数组
     *
     * @param customer
     * @return 修改成功为true，修改失败为false
     */
    public boolean addCustomers(Customer customer) {
        if (total >= customers.length) {
            return false;
        }
        this.customers[total++] = customer;
        return true;

    }

    /**
     * 修改指定索引上的客户信息
     *
     * @param index    索引
     * @param customer 输入的信息创建的新用户
     * @return 修改成功为true，修改失败为false
     */
    public boolean replaceCustomer(int index, Customer customer) {
        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = customer;
        return true;
    }


    /**
     * 修改指定索引的用户，不需要新建Customer对象
     *
     * @param index  需要修改的用户的索引
     * @param name   姓名
     * @param gender 性别
     * @param age    年龄
     * @param phone  电话
     * @param email  邮件
     * @return 修改成功为true，修改失败为false
     */
    public boolean changeCustomer(int index, String name, char gender, int age, String phone, String email) {
        if (index < 0 || index >= total) {
            return false;
        }
        customers[index].setName(name);
        customers[index].setGender(gender);
        customers[index].setAge(age);
        customers[index].setPhone(phone);
        customers[index].setEmail(email);
        return true;
    }


    /**
     * 删除指定索引上的客户信息
     *
     * @param index 索引
     * @return 修改成功为true，修改失败为false
     */
    public boolean delCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        //最后一个数据需要置空
        customers[--total] = null;
        return true;
    }

    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 获取指定索引的客户
     *
     * @param index 索引
     * @return 指定索引的客户
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }

    /**
     * 获取存储的客户数量
     *
     * @return 存储的客户数量
     */
    public int getTotal() {
        return this.total;
    }
}

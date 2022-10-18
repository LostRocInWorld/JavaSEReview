package com.dustin.project2.view;

import com.dustin.project2.bean.Customer;
import com.dustin.project2.service.CustomerList;
import com.dustin.project2.util.CMUtility;

/**
 * @Project JavaSEReview
 * @Package com.dustin.project2.view
 * @ClassName CustomerView
 * @Description 负责菜单的显示和处理用户操作
 * @Date 2022/9/20   01:06
 * @Created by Dustin_Peng
 */
public class CustomerView {
    public  CustomerList custList = new CustomerList(10);

    public static void  main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.custList.addCustomers(new Customer("张三", '男', 29, "390332795", "322332@qq.com"));
        customerView.enterMainMenu();
    }

    /**
     * 显示客户信息管理系统界面
     */
    public  void enterMainMenu() {
        boolean goFlag = true;
        while (goFlag) {
            System.out.println("------------客户信息管理软件------------");
            System.out.println("\t\t" + "1. 添 加 客 户" + "\t\t");
            System.out.println("\t\t" + "2. 修 改 客 户" + "\t\t");
            System.out.println("\t\t" + "3. 删除 客 户" + "\t\t");
            System.out.println("\t\t" + "4. 客 户 列 表" + "\t\t");
            System.out.println("\t\t" + "5. 退 出" + "\t\t");
            System.out.print("\t" + "请选择(1-5)：");
            char menu = CMUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    delCustomer();
                    break;
                case '4':
                    listAllCustomer();
                    break;
                case '5':
                    System.out.print("是否确认退出?(Y/N):");
                    char confirm = CMUtility.readConfirmSelection();
                    if ('Y' == confirm) {
                        goFlag = false;
                        System.out.println("------------系统退出------------");
                    }
                    break;
            }
//            break;
        }

    }

    /**
     * 添加客户的操作
     */
    public  void addNewCustomer() {
        System.out.print("姓名：");
        String name = CMUtility.readString(10);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(13);
        System.out.print("邮箱：");
        String email = CMUtility.readString(20);
        Customer customer = new Customer(name, gender, age, phone, email);
        boolean add = custList.addCustomers(customer);
        if (add) {
            System.out.println("------添加成功------");
        } else {
            System.out.println("------客户列表已满，添加失败------");
            addNewCustomer();
        }

    }

    /**
     * 修改客户的操作
     */
    public  void modifyCustomer() {
        Customer temp;
        int id;
        for (; ; ) {
            System.out.print("请输入想要修改的客户的编号(-1退出):");
            id = CMUtility.readInt();

            if (id >= 1 && id <= custList.getTotal()) {
                temp = custList.getCustomer(id - 1);
                if (temp == null) {
                    return;
                }
                break;
            } else if (id == -1) {
                System.out.println("------退出修改------");
                return;
            } else {
                System.out.println("无法找到指定客户编号");
            }
        }

        System.out.print("姓名(" + temp.getName() + ")：");
        String name = CMUtility.readString(10, temp.getName());
        System.out.print("性别(" + temp.getGender() + ")：");
        char gender = CMUtility.readChar(temp.getGender());
        System.out.print("年龄(" + temp.getAge() + ")：");
        int age = CMUtility.readInt(temp.getAge());
        System.out.print("电话(" + temp.getPhone() + ")：");
        String phone = CMUtility.readString(13, temp.getPhone());
        System.out.print("邮箱(" + temp.getEmail() + ")：");
        String email = CMUtility.readString(20, temp.getEmail());

//        Customer newCustomer = new Customer(name, gender, age, phone, email);
//        boolean isChanged = custList.replaceCustomer(id - 1, newCustomer);
        boolean isChanged = custList.changeCustomer(id - 1, name,gender,age,phone,email);
        if (isChanged) {
            System.out.println("------修改完成------");
        } else {
            System.out.println("------修改失败------");
        }
    }

    /**
     * 删除客户的操作
     */
    public  void delCustomer() {
        Customer temp;
        int id;
        for (; ; ) {
            System.out.print("请输入想要删除的客户的编号(-1退出):");
            id = CMUtility.readInt();

            if (id >= 1 && id <= custList.getTotal()) {
                temp = custList.getCustomer(id - 1);
                if (temp == null) {
                    return;
                }
                break;
            } else if (id == -1) {
                System.out.println("------退出删除------");
                return;
            } else {
                System.out.println("无法找到指定客户编号");
            }
        }

        System.out.println("是否确认删除(Y/N)?：");
        char isDel = CMUtility.readConfirmSelection();
        if ('Y' == isDel) {
            boolean delCustomer = custList.delCustomer(id - 1);
            if(delCustomer){
                System.out.println("删除客户" + id + "：" + temp.getName() + "成功");
            }else{
                System.out.println("删除客户" + id + "：" + temp.getName() + "失败");
            }
        }
    }

    /**
     * 显示客户列表的操作
     */
    public  void listAllCustomer() {
        System.out.println("------------客户列表------------");
        int total = custList.getTotal();
        if (total > 0) {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱\t");
            Customer[] allCustomers = custList.getAllCustomers();
            for (int i = 0; i < total; i++) {
                System.out.println((i + 1) + "\t" + allCustomers[i].getName() + "\t" + allCustomers[i].getGender() + "\t" +
                        allCustomers[i].getAge() + "\t" + allCustomers[i].getPhone() + "\t" + allCustomers[i].getEmail() + "\t");
            }
        } else {
            System.out.println("没有客户记录!");
        }
        System.out.println("-----------客户列表完成----------");
    }

}

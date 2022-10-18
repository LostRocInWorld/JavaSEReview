package com.dustin.thistest.exer2;

/**
 * @Project JavaSEReview
 * @Package com.dustin.thistest.exer2
 * @ClassName BankTest
 * @Description 练习2
 * @Date 2022/9/18   02:40
 * @Created by Dustin_Peng
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Jane","Smith");
        bank.getCustomer(0).setAccount(new Account(2000));
        double balance = bank.getCustomer(0).getAccount().getBalance();
        System.out.println("客户"+ bank.getCustomer(0).getFirstName()+"账号余额为" +
                balance);

        bank.addCustomer("ni","ji");
        System.out.println(bank.getNumberOfCustomers());
    }
}

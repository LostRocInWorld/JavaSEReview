package com.dustin.thistest.exer1;

/**
 * @Project JavaSEReview
 * @Package com.dustin.thistest.exer
 * @ClassName CustomerTest
 * @Description this练习1
 * @Date 2022/9/18   02:21
 * @Created by Dustin_Peng
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c = new Customer("Jane", "Smith");
        Account account = new Account(1, 2000, 0.0123);
        c.setAccount(account);
        c.getAccount().deposit(100);
        c.getAccount().withdraw(960);
        c.getAccount().withdraw(2000);

        System.out.println("Customer["+c.getLastName()+" "+c.getFirstName()+"] has a account : id is "
                +c.getAccount().getId()+",balance is " +
                c.getAccount().getBalance() +
                ",annualInterestRate is "+c.getAccount().getAnnualInterestRate()*100+"%");
    }
}

package com.dustin.thistest.exer2;

/**
 * @Project JavaSEReview
 * @Package com.dustin.thistest.exer
 * @ClassName Accout
 * @Description 练习2
 * @Date 2022/9/18   02:13
 * @Created by Dustin_Peng
 */
public class Account {
    private double balance;//余额

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    //取钱
    public void withdraw(double amount){
        if(balance < amount){
            System.out.println("余额不足修改失败");
            return;
        }
        balance -= amount;
        System.out.println("成功取出"+amount);
    }

    //存钱
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("成功存入："+amount);
        }
    }
}

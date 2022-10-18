package com.dustin.thistest.exer1;

/**
 * @Project JavaSEReview
 * @Package com.dustin.thistest.exer
 * @ClassName Accout
 * @Description 账户类1
 * @Date 2022/9/18   02:13
 * @Created by Dustin_Peng
 */
public class Account {
    private int id;//账号
    private double balance;//余额
    private double annualInterestRate;//年利率

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
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

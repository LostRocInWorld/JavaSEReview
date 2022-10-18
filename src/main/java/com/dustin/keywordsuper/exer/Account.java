package com.dustin.keywordsuper.exer;

/**
 * @Project JavaSEReview
 * @Package com.dustin.keywordsuper.exer
 * @ClassName Account
 * @Description 练习1
 * @Date 2022/9/21   01:09
 * @Created by Dustin_Peng
 */
public class Account {
    private int id;//账号
    private double balance;//余额
    private double annalInterestRate;//年利率

    public Account(int id, double balance, double annalInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annalInterestRate = annalInterestRate;
    }

    /**
     * 返回月利率
     * @return 月利率
     */
    public double getMonthlyInterest(){
        return annalInterestRate/12;
    }

    /**
     * 取钱
     * @param amt 取出的金额
     */
    public void withdraw(double amt){
        if(balance>= amt){
            balance -= amt;
            return;
        }
        System.out.println("余额不足");
    }

    /**
     * 存钱
     * @param amt 存入金额
     */
    public void deposit(double amt){
        if(amt > 0){
            balance += amt;
            return;
        }
        System.out.println("存入金额错误");
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

    public double getAnnalInterestRate() {
        return annalInterestRate;
    }

    public void setAnnalInterestRate(double annalInterestRate) {
        this.annalInterestRate = annalInterestRate;
    }
}

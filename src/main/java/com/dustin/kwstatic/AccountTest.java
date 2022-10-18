package com.dustin.kwstatic;

/**
 * @Project JavaSEReview
 * @Package com.dustin.kwstatick
 * @ClassName AccountTest
 * @Description static练习
 * @Date 2022/9/22   04:31
 * @Created by Dustin_Peng
 */
public class AccountTest {
    public static void main(String[] args) {
        Account c1 = new Account();
        Account c2 = new Account("11111", 20000);
        System.out.println(c1);
        System.out.println(c2);
    }
}

class Account {
    private int id;
    private String pwd = "123456";
    private double balance;


    private static double interestRate;
    private static double minMoney;
    private static int init = 10001;

    public Account() {
        id = init++;
    }

    public Account(String pwd, double balance) {
        this();
        this.pwd = pwd;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public java.lang.String getPwd() {
        return pwd;
    }

    public void setPwd(java.lang.String pwd) {
        this.pwd = pwd;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    public static int getInit() {
        return init;
    }

    public static void setInit(int init) {
        Account.init = init;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}

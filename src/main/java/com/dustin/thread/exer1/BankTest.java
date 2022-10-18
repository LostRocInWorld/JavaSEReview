package com.dustin.thread.exer1;

/**
 * @author Dustin_Peng
 * @Description 同步练习：银行有一个账户，有两个储户每个人都想向同一个账户都存3000元，每次存1000，存3次。每次存完打印余额
 * @create 2022-09-29-03:53
 */
public class BankTest {
    public static void main(String[] args) {
        Account ac = new Account(0);
        Customer u1 = new Customer(ac);
        Customer u2 = new Customer(ac);
        u1.setName("用户1");
        u2.setName("用户2");

        u1.start();
        u2.start();
    }
}

class Customer extends Thread {
    private Account ac;

    public Customer(Account ac){
        this.ac = ac;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            ac.deposit(1000);
        }

    }
}
class Account {
    private double money;

    public Account(double money) {
        this.money = money;
    }

    public synchronized void deposit(double amt) {//Account只有一个
        if (amt > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money += amt;
            System.out.println(Thread.currentThread().getName()+"存钱成功，余额："+money);
        }
    }
}
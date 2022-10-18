package com.dustin.keywordsuper.exer;

/**
 * @Project JavaSEReview
 * @Package com.dustin.keywordsuper.exer
 * @ClassName AccoutTest
 * @Description 练习1
 * @Date 2022/9/21   01:14
 * @Created by Dustin_Peng
 */
public class AccoutTest {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 0.045);
        account.withdraw(30000);
        System.out.println("您的账户余额为：" + account.getBalance());
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("您的账户余额为：" + account.getBalance());
        System.out.println("月利率为："+account.getMonthlyInterest()*100+"%");

        CheckAccout cAcc = new CheckAccout(1122, 20000, 0.045, 5000);
        cAcc.withdraw(5000);
        System.out.println("您的账户余额为：" + cAcc.getBalance());
        System.out.println("您的可透支额度为：" + cAcc.getOverdraft());
        cAcc.withdraw(18000);
        System.out.println("您的账户余额为：" + cAcc.getBalance());
        System.out.println("您的可透支额度为：" + cAcc.getOverdraft());
        cAcc.withdraw(3000);
        System.out.println("您的账户余额为：" + cAcc.getBalance());
        System.out.println("您的可透支额度为：" + cAcc.getOverdraft());
    }
}

package com.dustin.keywordsuper.exer;

/**
 * @Project JavaSEReview
 * @Package com.dustin.keywordsuper.exer
 * @ClassName CheckAccout
 * @Description 练习
 * @Date 2022/9/21   01:17
 * @Created by Dustin_Peng
 */
public class CheckAccout extends Account{
    private double overdraft;//可透支限额
    public CheckAccout(int id, double balance, double annalInterestRate,double overdraft) {
        super(id, balance, annalInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amt) {
        if(getBalance()>amt){
            super.withdraw(amt);
        }else if(getBalance()+overdraft >= amt){
            overdraft -= amt-getBalance();
            super.withdraw(getBalance());
//            setBalance(0);//或者设为0
        }else{
            System.out.println("透支额度为："+overdraft+",余额为："+getBalance()+",已经超过了可取钱的额度");
        }

    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}

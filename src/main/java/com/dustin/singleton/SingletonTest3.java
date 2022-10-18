package com.dustin.singleton;

/**
 * @Project JavaSEReview
 * @Package com.dustin.singleton
 * @ClassName SingletonTest3
 * @Description ss
 * @Date 2022/9/23   02:52
 * @Created by Dustin_Peng
 */
public class SingletonTest3 {
    public static void main(String[] args) {
        Account instance1 = Account.instance;
        Account instance2 = Account.instance;
        Account.instance = null;
        System.out.println(instance1);
        System.out.println(Account.instance);
    }
}
class Account{
    private Account(){}
    public static Account instance = new Account();
}
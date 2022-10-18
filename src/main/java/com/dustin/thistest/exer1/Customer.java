package com.dustin.thistest.exer1;

/**
 * @Project JavaSEReview
 * @Package com.dustin.thistest.exer
 * @ClassName Customer
 * @Description Customer类1
 * @Date 2022/9/18   02:18
 * @Created by Dustin_Peng
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

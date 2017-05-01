package com.java.oops;

/**
 * Created by govind.bhone on 5/1/2017.
 */
/*
outside person can't access our internal data directly or our internal data should not go out directly . this oops feature is nothing
but data hiding . after validation or authentication outside person can access our internal data .
for example ,
1. after providing proper username and password we can able to access our gmail information
2. even though we are valid customer of the bank we can able to access our account information we can't access others account information
In programming we can achieve data hiding using visibility modes like private , protected , public,default
By declaring data member (variable) private we can achieve data hiding ..

The main advantage of data hiding is security ...
Note : recommended modifier for variable is private
 */

class Account {
    private double balance = 10.2d;

    public double getBalance() {
        //we can validate access object here
        return this.balance;
    }
}

public class DataHidingExample {

    public static void main(String args[]) {
        Account a = new Account();
        //System.out.println(a.balance);// not accessible when private
        //System.out.println(a.balance);// accessible when default
        //System.out.println(a.balance);// accessible when public
        //System.out.println(a.balance);// not accessible when private
        System.out.println(a.getBalance());
    }
}

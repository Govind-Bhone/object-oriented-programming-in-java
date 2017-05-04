package com.java.oops;

/**
 * Created by govind.bhone on 5/3/2017.
 */
/*
If method is overloaded with argument present at same level then (sibling) then it gives compile time
error

 */
public class MethodOverLoadingExample4 {

    public void m1(String s) {
        System.out.println("String Args");
    }

    public void m1(StringBuffer sb) {
        System.out.println("StringBuffer Args");
    }



    public static void main(String args[]){
        MethodOverLoadingExample4 m =new MethodOverLoadingExample4();
        m.m1(new StringBuffer());
        m.m1("govind");
        //m.m1(null);// compile time error reference to m1 is ambiguous
    }
}

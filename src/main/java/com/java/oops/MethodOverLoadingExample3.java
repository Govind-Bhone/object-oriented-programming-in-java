package com.java.oops;

/**
 * Created by govind.bhone on 5/3/2017.
 */

/*
while resolving overloaded methods compiler will always gives preference to child type argument
 when compared with parent type argument


 */
public class MethodOverLoadingExample3 {

    public void m1(Object o) {
        System.out.println("Object Args");
    }

    public void m1(String s) {
        System.out.println("String Args");
    }



    public static void main(String args[]){
        MethodOverLoadingExample3 m =new MethodOverLoadingExample3();
        m.m1(new Object());
        m.m1("govind");
        m.m1(null);//String Args


    }
}


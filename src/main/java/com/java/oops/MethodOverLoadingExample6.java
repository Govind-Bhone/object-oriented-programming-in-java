package com.java.oops;

/**
 * Created by govind.bhone on 5/3/2017.
 */

/*
General method introduced in 1.0 and varargs in 1.6 so general method get preference
1. In General varargs get very list priority if no other method matched
2. same as default case in switch statement
 */
public class MethodOverLoadingExample6{

    public void m1(int i) {
        System.out.println("int Args");
    }

    public void m1(int ... i ) {
        System.out.println("vars int Args");
    }



    public static void main(String args[]){
        MethodOverLoadingExample6 m =new MethodOverLoadingExample6();
        m.m1(10);
        m.m1(1,2,3,4,5,6,7);
        m.m1();


    }
}

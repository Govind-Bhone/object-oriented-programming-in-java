package com.java.oops;

/**
 * Created by govind.bhone on 5/3/2017.
 */
public class MethodOverLoadingExample5 {

    public void m1(int i,float f) {
        System.out.println("int float Args");
    }

    public void m1(float f , int i ) {
        System.out.println("float int Args");
    }



    public static void main(String args[]){
        MethodOverLoadingExample5 m =new MethodOverLoadingExample5();
        m.m1(4,5.6f);
        m.m1(10.5f,10);
        //m.m1(10,10); // Ambiguity issue
        //m.m1(10.5,10.5); // cannot resolve method

    }
}


package com.java.oops;

/**
 * Created by govind.bhone on 5/5/2017.
 */

/*
parent class abstract method we should override in child class to provide implementation
*/

abstract class P3 {
    public abstract void m1();
}

class C3 extends P3 {
    public void m1() {
        System.out.println("C3 implementation");
    }
}

public class MethodOverridingExample5 {

    public static void main(String args[]) {
        // P3 p = new P3() //can't instantiate abstract class
        P3 p = new P3() {
            @Override
            public void m1() {
                System.out.println("Concrete implementation");
            }
        };
        p.m1();

        C3 c = new C3();
        c.m1();
    }

}

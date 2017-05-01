package com.java.oops;

/**
 * Created by govind.bhone on 5/1/2017.
 */
/*
Inheritance (Is a Relationship) : we can implement is a relationship using extends keyword .

Advantages :
1. Reusability (parent method we can call using child object )
2.
*/

class P {
    public void m1() {
        System.out.println("I am in m1 ");
    }
}

class Q extends P {

    public void m2() {
        System.out.println("I am in m2 ");
        m1();
    }
}

public class InheritanceExample {
    public static void main(String args[]) {
        Q q = new Q();
        q.m2(); //works
        q.m1();// works because parent properties not work for child

        P p = new P();
        p.m1();//works
        //p.m2();// not works because child properties not available for parent

        P pq = new Q();
        pq.m1(); // works
        //pq.m2(); // not works though parent reference hold child reference we can't call child specific methods from parent reference


        //Q qp = new P (); // not works saying incompatible type found P require Q
    }
}

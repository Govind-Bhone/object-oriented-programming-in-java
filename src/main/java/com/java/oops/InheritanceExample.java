package com.java.oops;

/**
 * Created by govind.bhone on 5/1/2017.
 */
/*
Inheritance (Is a Relationship) : we can implement is a relationship using extends keyword .

Advantages :
1. Reusability (parent method we can call using child object )

                   Object
                   /  |    \
                /     |       \
               /      |          \
              String  StringBuffer   \
                                        |
                                        Throwable
                                        |\
                                        |  \
                                Exception   Error
                                     |        |
                                     |       Out of Memory Error
                                     / \
                                    /   \
                                   RE   IE


Multiple Inheritance : Java class can't extends more than one class at a time . hence does not support multiple
inheritance in classes .
eg .
class A extends B ,C {

}

Note : If our class does not extend any other class then only our class is direct child class of object
If our class extends any other class then our class is indirect child class of object .

class A {}

class B extends A {}


object --> A
object --> A --> B

Why java won't support for multiple inheritance ?
Ans : There may be chance of ambiquity problem hence java won't provide support for
multiple inheritance .

P1 (m1()) P2(m1())
\       /
 \    /
   \ /
    A (which m1 method to inherit ?)

But with respect to interface it can extends more than one interface simultaneously.

 interface A {}
 interface B{}
 interface C extends A , B {}


 PI1 (m1())           PI2 (m1())
           \          /
             CI(m1())
                |
             CC(m1())

In Interfaces multiple inheritance supported as only declaration is present in multiple inheritance
and concrete implementation is written in implementation class .


Cyclic Inheritance : Below are some examples of cylic inheritance .
it is not required so not allowed in java ..

class A extends A {

}

class A extends B {

}
class B extends A {

}
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

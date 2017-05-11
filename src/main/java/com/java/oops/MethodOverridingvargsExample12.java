package com.java.oops;

/**
 * Created by govind.bhone on 5/11/2017.
 */
/*
Varargs coenpt came in 1.5 version

public void m1(int ... x ){
}

In Below program if we replace child method with varargs method then it will become method overriding
in this case the output change
 */

class C {

    public void m1(int... x) {
        System.out.println("parent");
    }

    public void m2(int... x) {
        System.out.println("parent m2");
    }
}

class D extends C {

    /*
    it is overloading but not overriding so method resolution always takes care by reference type
    so we can't override varargs method with normal method
     */
    /*@Override*/
    public void m1(int x) {
        System.out.println("child");
    }

    public void m2(int... x) {
        System.out.println("child m2");
    }
}

public class MethodOverridingvargsExample12 {
    public static void main(String args[]) {
        C c = new C();
        c.m1(10);//parent
        c.m2(10);
        D d = new D();
        d.m1(10);// child
        d.m2(10);// child
        C cd = new D();
        cd.m1(10); // parent
        cd.m2(10);//chiild


    }
}

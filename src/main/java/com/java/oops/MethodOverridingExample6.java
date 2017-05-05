package com.java.oops;

/**
 * Created by govind.bhone on 5/5/2017.
 */

/*
We can override non abstract method as abstract in subclass
The main advantage of this approach is we can stop the availability of parent method implementation
to the next level child classes .so they need to override it compulsory .
 */

class P4 {
    public void m1(){
        System.out.println("Parent non abstract");
    }
}

abstract class C4 extends P4 {
    public abstract void m1() ;
}

class D4 extends C4{

    public void m1() {
        System.out.println("Child non abstract");
    }
}
public class MethodOverridingExample6 {

    public static void main(String args[]){
        D4 d = new D4();
        d.m1();

        P4 p = new P4();
        p.m1();

        P4 pd = new D4();
        pd.m1();
    }
}

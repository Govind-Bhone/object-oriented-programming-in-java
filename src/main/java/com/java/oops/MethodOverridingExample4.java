package com.java.oops;

/**
 * Created by govind.bhone on 5/5/2017.
 */


/*
parent class private method not available to child and hence overriding concept
not applicable for private methods .
Based on our requirement we can define exactly same private method in child class
it is valid but will acts as new method and will not overriding parent method ..

we can't override final method if we are trying to override we will get compile time error

we should override parent class abstract method in child class

Static methods cannot be overridden because method overriding only occurs in the context of
dynamic (i.e. runtime) lookup of methods. Static methods (by their name) are looked up statically
(i.e. at compile-time)
* */


class P2 {

    private void m1() {
        System.out.println("P2 m1 ");
    }

    public final void m2() {
        System.out.println("P2 m2 ");

    }

    public static void m3() {
        System.out.println("P2 m3 ");
    }

}

class C2 extends P2 {

    // here we can define exactely same method in child it is valid but it is not overriding parent
    // method
    private void m1() {
        System.out.println("C2 m1 ");
    }

    // we can't override final methods error
/*    public void m2(){
        System.out.println("C2 m2 ");
    }*/

    // we can't override static method as well
/*    public void m3(){
        System.out.println("C2 m3 ");
    }*/

    //it will create new method not the overridden method
    public static void m3() {
        System.out.println("New C2 m3 ");
    }
}

public class MethodOverridingExample4 {
    public static void main(String args[]) {
        P2 p2 = new P2();
//        p2.m1();


        C2 c2 = new C2();
        //      c2.m1();

        P2 pc2 = new C2();
        pc2.m3();

    }
}

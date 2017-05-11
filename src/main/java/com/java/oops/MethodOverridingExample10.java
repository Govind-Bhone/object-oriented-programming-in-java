package com.java.oops;

/**
 * Created by govind.bhone on 5/10/2017.
 */
/*
overriding with static method :
1. If we are trying to override static method with non static then we get compile time error .
2. we can't override non static method as static .
3. If both parent and child class methods are static then we won't get any compile time error ,it seems
overriding concept applicable for static methods but it is not overriding , it is method hiding .

Method Hiding :
All rules of method overriding is applicable for method hiding too except the following differences
Method Hiding                                Method Overriding
both static                                  both non static
method resolution always                     method resolution always
takes care by compiler based                takes care by JVM using runtime object
on reference type
compile time polymorphism                   runtime poly / dynamic poly /late binding
/static poly/early binding

 */

class M {
    public static void m1() {
        System.out.println("parent static method ");
    }

    public void m2() {

    }
}

class N extends M {
    //===Invalid overriding (m1() in N can not override m1 in M overriden method is static ===========
/*    public void m1() {
        System.out.println("non Static way of  Overriding ");
    }*/

    // ===========it is valid but it is not overriding it is method hiding ===================
  /*  @Override*/ // it won't allow us override keyword
    public static void m1() {
        System.out.println("child static method ");
    }

    //===Invalid --m2() in N can not override m2 in M overriding method is static ========
/*    public static void m2(){

    }*/

//we can't use static with abstract as well as abstract with static
/*public abstract static void m1(){

}*/
}

public class MethodOverridingExample10 {
    public static void main(String args[]) {
        M m = new M();
        m.m1();

        N n = new N();
        n.m1();

        /*
        Here if it is overriding then child method will get invoked as decision takes care by JVM using runtime object
        But in method hiding the method invocation/resolution always takes care by compile using object reference
         */
        M m1 = new N();
        m1.m1();

        //output
//        parent static method
//        Static way of  Overriding
//        parent static method
    }
}

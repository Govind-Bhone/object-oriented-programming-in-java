package com.java.oops;

/**
 * Created by govind.bhone on 5/4/2017.
 */

/*
*  javac -source 1.4 MethodOverridingExample3.java //compilation error
*  javac -source 1.6 MethodOverridingExample3.java //works fine
*
*  Note :
*  Method covariant overriding is allowed only for reference types and not for primitive types
*
* */


class P1 {

    public Object m1() {

        return "p1";

    }

    public String m2(){
        return "";
    }
}

class C1 extends P1 {

    public String m1() {
        return "c1";
    }

    //supertype not allowed
/*    public Object m2(){
        return "";
    }*/

}

public class MethodOverridingExample3 {
    public static void main(String args[]){
        P1 p1 = new P1();
        System.out.println(p1.m1());

        C1 c1 = new C1();
        System.out.println(c1.m1());

        P1 pc1= new C1();
        System.out.println(pc1.m1());
    }
}

package com.java.oops;

/**
 * Created by govind.bhone on 5/13/2017.
 */

/*

1. In overriding method (non static method ) resolution always takes care by JVM using runtime object
2. In Hiding  method(static method ) resolution always takes care by compiler using reference type
3. Variable Resolution always takes care by compiler using reference type .

*/
class Aa {
    int x =777;
    public void m1() {
        System.out.println("A");
    }
    public static void m2() {
        System.out.println("static A");
    }
}

class Bb extends Aa {
    int x=888;
    public void m1() {
        System.out.println("B");
    }

    public static void m2() {
        System.out.println("static B");
    }
}

class Cc extends Bb {
    int x=999;
    public void m1() {
        System.out.println("C");
    }

    public static void m2() {
        System.out.println("static C");
    }
}

public class TypeCastingExample3 {
    public static void main(String args[]) {
        Cc cc = new Cc();
        cc.m1();
        ((Bb) cc).m1();
        ((Aa) ((Bb) cc)).m1();

        cc.m2();
        ((Bb) cc).m2();
        ((Aa) ((Bb) cc)).m2();

        System.out.println(cc.x);
        System.out.println(((Bb) cc).x);
        System.out.println(((Aa) ((Bb) cc)).x);


        Bb bb = new Bb();
        bb.m1();
        ((Aa) bb).m1();
        // ((Cc)((Bb)bb)).m1(); //java.lang.ClassCastException: com.java.oops.Bb cannot be cast to com.java.oops.Cc

        bb.m2();
        ((Aa) bb).m2();
       // ((Cc)((Bb)bb)).m2();////java.lang.ClassCastException: com.java.oops.Bb cannot be cast to com.java.oops.Cc

        System.out.println(bb.x);
        System.out.println(((Aa) bb).x);
        //System.out.println(((Cc)((Bb)bb)).x);////java.lang.ClassCastException: com.java.oops.Bb cannot be cast to com.java.oops.Cc
    }
}

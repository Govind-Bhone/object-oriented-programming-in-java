package com.java.oops;

/**
 * Created by govind.bhone on 5/13/2017.
 */

/*

Integer \
         |  ___
Number --- |10 |
         /
        /
Object /


Note :

A<-----B<--------C

C c = new C()  // Runtime Object : C type  Reference Object : C type
    (B)c       // Runtime Object : C type   reference object : B type
B b = new C()  // Runtime Object : C type   reference type : B type
   (A) ((B)c)  // Runtime Object : C type    reference type : A type
A a = new C()  // Runtime Object : C type    reference type : A type
 */

class Pa{
    public void m1(){

    }
}

class Ca extends Pa{
    public void m2(){

    }
}
public class TypeCastinExample2 {
    public static void main(String args[]){
        Integer i = new Integer(10);
        Number n = (Number)i;
        Object o =(Object)n;
        System.out.println(i==n);
        System.out.println(n==o);

        Ca c = new Ca();
        c.m2();
        c.m1();

        ((Pa)c).m1();
        // we can't call child specific methods through parent reference
        //((Pa)c).m2(); //compile time error : cannot resolve method m2
    }
}

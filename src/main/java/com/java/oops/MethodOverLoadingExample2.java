package com.java.oops;

/**
 * Created by govind.bhone on 5/3/2017.
 */

/*
Automatic Type Promotion in method overloading:

In overloading method resolution compiler try to check exact method match
if not found then compiler wait and try to  promote argument to next level
datatype as follows . after promoting if method is available then that method get
considered for execution.if match method not available then it gives compile time error

char --> Int -->Long--> Float --> Double
Byte --> Short --> Int -->Long--> Float --> Double
 */
public class MethodOverLoadingExample2 {

    public void m1(int i) {
        System.out.println("int Args");
    }

    public void m1(float f) {
        System.out.println("float Args");
    }

    public static void main(String args[]){
        MethodOverLoadingExample2 m =new MethodOverLoadingExample2();
       //0111 1111
       //128 64 32 16 8 4 2 1

        Byte b = 127;
        Short s =20500;
        m.m1(10);  //work
        m.m1(12.3f); //work
        m.m1('a');  //work
        m.m1(45l); // work
        m.m1(b); //work
        m.m1(s); //work
        //m.m1(34.5); // not work
        // m.m1("hi"); //not work
    }
}

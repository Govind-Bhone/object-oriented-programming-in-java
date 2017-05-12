package com.java.oops;

/**
 * Created by govind.bhone on 5/12/2017.
 */

/*
we can use parent reference to hold child object.
we can use interface reference to hold implemented class object.


     //A b = (C) d  ;

1. [Compile time check 1 ] compiler check C and d must have some relation (parent to child ore child to parent)
2. [Compile time check 2 ] C must be either same or derived type of A otherwise we will get compile time error saying incompatible types Found C required A

Note : above two rules only check reference types .
3. [Runtime Check ] underlying /Runtime objects type of d must be either same or derived type of C otherwise we will get runtime exception saying ClassCastException

*/
public class TypeCastingExample {

    public static void main(String args[]) {

/*
        //====UpCasting example =======================
        Object o = new String("Hello");
        Runnable r = new Thread();

        //===================Example 1=================
        Object o1 = new String("Hello");
        StringBuffer sb = (StringBuffer)o1;
        Object j = (Object)sb;

        //==================Example 2==================
        String s =new String("Hello");
        //StringBuffer sb1 = (StringBuffer)s; //compile time error

        //=================Example 3===================
        Object o2 = new String("Hello");
        StringBuffer sb1 = (StringBuffer)o2;
        Object o4 = (StringBuffer)o2;
        //StringBuffer sb2= (String)o2; // compile time error
*/


        //=====================Example 4=====================
        Object o3 = new String("Hello");
        StringBuffer sb2 = (StringBuffer) o3; // ClassCastException : Java.lang.String cannot be cast to java.lang.StringBuffer
        Object o5 = (StringBuffer) o3;
        Object o6 = new Object();
        StringBuffer buf = (StringBuffer) o6;
        String buf2 = (String) o6;
        Object s4=(String)o3;
    }
}
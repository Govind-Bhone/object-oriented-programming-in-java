package com.java.oops;

/**
 * Created by govind.bhone on 5/3/2017.
 */

/*
* In Java if we declared any method as follows
*      public static int m1( int a1, String a2 ) then method signature would be
*                                |
*                                |
*                         m1(int,String)
*
*    return types and modifiers are not part of method signature
*
* for every class compiler maintain method table
*  for example
*  class Test {
*       public void m1(String a1){}
*       public void m2(int a2 ){}
* }
*
*    Method Table
*    class Test
*  --------------------
*  |    m1(String)     |
*  |                   |
*  |-------------------
*  |    m2(int)        |
*  |-------------------
*
*  compiler will use method signature to resolve method calls .
*
*
*
* */
public class MethodSignatureExample {

    //METHOD AMBIGUITY
 /*    public void m1(String a1){

     }

     public int m1(String a2 ){
         return -1;
     }
*/

}

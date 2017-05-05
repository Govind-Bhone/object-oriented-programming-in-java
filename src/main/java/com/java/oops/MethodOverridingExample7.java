package com.java.oops;

/**
 * Created by govind.bhone on 5/5/2017.
 */

/*


In overriding following modifiers won't keep any restrictions

Method overriding possibilities

parent method :  final          non-final      abstract             synchronized          native     strictfp
                   |               |            |   |                 |    |              |    |      |    |
                   |               |            |   |                 |    |              |    |      |    |
                   |               |            |   |                 |    |              |    |      |    |
                   |               |            |   |                 |    |              |    |      |    |
                   |               |            |   |                 |    |              |    |      |    |
child method :  nonfinal/final     final       non-abstract        non-synchronized     non-native    non-strictfp

Result       :    not Possible    possible    possible both way   possible both way  possible both way  possible both way


Native Methods :A native method is a Java method (either an instance method or a class method)
whose implementation is written in another programming language such as C.


Strictfp Methods :
Java strictfp keyword ensures that you will get the same result on every platform if
you perform operations in the floating-point variable. The precision may differ from platform
to platform that is why java programming language have provided the strictfp keyword, so that you get
same result on every platform. So, now you have better control over the floating-point arithmetic.

examples ,

it will use for classes ,methods ,interfaces
strictfp class A{}//strictfp applied on class
strictfp interface M{}//strictfp applied on interface
class A{
strictfp void m(){}//strictfp applied on method
}

it will not use for below things like
class B{
strictfp abstract void m();//Illegal combination of modifiers
}
class B{
strictfp int data=10;//modifier strictfp not allowed here
}
class B{
strictfp B(){}//modifier strictfp not allowed here
}

 */

abstract class P55{
    public abstract void m3();
}

class C55 extends P55 {
    //===============CASE 3============
    public void m3(){

    }
}


class P5 {
    public final void m1() {

    }

    public void m2() {

    }

    public void m3(){

    }

    public synchronized void m4(){

    }

    public  void m5(){

    }

    public native void m6();

    public void m7(){

    }

    public strictfp void m8(){

    }

    public void m9(){

    }
}

abstract class C555 extends P5{
    //=================CASE 3=============
    @Override
    public abstract void m3();
}

class C5 extends P5 {
    //==============CASE 1================
/*    public final void m1(){

    }

    public void m1(){

    }*/

    //====================CASE 2======================
    public final void m2() {

    }

    //==========================CASE 4====================
    @Override
    public void m4(){

    }

    @Override
    public synchronized  void m5(){

    }

    //======================CASE 5====================
    @Override
    public void m6(){

    }

    @Override
    public native void m7();

    //===================CASE 6===============
    @Override
    public void m8(){

    }

    //can't override with weeker access modifier
    @Override
    /*private*/public strictfp void m9(){

    }
}


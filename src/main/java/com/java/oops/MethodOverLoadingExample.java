package com.java.oops;

/**
 * Created by govind.bhone on 5/3/2017.
 */
/*
Method overloading :
two methods are said to be overloaded if and only if both methods having same name
but different arguments types / no of arguments .

In c language ,method overloading concept not available leads to create seperate methods per
method signature .
abs(int i)
fabs(float f)

But Java supports this functionality and such type of methods called overloaded methods .
abs(int i)
abs(float f)

it is also called as early binding , compile time polymorphism , static binding etc .
in method overloading method resolution always takes by compiler based on reference type .
hence overloading is also considered as compile time polymorphism or static or early binding .
 */
public class MethodOverLoadingExample {

    public void m1() {
        System.out.println("No Args");

    }

    public void m1(String str) {
        System.out.println("String Args");
    }

    public void m1(int i) {
        System.out.println("int Args");
    }

    public static void main(String args[]){
        MethodOverLoadingExample m =new MethodOverLoadingExample();
        m.m1();
        m.m1(10);
        m.m1("hi");
    }
}

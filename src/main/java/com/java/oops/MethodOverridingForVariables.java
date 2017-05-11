package com.java.oops;

/**
 * Created by govind.bhone on 5/11/2017.
 */

/*

overriding concept not applicable for fields , variables it is only applicable for methods .
variable resolution always takes care by compiler using reference types .



Property                                              | overloading                                       | overriding
Method names                                          |  must be same                                     |   must be same
argument types                                        |  must be different (atleast order)                |   must be same including order
method signatures                                     |  must be different                                |   must be same
return types                                          |  no rule (no restriction)                         |   must be same until 1.4 but covariant allow after 1.5
private methods                                       |  can be overloaded                                |   can not be overriden
static methods                                        |  can be overloaded                                |   can not be overriden
final methods                                         |  can be overloaded                                |   can not be overriden
access modifiers                                      |  no restriction                                   |   cannot be reduced but we can increase
throws clause                                         |  no restriction                                   |   if child throws checked then parent should throw parent or same checked exception
method resolution                                     |  always takes care by compiler based on ref type  |   takes care by JVM using runtime obj
known as                                              |  compile time/static /early                       |   runtime/dynamic/late


Polymorphism : one name but multiple forms is called as polymorphism
 1. method name is same but we can apply for diff type of arguments (overloading)
 2. method signature is same but in parent class one type of implementation and in child class another type of
 implementation (overriding)

 3. usage of parent reference to hold child object is concept of polymorphism
 */
class K {
    int x = 888;
    static int y=11;
    int z =44;
    static int a = 8888;
}

class L extends K {
    int x = 999;
    int y=22;
    static int z =33;
    static int a =9999;
}

public class MethodOverridingForVariables {
    public static void main(String args[]) {
        K k = new K();
        System.out.println(k.x); //888
        System.out.println(k.y); //11
        System.out.println(k.z); //44
        System.out.println(k.a); //8888

        L l = new L();
        System.out.println(l.x); // 999
        System.out.println(l.y); //22
        System.out.println(l.z); //33
        System.out.println(l.a); //9999

        K kl = new L();
        System.out.println(kl.x); // 888
        System.out.println(kl.y); //11
        System.out.println(kl.z); //44
        System.out.println(kl.a); //8888
    }
}

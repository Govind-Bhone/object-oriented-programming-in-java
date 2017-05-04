package com.java.oops;

/**
 * Created by govind.bhone on 5/4/2017.
 */

/*
In Inheritance methods are by default available to child class that are defined in parent class .
But sometimes child wanted to redefine existing behavior defined in parent . this mechanism is called
as method overriding .
Java support method overriding .

Rules for method overriding :
1. method signature must be same
2. return type must be same (until version 1.4 only ) from 1.5 covariant return type allowed(child type also allowed)
eg .

class P {

public Object m1(){

return null;

}

class C extends P{

public String m1(){
return "hello";
 }

}
 */

class Parent {
    public void marry() {
        System.out.println("Arrange Marriage");
    }

    public void notOverriden(){
        System.out.println("Not overriden");
    }
}

class Child extends Parent {

    @Override
    public void marry() {
        System.out.println("Love Marriage");
    }
}

public class MethodOverridingExample2 {
    public static void main(String args[]) {
        Parent p = new Parent();
        p.marry();

        Child c = new Child();
        c.marry();

        //Child cp = (Child) new Parent(); // class cast exception
        //cp.marry();

        /*
        compiler check for marry method in parent if method available it compiles fine
        and at runtime jvm checks it is parent or child object . if child object then it check in child class
        it is overriding or not if overriding then it invokes child method else parent method
         */
        Parent pc=new Child();
        pc.marry();
        pc.notOverriden();
    }
}

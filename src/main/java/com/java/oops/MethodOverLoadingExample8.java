package com.java.oops;

/**
 * Created by govind.bhone on 5/3/2017.
 */

/*
In Method overloading runtime object will not play any role .
everything is statically binding

 */
class Vehicle {
    public void start(int i) {
        System.out.println("vehicle started with destination in meter(int) " + i);
    }

}

class Bus extends Vehicle {
    public void start(float j) {
        System.out.println("bus started with destination in meter(float) " + j);
    }
}

public class MethodOverLoadingExample8 {
    public static void main(String args[]){
        Vehicle v = new Vehicle();
        v.start(10);
        Bus b = new Bus();
        b.start(10.5f);
        b.start(10l);
        b.start('a');
        //v.start(10f); // will not work

        Vehicle vb= new Bus(); // compile time binding
        //vb.start(10f); // will not work
    }
}

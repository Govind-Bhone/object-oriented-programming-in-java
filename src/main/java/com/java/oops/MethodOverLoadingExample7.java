package com.java.oops;

/**
 * Created by govind.bhone on 5/3/2017.
 */

class Animal {

}

class Monkey extends Animal{

}

public class MethodOverLoadingExample7 {
    public void m1(Animal a ){
        System.out.println("Animal Version");

    }

    public void m1(Monkey m){
        System.out.println("Monkey Version");
    }

    public static void main(String args[]){
        MethodOverLoadingExample7 t = new MethodOverLoadingExample7();
        Animal a = new Animal();
        t.m1(a);
        Monkey m = new Monkey();
        t.m1(m);

        Animal am = new Monkey();
        t.m1(am);// method resolution done based on reference type
    }

}

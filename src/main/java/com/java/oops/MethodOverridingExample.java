package com.java.oops;

/**
 * Created by govind.bhone on 5/4/2017.
 */

/*
Polymorphism: All methods in java are virtual by default. That means that any method can be overridden
when used in inheritance, unless that method is declared as final or static.
(Explanation Belongs to Virtual Tables Concept)

Virtual Table / Dispatch Table : An object's dispatch table will contain the addresses of the
object's dynamically bound methods. Method calls are performed by fetching the method's address from
the object's dispatch table. The dispatch table is the same for all objects
belonging to the same class, and is therefore typically shared between them.


In object-oriented programming, the most likely way that you’ll create and use code is by
simply packaging data and methods together into a class, and using objects of that class.
You’ll also use existing classes to build new classes with composition. Less frequently, you’ll use
inheritance. So although inheritance gets a lot of emphasis while learning OOP, it doesn’t mean that
you should use it everywhere you possibly can. On the contrary, you should use it sparingly, only when
it’s clear that inheritance is useful. One of the clearest ways to determine whether you should use
composition or inheritance is to ask whether you’ll ever need to upcast from your new class to the base class. If you must upcast, then inheritance is necessary, but if you don’t need to upcast, then you should look closely at whether you need inheritance. The next chapter (on polymorphism) provides one of the most compelling reasons for upcasting, but if you remember
to ask “Do I need to upcast?” you’ll have a good tool for deciding between composition and inheritance.
*/

class Dogs{
    public String getType () {
        System.out.println("NormalDog");
        return "NormalDog";
    }
}

/**
 * Pet Dog has an extra method dogName()
 */
class PetDog extends Dogs{
    public String getType () {
        System.out.println("PetDog");
        return "PetDog";
    }
    public String dogName () {
        System.out.println("I don't have Name !!");
        return "NO Name";
    }
}

/**
 * Police Dog has an extra method secretId()
 */
class PoliceDog extends PetDog{

    public String secretId() {
        System.out.println("ID");
        return "ID";
    }

    public String getType () {
        System.out.println("I am a Police Dog");
        return "Police Dog";
    }
}

public class MethodOverridingExample {
    public static void main(String args[]){
        /**
         * Creating the different objects with super class Reference
         */
        Dogs obj1 = new Dogs();
        obj1.getType();
         /**
         *  Object of Pet Dog is created with Dog Reference since
         *  Upcasting is done automatically for us we don't have to worry about it
         *
         */
        Dogs obj2 = new PetDog();
        obj2.getType();
         /**
         *  Object of Police Dog is created with Dog Reference since
         *  Upcasting is done automatically for us we don't have to worry
         *  about it here even though we are extending PoliceDog with PetDog
         *  since PetDog is extending Dog Java automatically upcast for us
         */
        Dogs obj3 = new PoliceDog();
        obj3.getType();

        ( (PoliceDog)obj3).secretId();


    }
}

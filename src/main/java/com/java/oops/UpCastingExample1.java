package com.java.oops;

/**
 * Created by govind.bhone on 5/4/2017.
 */

/*
what is upcasting : If the supertype object used to hold the subtype object to acts as more generic object then
this is called as upcasting

Why Upcasting :
1. The purpose of an implicit upcast (for a Java object type) is to "forget" static type information so
that an object with a specific type can be used in a situation that requires a more general type.
This affects compile-time type checking, not runtime behavior.
2. used to force the specific method override to  be used
for example ,
public void doIt(Object o)
public void doIt(String s)

then
String arg = ...
doIt((Object) arg);

3.  sometimes used to avoid arithmetic overflow
int i1 = ...
int i2 = ...
long res = i1 + i2;           // 32 bit signed arithmetic ... might overflow
long res2 = ((long) i1) + i2; // 64 bit signed arithmetic ... won't overflow

4. For Factory Method implementation we used it
5.  in case of varargs
for example ,
public void doIt(Object... args)
{

}

Object[] foo = ...

doIt(foo);  // passes foo as the argument array
doIt((Object) foo); // passes new Object[]{foo} as the argument array.


6. it is used for grouping different objects
for example ,

List<Animal> ls = new LinkedList<Animal>();
ls.add(new Dog())
ls.add(new Cat())


7. If we have two classes A and B and both contain overloaded methods with same signature then impact of upcasting will
never seen but if overloaded methods have different signature then it make sense .

a)If Method run1 does not have parameters then the output of method will be same.
There is no use of Upcasting.
class Demo1{

 void run1(){
 System.out.println("hello");
 }
 }

class Demo extends Demo1 {

void run1(){
System.out.println("hello1");
}

public static void main(String args[]){

 Demo d = new Demo();
 d.run1();

 Demo1 d1 = new Demo();
 d1.run1();

  }
  }

b)If we uses Parameterised overloading then the use of upcasting can be seen clearly.
There is the sense for Upcasting.
  class Demo1{

  void run1(int a){

  System.out.println(a);
  }
  }

 class Demo extends Demo1 {

  void run1(String b){

  System.out.println(b);
  }

  public static void main(String args[]){

  Demo d = new Demo();
  d.run1("b");

  Demo1 d1 = new Demo();
  d1.run1(2);

}
}

Disadvantages :
1. (For a primitive type, an upcast results in a conversion, and can in some cases result in
loss of precision; e.g. long -> float.)

 */

class Animals {
    /*
    If i make callme method static then type reference is used for method invocation
    rather than object invocation at runtime
    but in instance method
    all object methods in Java are virtual, which means the
    target method is discovered by the actual type of the object at runtime rather than by reference type
    Note :  static methods are resolved at compile time whereas normal (virtual) methods at runtime.
    The compiler is not able to determine real object type so it uses reference type.


     */
    public /*static */void callme() {
        System.out.println("In callme of Animal");
    }

    /* for factory principle we use it */
    public Animals getObject(String name) {
        if (name.equals("Dog")) return new Dog();
        else return new Cat();
    }
}

class Dog extends Animals {
    public /*static */void callme() {
        System.out.println("In callme of Dog");
    }

    public void callme2() {
        System.out.println("In callme2 of Dog");
    }
}

class Cat extends Animals {
    public /*static */void callme() {
        System.out.println("In callme of Cat");
    }

    public void callme2() {
        System.out.println("In callme2 of Cat");
    }
}

public class UpCastingExample1 {

    public static void doIt(Object... args) {
       for(Object i:args){
           if(i instanceof Object[]){
               for(Object j : (Object[])i){
                   System.out.println("In second loop "+j);
               }
           }else {
               System.out.println("In first loop "+i);
           }
       }
    }

    public static void main(String args[]) {
        Dog d = new Dog();
        //Animals a = d ; // implicit upcast
        Animals a = (Animals) d;
        d.callme();
        a.callme();
        //Dog d1= a ; //explicit cast necessary
        ((Dog) a).callme2();
        Animals a1 = new Animals();
        a1.callme();


        //varargs checking
        Object[] foo = {new String("sachin"), new String("bhone"), new String("govind")};

        doIt(foo);  // passes foo as the argument array
        doIt((Object) foo); // passes new Object[]{foo} as the argument array.

    }
}

package com.java.oops;

/**
 * Created by govind.bhone on 5/5/2017.
 */
/*
while overriding we can increase the access privileges but we can't reduce the privileges
(scope of access modifiers) .


default scope for default is public
default scope for private is everywhere
default scope for public is everywhere
default scope for private is same class

public  > protected  > default > private



parent method :     public     protected                 default                   private
                      |           |                         |                        |
                      |           |                         |                        |
                      |           |                         /\                       |
                      |          / \                      /  |   \                   |
child method  :     public     public protected     default public protected      can't override
 */

class A {
    public void m1() {

    }

    void m2(){

    }

    void m3(){

    }

    protected void m4(){

    }
}

class B extends A {
    //using default modifier
    // cannot override m1 in p attempting to assign weeker access privileges
   /* void m1(){

    }*/

   public void m2(){

   }

   protected void m3(){

   }

   public void m4(){

   }
}

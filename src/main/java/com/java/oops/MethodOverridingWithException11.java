package com.java.oops;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by govind.bhone on 5/10/2017.
 */

/*
If any method throws checked exception then caller must handle that checked exception

caller will not affected if child throws subclass of parent exception or the same exception
If they throws other exception then caller will get compile time error .


Overriding Rule :

1. method signature remain same
2. private method not allowed
3. return type same or covariant
4. abstract override
5. synchronize , native we can override
6. scope we can't reduce we can increase
7. if child throws checked exception then compulsary parent throws same or super type exception
 */
class Parent1 {
    public void m1() throws IOException {
        System.out.println("Parent Exception");
    }
}

class Child1 extends Parent1 {
    public void m1() throws /*FileNotFoundException*/ /*Exception*/IOException{
        System.out.println("child Exception");
    }
}

public class MethodOverridingWithException11 {
    public static void main(String args[]) {
        Parent1 p1 = new Child1();
        try {
            p1.m1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

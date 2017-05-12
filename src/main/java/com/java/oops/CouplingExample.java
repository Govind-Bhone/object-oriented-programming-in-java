package com.java.oops;

/**
 * Created by govind.bhone on 5/12/2017.
 */

/*
Coupling : Degree of dependency between component is called coupling .
if dependency is less then loosly coupling and if dependency is more then tightly coupling

loosly coupling is good programming practice for creating frameworks and all ...


Disadvantages of tightly coupled
1. without affecting remaining component we can't modify current component means enhancement is
very difficult .

2. sometimes using the existing code we need more effort than writting new code means it make suffers
reusability of the code

3. maintainability of the code is hard

*/

//=============== Tightly coupled program=============================

class G {
    static int i = H.j;
}

class H {
    static int j = I.k;
}

class I {
    static int k = J.m1();
}

class J {
    public static int m1(){
        return 10 ;
    }
}
public class CouplingExample {
    public static void main(String args[]){
        G g = new G();
        System.out.println(g.i);
    }
}

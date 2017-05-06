package com.java.oops;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;

/**
 * Created by govind.bhone on 5/6/2017.
 */

/*
If child class method throws any checked exception then compulsory parent class method should throw same checked exception
or its parent otherwise we will get compile time error .
  there are no restrictions for unchecked exceptions .

*/

class Parents {
    public void m1() throws Exception {

    }

    public void m2() {

    }

    public void m3() throws Exception {

    }

    public void m4() throws IOException {

    }

    public void m5() throws IOException {

    }

    public void m6() throws IOException {

    }

    public void m7() throws IOException {

    }
}

class Childs extends Parents {

    @Override
    public void m1() {

    }
/*
    @Override
    public void m2() throws Exception {

    }*/

    @Override
    public void m3() throws IOException {

    }

/*    @Override
    public void m4() throws Exception {

    }*/

    // m5 in c cannot override m5 in p ;overridden  method does not
    // throw java.lang.InterruptedException
    @Override
    public void m5() throws FileNotFoundException, EOFException {

    }

 /*   @Override
    public void m6() throws EOFException, InterruptedException {

    }*/

    @Override
    public void m7() throws ArithmeticException, NullPointerException, ClassCastException {

    }
}

public class MethodOverridingExample9 {
}

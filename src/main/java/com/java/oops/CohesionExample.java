package com.java.oops;

/**
 * Created by govind.bhone on 5/12/2017.
 */
/*
for every component clear well defined functionality is defined then that component is said to be
follow high cohesion ..
High cohesion is always good programming practice

If everything is defined within one component and clear picture is not there about different functionality
is called as low cohesion .

Disadvantages of low cohesion :
1. Enhancement is very difficult
2. reusability is very difficult
3. maintainability is difficult

so for every functionality maintain separate component
                                                             ----->Reply.jsp
High Cohesion Example                                       |
                                        ---->Inbox.jsp------>----->Compose.jsp
                                        |                   |
login.jsp     -------> validate.jsp ---->                   ------->Send.jsp
                                        |--->Error.jsp

If I have to change any component above then we can easily change it
we can reuse any component for another project also
different modules can maintained by different team


for example ,

cohesive class example

class FooBar {
  private SomeObject _bla = new SomeObject();

  public void FirstMethod() {
    _bla.FirstCall();
  }

  public void SecondMethod() {
    _bla.SecondCall();
  }

  public void ThirdMethod() {
    _bla.ThirdCall();
  }
}

non cohesive class example ,
class FooBar {
  private SomeObject _bla = new SomeObject();
  private SomeObject _foo = new SomeObject();
  private SomeObject _bar = new SomeObject();

  public void FirstMethod() {
    _bla.Call();
  }

  public void SecondMethod() {
    _foo.Call();
  }

  public void ThirdMethod() {
    _bar.Call();
  }
}

*/

class HighCohesion {
    public static void sum(int a, int b) {
        int sum = a + b;
    }

    public static void sub(int a, int b) {
        int sub = a - b;
    }
}

class LowCohesion {


    public static void arithmetic(int a, int b) {
        int sum = a + b;
        //calculating difference here
        int sub = a - b;
        //same for multiplication and division
    }
}


public class CohesionExample {
    public static void main(String args[]) {
        LowCohesion.arithmetic(10, 20);
        HighCohesion.sum(10, 20);
        HighCohesion.sub(10, 20);

    }
}

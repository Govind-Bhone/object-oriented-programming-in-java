package com.java.oops;

/**
 * Created by govind.bhone on 5/1/2017.
 */
/*
hiding the internal implementation and just hightlight the set of services what we are offering without sharing internal
implementation is concept of abstraction..
for example , 1 . ATM GUI screen , they are highlighting set of services ( withdraw , balance transfer , balance check , pin change etc )
without highlighting internal implementation..

This adds strength to the OOAD principle -"Code should be open for Extension but closed for Modification".

Advantages :
1. security
2. Enhancement / technology migration
3. ease of use
4. maintainability
*/

abstract class Person {

    private String name;
    protected String empCode;

    Person(String empCode){
        this.empCode=empCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void Greeting();


}

class Employee extends Person {

    public Employee(String empCode){
        super(empCode);
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public void Greeting() {
        System.out.println("Hello");
    }
}

public class AbstractionExample {
    public static void main(String args[]) {
        //THIS REFERENCE VARIABLE CAN ACESS ONLY THOSE METHOD WHICH ARE OVERRIDDEN
        // USED FOR ABSTRACTION
        Person person = new Employee("101");
        person.setName("Govind Bhone");
        System.out.println(person.empCode);
        //person.setEmpCode("101");// not working
        System.out.println(person.getName());

        Employee e = new Employee("101");
        e.setName("Govind Bhone");
        e.setEmpCode("101");
    }
}

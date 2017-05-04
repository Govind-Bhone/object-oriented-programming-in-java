package com.java.oops;

/**
 * Created by govind.bhone on 5/3/2017.
 */
/*

One objects relates to other object to use the functionality or behavior of that object .. in oop this is called as association
there are two types of association
1. Composition
2. Aggregation

composition(Has a relationship) /Aggregation : If there are two objects and one object is related to other object as part of has relationship.
it provides writes once ,used anywhere .
1. Has a relationship is also known as composition and aggregation .
2. There is no specific keyword to implement Has a relation but most of the time we are depending on new keyword .
3. The main advantage of Has a relationship is reusability of the code .


Difference between composition and aggregation :
   both have Has a Relationship but there is little difference between them .

Composition : without existing container objects there is no chance of existing contained objects then container and contained
objects are strongly associated and this strong association is nothing but composition...
for example ,
University consist of several departments (CSE , MECH, CIVIL ) . without existing university there is no chance of existing department.
hence , university and depts are strongly associated and this strong association is called as composition .

// container object
class University {
  Department dept ;  //contained objects
}

Aggregation : without existing container objects if there is chance of existing contained objects then  container and contained objects
are weekly associated and this week association is nothing but aggregation ...
for example , department consist of several professors . without existing department there is chance of existing professors .
hence , department and professors are weekly associated and this week association is called as aggregation .

//container object
class Department {
   Professor prof ; // contained objects
}


Note :
1.In composition objects are strongly associated whereas in aggregation objects are weekly associated .
2.In composition container object holds directly contained objects whereas in aggregation container object holds just references of
 contained objects .


When we should go for IS a relationship and Has a relationship ?
If we want total functionality of a class automatically then Is a relationship will serve our purpose .
example ,
Is A relationship

Person
  |
  |
Student

If we want part of the functionality then Has a relationship will serve our purpose .

*/
class Car {
    private String model ;
    //final will make sure engine is initialized
    private final Engine engine;

    public Car (String model, Engine engine){
        this.engine=engine;
        this.model=model;
    }

    public String getSpecification(){
        return "Model : "+model+"\n" +"Engine Type : "+engine.getEngineType()+"\n"+"Engine Serial Number : "+engine.getSerialNumber();
    }
}

class Engine {
  private String engineType;
  private int serialNumber ;

  public String getEngineType(){
      return engineType;
  }

  public void setEngineType(String engineType){
      this.engineType=engineType;
  }

  public int getSerialNumber(){
      return this.serialNumber;
  }

  public void setSerialNumber(int serialNumber){
      this.serialNumber=serialNumber;
  }
}


public class CompositionExample {
    public static void main(String args[]){
        Engine e = new Engine();
        e.setEngineType("Four Stroke");
        e.setSerialNumber(101);
        Car c = new Car("BMW",e);
        System.out.println(c.getSpecification());
    }
}

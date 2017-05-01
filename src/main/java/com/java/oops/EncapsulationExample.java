package com.java.oops;

/**
 * Created by govind.bhone on 5/1/2017.
 */

/*

process of Binding of related data and corresponding behavior into single unit is called encapsulation
if any component follows data hiding and abstraction such type of component is said to be encapsulated component .

            encapsulation = data hiding + abstraction


A class is said to be tightly encapsulated if and only if each and every variable is declared as private irrespective of checking
corresponding getters and setters .

 */

class Student {
    private int rollNumber;
    private String name;
    private String address;

    public Student(){

    }

    public Student(int rollNumber, String name, String address) {
        this.rollNumber = rollNumber;
        this.address = address;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}

public class EncapsulationExample {
  public static void main(String args[]){
      Student s = new Student();
      s.setAddress("pune");
      s.setName("govind");
      s.setRollNumber(1001);
      System.out.println(s.getRollNumber()+":"+s.getName()+":"+s.getAddress());

      s = new Student(1002,"sachin","pusad");
      System.out.println(s.getRollNumber()+":"+s.getName()+":"+s.getAddress());
  }

}

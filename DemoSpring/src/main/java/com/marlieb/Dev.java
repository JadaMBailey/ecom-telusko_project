package com.marlieb;

import org.springframework.stereotype.Component;

@Component
public class Dev {
//    private Laptop laptop;
    private int age;

    public Dev() {
        System.out.println("Dev Constructor");
    }

    public Dev(int age){
        this.age = age;
        System.out.println("Dev 1 Constructor");
    }

    public int getAge(){
        return this.age;
    }

    public void build(){
        System.out.println("Building something here");
    }
}
/*
CONSTRUCTOR INJECTION : Set values of class variables STORED IN Constructor within Spring.xml
1 - Create a parameterised constructor that takes in a local variable
2 - Use a constructor- arg attribute in spring.xml and set the value of the associated variable.
Optional : There is an alternative which is useful for multiple local varaibles being passed in an constructor.
3 - OUTPUT VIEW : Specify object and call the getter method to the variable within a System.out.println() function.
 */
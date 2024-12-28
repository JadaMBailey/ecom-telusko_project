package com.marlieb;

import org.springframework.stereotype.Component;

@Component
public class Dev {
//    private Laptop laptop;
    private int age;

    public Dev() {
        System.out.println("Dev Constructor");
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void build(){
        System.out.println("Building something here");
    }
}
/*
SETTER INJECTION : Set values of class variables within Spring.xml
1 - Create getter and setter methods
2 - Within the specified instance, add 'property' attribute and specify the name of the var and value wanting to assign.
3 - OUTPUT VIEW : Specify object and call the getter method to the variable within a System.out.println() function.
 */
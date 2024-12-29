package com.marlieb;

import org.springframework.stereotype.Component;

@Component
public class Dev {
    private Laptop laptop;
    private int age;

    public Dev() {
        System.out.println("Dev Constructor");
    }

    public Dev(Laptop laptop){
        this.laptop = laptop;
        System.out.println("Dev 1 Constructor with laptop var passed");
    }

    public int getAge(){
        return this.age;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build(){
        System.out.println("Building something here");
        laptop.compile();
    }
}
/*
CONSTRUCTOR INJECTION with a Referenced variable :
1 - pass in local variable 'laptop' of type 'Laptop' into the 'Dev' constructor
2 - Use constructor arg attribute in spring.xml and
set the ref (refers to bean name) attribute.
3 - use the 'laptop' variable to call a method in Laptop class.
 */
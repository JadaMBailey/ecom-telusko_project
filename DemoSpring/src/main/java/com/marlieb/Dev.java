package com.marlieb;

import org.springframework.stereotype.Component;

@Component
public class Dev {
    private Laptop laptop;
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

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build(){
        System.out.println("Building something here");
        laptop.compile();
    }
}
/*
Setter INJECTION with a Referenced variable :
1 - Create getter and setter for the laptop variable
2 - Use a property attribute in spring.xml and
set the name (refers to variable name and ref (refers to bean name) attrs.
3 - use the 'laptop' variable to call a method in Laptop class.
 */
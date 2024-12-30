package com.marlieb;

import org.springframework.stereotype.Component;

@Component
public class Dev {
    private Computer device;
    private int age;

    public Dev() {
        System.out.println("Dev Constructor");
    }

    public Dev(Computer device){
        this.device = device;
        System.out.println("Dev 1 Constructor with device var passed");
    }

    public int getAge(){
        return this.age;
    }

    public Computer getDevice() {
        return device;
    }

    public void setDevice(Computer device) {
        this.device = device;
    }

    public void build(){
        System.out.println("Building something here");
        device.compile();
    }
}
/*
CONSTRUCTOR INJECTION with a Referenced variable :
1 - pass in local variable 'laptop' of type 'Laptop' into the 'Dev' constructor
2 - Use constructor arg attribute in spring.xml and
set the ref (refers to bean name) attribute.
3 - use the 'laptop' variable to call a method in Laptop class.
 */
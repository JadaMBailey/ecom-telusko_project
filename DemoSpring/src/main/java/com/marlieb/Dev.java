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
AUTOWIRING with SPRING.XML when interfaces are involved :
1 - Ensure to use the 'autowire' attr and choose 'byName' which refers to the variable with th specific e class
2 - ensure the bean id is the same as the variable name
 */
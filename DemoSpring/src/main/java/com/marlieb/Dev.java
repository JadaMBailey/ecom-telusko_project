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

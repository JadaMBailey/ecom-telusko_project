package com.marlieb;

import org.springframework.stereotype.Component;


public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop Constructor");
    }

    @Override
    public void compile(){
        System.out.println("My Laptop is compiling");
    }
}

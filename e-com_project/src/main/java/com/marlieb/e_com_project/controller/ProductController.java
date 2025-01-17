package com.marlieb.e_com_project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // URL = "localhost/8080/api/...
public class ProductController {

    @RequestMapping("/")
    public String greet(){
        return "Hello World";
    }
}

package com.marlieb.e_com_project.controller;

import com.marlieb.e_com_project.model.Product;
import com.marlieb.e_com_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api") // URL = "localhost/8080/api/... -> This is to distinguish requests for this controller
public class ProductController {

    @RequestMapping("/")
    public String greet(){
        return "Hello World";
    }

    @Autowired
    ProductService productService;


    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}

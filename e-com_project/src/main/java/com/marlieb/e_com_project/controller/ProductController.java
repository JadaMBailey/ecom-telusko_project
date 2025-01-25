package com.marlieb.e_com_project.controller;

import com.marlieb.e_com_project.model.Product;
import com.marlieb.e_com_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api") // URL = "localhost/8080/api/... -> This is to distinguish requests for this controller
public class ProductController {

    @Autowired
   private ProductService productService;

    @RequestMapping("/home")
    public String greet(){
        return "Hello World";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
      List<Product>  products = productService.getAllProducts();
        return products;
    }

    @GetMapping("/products/{prodId}")
    public Product getAProductById(@PathVariable int prodId){
        return productService.getAProductById(prodId);
    }
}

package com.marlieb.e_com_project.controller;

import com.marlieb.e_com_project.model.Product;
import com.marlieb.e_com_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Product>> getAllProducts(){

         List<Product> products = productService.getAllProducts();
         if (products != null) {
             return new ResponseEntity<>(products, HttpStatus.OK);
         }
         else {
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         }

    }

    @GetMapping("/products/{prodId}")
    public ResponseEntity<Product> getAProductById(@PathVariable int prodId){

        Product product = productService.getAProductById(prodId);

        if (product != null) {
        return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}

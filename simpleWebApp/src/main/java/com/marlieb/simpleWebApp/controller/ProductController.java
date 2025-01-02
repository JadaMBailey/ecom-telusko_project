package com.marlieb.simpleWebApp.controller;

import com.marlieb.simpleWebApp.model.Product;
import com.marlieb.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController// Combines @Controller and @ResponseBody
public class ProductController {

    @Autowired // used for instance of ProductService
    private ProductService prodService;

    @GetMapping("/products") // Used for URL path
public List<Product> getProducts(){
    return prodService.getProducts();
}

@GetMapping("/products/{prodId}")
// @PathVariable links up to what is inside here {asb..}
// , which must be the same as the variable name
public Product getProductById(@PathVariable int prodId){
        return prodService.getProductById(prodId);
}

@PostMapping("/products")
// This annotation is used to match the data being sent from client side to the format set on server side.
    public void addProduct(@RequestBody Product prod){
        System.out.println(prod); // Tip to check what is being sent to server viewing on console.
    // Can additionally check using PostMan and choosing the Get function button to see if product was added
        prodService.addProduct(prod);
}

}
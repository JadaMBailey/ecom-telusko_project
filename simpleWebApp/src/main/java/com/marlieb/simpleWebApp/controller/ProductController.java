package com.marlieb.simpleWebApp.controller;

import com.marlieb.simpleWebApp.model.Product;
import com.marlieb.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController// Combines @Controller and @ResponseBody
public class ProductController {

    @Autowired // used for instance of ProductService
    private ProductService prodService;

    @RequestMapping("/products") // Used for URL path
public List<Product> getProducts(){
    return prodService.getProducts();
}

@RequestMapping("/products/{prodId}")
// @PathVariable links up to what is inside here {asb..}
// , which must be the same as the variable name
public Product getProductById(@PathVariable int prodId){
        return prodService.getProductById(prodId);
}

}



/*
1 - URL is typed in 'localhost:8080/products'
2 - Enters into getProducts method which
requires entering into ProductService class to retrieve the list of type Product
3 - Jumps into 'getProducts' method which then jumps to 'products' variable
4 - that list of data is then returned from ProductService to ProductController
5 - This is then passed to client to see
 */
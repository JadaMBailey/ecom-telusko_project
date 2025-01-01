package com.marlieb.simpleWebApp.service;

import com.marlieb.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    // Creating dummy data
    List<Product> products = Arrays.asList(
            new Product(101, "Iphone 14", 1200),
            new Product(102, "ChromeBook Ultra", 600),
            new Product(103,"Samsung S24", 1000));


    // Want to return a list of products from dummy data
    public List<Product> getProducts(){
        return products;
    }

}

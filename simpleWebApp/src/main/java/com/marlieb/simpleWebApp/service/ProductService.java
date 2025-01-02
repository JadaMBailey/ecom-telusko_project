package com.marlieb.simpleWebApp.service;

import com.marlieb.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    // Creating dummy data, 'new ArrayList' makes it mutable
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone 14", 1200),
            new Product(102, "ChromeBook Ultra", 600),
            new Product(103,"Samsung S24", 1000)));


    // Want to return a list of products from dummy data
    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                // it is fetching the getProductId method which is hidden by Lombok to check against passed prodId
                .filter(p -> p.getProductId() == prodId)
                .findFirst().get();
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }
}

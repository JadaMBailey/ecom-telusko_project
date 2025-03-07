package com.marlieb.simpleWebApp.service;

import com.marlieb.simpleWebApp.model.Product;
import com.marlieb.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired // To get this object, which is spring responsible to create a concrete class that implements 'ProductRepo'
    ProductRepo repo;

    // Creating dummy data, 'new ArrayList' makes it mutable
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "Iphone 14", 1200),
//            new Product(102, "ChromeBook Ultra", 600),
//            new Product(103,"Samsung S24", 1000)));


    // Want to return a list of products from dummy data
    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProducts(Product prod) {
         repo.save(prod); // if data is there it will update, if no it will create (addProduct)
         }

    public void deleteProduct(int productId) {
        repo.deleteById(productId);
    }
    }



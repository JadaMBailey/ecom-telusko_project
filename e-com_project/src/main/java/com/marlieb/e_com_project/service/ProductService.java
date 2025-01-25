package com.marlieb.e_com_project.service;

import com.marlieb.e_com_project.model.Product;
import com.marlieb.e_com_project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
   private ProductRepository productRepo;

    public List<Product> getAllProducts() {
        List<Product> products = productRepo.findAll();
        return products;
    }

    public Product getAProductById(int prod) {
        return productRepo.findById(prod).orElse(new Product());
    }
}

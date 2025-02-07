package com.marlieb.e_com_project.service;

import com.marlieb.e_com_project.model.Product;
import com.marlieb.e_com_project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
   private ProductRepository productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();

    }

    public Product getAProductById(int prod) {
        return productRepo.findById(prod).orElse(null); // 'NULL' is necessary as it will fill in default values to appear if out of bound of search criteria
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
    product.setImageName(imageFile.getOriginalFilename());
    product.setImageType(imageFile.getContentType());
    product.setImageDate(imageFile.getBytes());
        System.out.println(product);
     return productRepo.save(product);
    }

    public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException {
        product.setImageDate(imageFile.getBytes());
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        return productRepo.save(product);
    }

}

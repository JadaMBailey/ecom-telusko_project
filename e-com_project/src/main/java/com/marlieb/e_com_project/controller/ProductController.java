package com.marlieb.e_com_project.controller;

import com.marlieb.e_com_project.model.Product;
import com.marlieb.e_com_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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

    @GetMapping("/product/{prodId}")
    public ResponseEntity<Product> getAProductById(@PathVariable int prodId){

        Product product = productService.getAProductById(prodId);

        if (product != null) {
        return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile){
     try {

         Product product1 = productService.addProduct(product, imageFile);
         return new ResponseEntity<>(product1, HttpStatus.CREATED);
     } catch (Exception e) {
         return new ResponseEntity<>(e.getMessage() ,HttpStatus.INTERNAL_SERVER_ERROR);
     }
    }

    @GetMapping("/product/{productId}/image")
    public ResponseEntity<byte[]> getImageByProductId(@PathVariable int productId){
        Product product = productService.getAProductById(productId);
        byte[] imageFile = product.getImageDate();

        return ResponseEntity.ok().contentType(MediaType.valueOf(product.getImageType()))
                .body(imageFile);
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable int id, @RequestPart Product product, @RequestPart MultipartFile imageFile) throws IOException {
        Product product1 = productService.updateProduct(id,product, imageFile);
        if (product1 != null){
            return new ResponseEntity<>("Updated", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Failed to update", HttpStatus.BAD_REQUEST);
        }
    }

}

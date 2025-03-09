package com.marlieb.e_com_project.repository;

import com.marlieb.e_com_project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    // CRUD operations come from JpaRepository default methods shown in 'ProductService'
    // JPQL (Persistent Query Lnaguage) - Be able to create dynamic methods

    @Query("SELECT p from Product p WHERE " +
            "lower(P.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "lower(P.description) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "lower(P.brand) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
            "lower(P.category) LIKE LOWER(CONCAT('%', :keyword, '%')) OR ")
    List<Product> searchProducts(String keyword);
    
}

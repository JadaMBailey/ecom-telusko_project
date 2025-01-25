package com.marlieb.e_com_project.repository;

import com.marlieb.e_com_project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}

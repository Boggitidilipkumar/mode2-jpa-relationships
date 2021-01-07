package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.Products;

public interface ProductsRepo extends JpaRepository<Products, Integer>{

}

package com.project.sake.repository;   

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.sake.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

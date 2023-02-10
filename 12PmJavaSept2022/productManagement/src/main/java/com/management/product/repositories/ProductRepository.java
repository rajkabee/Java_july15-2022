package com.management.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

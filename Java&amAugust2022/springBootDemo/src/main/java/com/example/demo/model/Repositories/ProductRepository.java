package com.example.demo.model.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.model.entity.Product;
@RestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

}

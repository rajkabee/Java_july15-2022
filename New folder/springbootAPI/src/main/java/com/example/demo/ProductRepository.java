package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
@Repository
@RestResource
public interface ProductRepository extends JpaRepository<Product, Integer> {
}

package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.entities.ProductCategory;
@RestResource
public interface CategoryRepository extends JpaRepository<ProductCategory, Long>{

}

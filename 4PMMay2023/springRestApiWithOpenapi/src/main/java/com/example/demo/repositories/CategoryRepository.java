package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.ProductCategory;
@Repository
@RestResource
public interface CategoryRepository extends JpaRepository<ProductCategory, Long> {

}

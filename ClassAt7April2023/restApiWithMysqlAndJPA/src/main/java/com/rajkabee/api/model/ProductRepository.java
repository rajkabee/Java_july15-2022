package com.rajkabee.api.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.rajkabee.api.entities.Product;
@RestResource
public interface ProductRepository extends JpaRepository<Product, Integer> {

}

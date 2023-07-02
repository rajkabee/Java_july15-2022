package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.Product;
@Repository
@RestResource
public interface ProductReposiory extends JpaRepository<Product, Long> {
	Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);
}

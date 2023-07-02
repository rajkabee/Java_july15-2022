package com.example.demo.repos;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.Product;
@RestResource
public interface ProductRepository extends JpaRepository<Product, Long>{

	
	public Page<Product> findByCategoryId(@RequestParam("id") long id, Pageable pageable);
}

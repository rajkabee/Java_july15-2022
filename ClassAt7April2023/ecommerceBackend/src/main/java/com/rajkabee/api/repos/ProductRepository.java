package com.rajkabee.api.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rajkabee.api.entities.Product;
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByCategoryId(long id);
}

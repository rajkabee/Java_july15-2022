package com.rajkabee.api.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rajkabee.api.entities.ProductCategory;
@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<ProductCategory, Long> {

}

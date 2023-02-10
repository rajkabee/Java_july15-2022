package com.example.demo.model.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.model.entity.Category;
@RestResource
public interface CategoryRepository extends JpaRepository<Category, Long>{

}

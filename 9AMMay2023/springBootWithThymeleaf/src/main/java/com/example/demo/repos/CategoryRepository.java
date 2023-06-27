package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.example.demo.enitites.Category;
@Repository
@RestResource
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}

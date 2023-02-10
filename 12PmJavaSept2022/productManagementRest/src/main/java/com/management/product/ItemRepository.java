package com.management.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.management.product.entity.Item;
@RestResource
public interface ItemRepository extends JpaRepository<Item, Integer> {

}

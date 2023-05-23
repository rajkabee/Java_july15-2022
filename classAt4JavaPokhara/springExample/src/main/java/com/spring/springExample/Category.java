package com.spring.springExample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Category {
	int catId;
	String name;
	public Category(int catId, String name) {
		super();
		this.catId = catId;
		this.name = name;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCatId() {
		return catId;
	}
	//@Value("${category.id}")
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getName() {
		return name;
	}
	//@Value("${category.name}")
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Category [catId=" + catId + ", name=" + name + "]";
	}
	
}

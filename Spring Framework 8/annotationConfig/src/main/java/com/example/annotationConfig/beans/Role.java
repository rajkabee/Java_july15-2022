package com.example.annotationConfig.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Role {
	@Value("1")
	int id;
	@Value("Admin")
	String name;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Role(String name) {
		super();
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + "]";
	}
	
}

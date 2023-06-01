package com.examples.j2se.jdbc.hibernate.oneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="laptops")
public class Laptop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String model;
	public Laptop(int id, String model) {
		super();
		this.id = id;
		this.model = model;
	}
	public Laptop(String model) {
		super();
		this.model = model;
	}
	public Laptop() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", model=" + model + "]";
	}
	
}

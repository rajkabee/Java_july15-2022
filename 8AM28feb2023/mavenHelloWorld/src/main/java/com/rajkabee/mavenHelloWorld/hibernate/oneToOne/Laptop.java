package com.rajkabee.mavenHelloWorld.hibernate.oneToOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="laptop_table")
public class Laptop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="laptop_id")
	int id;
	@Column(name="laptop_model")
	String model;
	@Column(name="laptop_brand")
	String brand;
	
	@OneToOne//(mappedBy = "laptop")
	Student student;
	
	
	public Laptop(int id, String model, String brand, Student student) {
		super();
		this.id = id;
		this.model = model;
		this.brand = brand;
		this.student = student;
	}

	public Laptop(int id, String model, String brand) {
		super();
		this.id = id;
		this.model = model;
		this.brand = brand;
	}
	
	public Laptop(String model, String brand) {
		super();
		this.model = model;
		this.brand = brand;
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", model=" + model + ", brand=" + brand + ", student=" + student + "]";
	}
	
	
	
}

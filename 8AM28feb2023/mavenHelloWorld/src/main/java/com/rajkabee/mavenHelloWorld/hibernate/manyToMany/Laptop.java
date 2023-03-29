package com.rajkabee.mavenHelloWorld.hibernate.manyToMany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
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
	@ManyToMany(fetch = FetchType.LAZY)
	List<Student> students;
	
	
	
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
	
	
	
	
}

package com.examples.j2se.jdbc.hibernate.oneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="laptops")
public class Laptop {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String model;
	@ManyToOne//(mappedBy = "laptops")
	Student student;
	public Laptop(String model) {
		super();
		this.model = model;
	}
	
}

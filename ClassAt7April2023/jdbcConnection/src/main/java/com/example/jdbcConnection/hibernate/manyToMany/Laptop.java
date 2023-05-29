package com.example.jdbcConnection.hibernate.manyToMany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="laptops")
public class Laptop {
	@Column(name="laptop_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column(name="sn")
	int sn;
	@Column(name="model_no")
	String model;
	@Column(name="cost")
	float price;
	@ManyToMany	//(mappedBy = "laptops")
	List<Student> students;
	
	public Laptop(int sn,String model, float price) {
		super();
		this.sn=sn;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", sn=" + sn + ", model=" + model + ", price=" + price + "]";
	}
	

}

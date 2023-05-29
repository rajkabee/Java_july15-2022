package com.example.jdbcConnection.hibernate.oneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	@OneToOne//(mappedBy = "student")
	Laptop laptop;
	public Student(String name, Laptop laptop) {
		super();
		this.name = name;
		this.laptop = laptop;
	}
	
}

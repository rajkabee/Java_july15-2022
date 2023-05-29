package com.example.jdbcConnection.hibernate.oneToMany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
	
	@OneToMany //(mappedBy = "student")
	List<Laptop> laptops;
	
	public Student(String name, ArrayList<Laptop> laptops) {
		super();
		this.name = name;
		this.laptops = laptops;
	}
	
}

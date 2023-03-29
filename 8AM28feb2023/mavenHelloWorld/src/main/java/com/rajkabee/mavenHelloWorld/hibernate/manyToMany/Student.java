package com.rajkabee.mavenHelloWorld.hibernate.manyToMany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data	//getter & setter and toString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "students")
	List<Laptop> laptops;
	
	public Student(String name, ArrayList<Laptop> laptops) {
		super();
		this.name = name;
		this.laptops = laptops;
	}

	public Student(String name) {
		super();
		this.name = name;
	}
	
	
	
	
}

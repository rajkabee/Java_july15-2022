package com.examples.j2se.jdbc.hibernate.oneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	long contact;
	boolean active;
	@OneToOne(mappedBy = "student")
	Laptop laptop;

	public Student(String name, long contact, boolean active, Laptop laptop) {
		super();
		this.name = name;
		this.contact = contact;
		this.active = active;
		this.laptop = laptop;
	}
	
	
	
}

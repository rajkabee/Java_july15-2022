package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String fName;
	String lName;
	String email;
	String mobile;
	String addressLine1;
	String addressLine2;
	String country;
	String city;
	String state;
	int zipCode;
}

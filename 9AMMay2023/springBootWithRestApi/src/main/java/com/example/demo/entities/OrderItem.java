package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class OrderItem {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	int id;
	@OneToOne
	Product product;
	int quantity;
}

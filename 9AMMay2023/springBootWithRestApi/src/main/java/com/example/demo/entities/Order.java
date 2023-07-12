package com.example.demo.entities;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Entity
@Data
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@OneToMany
	List<Address> address;

	@OneToMany
	List<OrderItem> orderItems;
	
	BigDecimal totalPrice;
	boolean isPaid;
}

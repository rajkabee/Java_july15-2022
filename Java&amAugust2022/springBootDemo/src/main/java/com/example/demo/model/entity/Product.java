package com.example.demo.model.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="product_7am")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String manufacturer;
	private String description;
	private BigDecimal unitPrice;
	private int quantity;
	private boolean Active;
	private String imageUrl;
	@CreationTimestamp
	private Date createdDate;
	@UpdateTimestamp
	private Date dateUpdated;
	@ManyToOne
	private Category category;
	public Product(String name, String manufacturer, String description, BigDecimal unitPrice, int quantity,
			boolean active) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		Active = active;
	}
	
	
}

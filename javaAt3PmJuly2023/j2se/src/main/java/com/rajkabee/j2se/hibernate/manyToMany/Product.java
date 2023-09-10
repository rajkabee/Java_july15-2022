package com.rajkabee.j2se.hibernate.manyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="products")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	int id;
	@Column(name="product_name")
	String name;
	@Column(name="product_manufacturer")
	String manufacturer;
	@Column(name="product_description")	
	String description;
	@Column(name="product_unit_price")	
	float unitPrice;
	@Column(name="product_is_active", nullable = false)
	boolean active;
	@ManyToMany(mappedBy="products")
	List<Category> categories;

	
}

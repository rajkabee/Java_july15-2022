package com.example.jdbcConnection.hibernate.oneToMany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
	@ManyToOne// (mappedBy = "laptops")
	Student student;
	
	public Laptop(int sn,String model, float price) {
		super();
		this.sn=sn;
		this.model = model;
		this.price = price;
	}
	

}

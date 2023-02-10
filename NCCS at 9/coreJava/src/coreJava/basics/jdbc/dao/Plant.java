package coreJava.basics.jdbc.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plant {
	private int id;
	private String name;
	private float price;
	
	public Plant(String name, String origin, String uses, float price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
}

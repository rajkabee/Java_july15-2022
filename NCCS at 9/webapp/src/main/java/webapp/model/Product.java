package webapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	long id;
	String name;
	String manufacturer;
	String description;
	float price;
	boolean inStock;
	public Product(String name, String manufacturer, String description, float price, boolean inStock) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
		this.price = price;
		this.inStock = inStock;
	}
	
}

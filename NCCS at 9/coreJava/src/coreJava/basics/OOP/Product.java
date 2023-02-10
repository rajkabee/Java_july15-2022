package coreJava.basics.OOP;


public class Product {
	static final String companyName = "ABC Company";
	int id;
	String name;
	String manufacturer;
	float price;
	
	public Product(int id, String name, String manufacturer) {
		this.id = id;
		this.name = name;
		this.manufacturer= manufacturer;
	}
	public Product() {
	}
	
	
	public Product(String name, String manufacturer, float price) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	public String details() {
		return this.id+". "+this.name+"\t"+this.manufacturer;
	}
}

package coreJava.basics.OOP;


public class Product {
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
	
	public String details() {
		return this.id+". "+this.name+"\t"+this.manufacturer;
	}
}

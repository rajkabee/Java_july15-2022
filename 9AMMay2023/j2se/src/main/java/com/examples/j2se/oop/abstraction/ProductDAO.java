package com.examples.j2se.oop.abstraction;

public class ProductDAO extends DataAccessObject{

	@Override
	public void save() {
		System.out.println("Product saved to the database!");
		
	}

	@Override
	public void read() {
		System.out.println("Product read from the database!");
		
	}

	@Override
	public void update() {
		System.out.println("Product updated in the database!");
		
	}

	@Override
	public void delete() {
		System.out.println("Product deleted from the database!");
		
	}

	

}

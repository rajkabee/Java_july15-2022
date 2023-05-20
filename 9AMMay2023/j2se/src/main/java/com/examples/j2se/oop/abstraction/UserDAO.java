package com.examples.j2se.oop.abstraction;

public class UserDAO extends DataAccessObject{
	
	@Override
	public void save() {
		System.out.println("User saved to the database!");
		
	}

	@Override
	public void read() {
		System.out.println("User read from the database!");
		
	}

	@Override
	public void update() {
		System.out.println("User updated in the database!");
		
	}

	@Override
	public void delete() {
		System.out.println("User deleted from the database!");
		
	}
	
}

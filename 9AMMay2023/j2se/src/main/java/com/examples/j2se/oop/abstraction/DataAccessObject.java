package com.examples.j2se.oop.abstraction;

public abstract class DataAccessObject implements DAO {
	public void connect() {
		System.out.println("Connected to the database!");
	}
	public void disconnect() {
		System.out.println("Disconnected from the database!");
	}

}

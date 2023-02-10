package javaBasics.intro.oop.abstraction.dao;

public abstract class AbstractDao<T> implements DataAccessObject<T>{
	@Override
	public void connect() {
		System.out.println("Connected to the database!");
	}
	@Override
	public void disconnect() {
		System.out.println("Disconnected from the database!");	
	}
}

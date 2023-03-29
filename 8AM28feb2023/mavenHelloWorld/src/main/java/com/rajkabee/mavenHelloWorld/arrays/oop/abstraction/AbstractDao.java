package com.rajkabee.mavenHelloWorld.arrays.oop.abstraction;

public abstract class AbstractDao<T> implements DAO<T>{
	public void connect() {
		System.out.println("Connected to the database!");
	}
	public void disconnect() {
		System.out.println("Disconnected from the database!");
	}
	public abstract void insert(T t);
	public abstract T getOne(int id);
}

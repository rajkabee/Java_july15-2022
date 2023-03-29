package com.rajkabee.mavenHelloWorld.arrays.oop.abstraction;

public interface DAO<T> {
	public void connect();
	public void disconnect();
	public void insert(T t);
	public T getOne(int id);
}
package com.example.j2se.oop;

public abstract class DAO {
	public void connect() {
		System.out.println("Connected..");
	}
	public void disconnect() {
		System.out.println("disconnected");
	}
	public abstract void save();
	public abstract void delete();
}

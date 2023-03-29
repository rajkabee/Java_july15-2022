package com.rajkabee.mavenHelloWorld.arrays.oop.abstraction;

public class Data {
	int id;
	String msg;
	public Data(int id, String msg) {
		super();
		this.id = id;
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Data [id=" + id + ", msg=" + msg + "]";
	}
	
}

package com.rajkabee.springFrameworkExample.autowiring;

public class Laptop {
	int serial;
	String model;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int serial, String model) {
		super();
		this.serial = serial;
		this.model = model;
	}
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Laptop [serial=" + serial + ", model=" + model + "]";
	}
	
	
}

package com.rajkabee.springFrameworkExample.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("machine")
public class Laptop {
	int serial;
	String model;
	public Laptop(int serial, String model) {
		super();
		this.serial = serial;
		this.model = model;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSerial() {
		return serial;
	}
	@Value("3142312")
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public String getModel() {
		return model;
	}
	@Value("Asus Tuf")
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Laptop [serial=" + serial + ", model=" + model + "]";
	}
	
}

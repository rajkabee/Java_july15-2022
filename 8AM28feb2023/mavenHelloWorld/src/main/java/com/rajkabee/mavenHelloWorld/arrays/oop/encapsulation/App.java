package com.rajkabee.mavenHelloWorld.arrays.oop.encapsulation;

public class App {
	public static void main(String[] args) {
		Product p = new Product();
		p.setId(23);
		p.setName("Toothpaste");
		p.setManufacturer("Colgate");
		System.out.println(p.getId()+". "+p.getName()+"\t"+p.getManufacturer());
	}
}

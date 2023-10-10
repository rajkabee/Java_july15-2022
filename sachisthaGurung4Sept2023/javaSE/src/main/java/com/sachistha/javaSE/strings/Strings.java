package com.sachistha.javaSE.strings;

public class Strings {
	public static void main(String[] args) {
		String name = "Sachistha";
		name = "    Pravdf           eena   ";
		name = name.trim();
		System.out.println(name+"d");
		String str = new String("Welcome to JavaTpoint").intern(); // statement - 1  
		String str1 = new String("Welcome to JavaTpoint").intern(); // statement - 2  
		System.out.println(str1 == str); // prints true
		
		System.out.println("simple message");  
		System.err.println("error message"); 
	}
}

package com.rajkabee.mavenHelloWorld.collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> age = new HashMap<>();
		age.put("Ram", 23);
		age.put("Shyam", 49);
		age.put("Amol", 21);
		age.put(null, 45);
		//System.out.println(age.get(null));
		
		for(Map.Entry<String, Integer> entry:age.entrySet()) {
			System.out.println(entry.getKey()+ " : " + entry.getValue());
		}
		
		try {
			Class.forName("com.example.Hello");
			System.out.println();
		} catch (ClassNotFoundException e) {
			try {
				Class.forName("com.mysql.cj.jdbc.Drivers");
				System.out.println("Mysql Driver found!");
			} catch (ClassNotFoundException e1) {
				System.out.println("The class is not found!");
			}
			
		}
		finally {
			System.out.println("Finally block!");
		}
		
		String name="Saroj";
		try {
		System.out.println(name.charAt(10));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}

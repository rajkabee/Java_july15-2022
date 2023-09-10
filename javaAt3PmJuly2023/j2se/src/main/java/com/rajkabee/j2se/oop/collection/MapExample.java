package com.rajkabee.j2se.oop.collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> students = new HashMap<>();
		students.put(123, "Abinash");
		students.put(453, "Bandana");
		students.put(765, "Srijana");
		students.put(333, "Rahul");
		students.put(333, "Sakul");
		students.put(222, "Sakul");
		students.put(null, "Madhu");
		
//		students.forEach((key, value)->{
//			System.out.println(key+" : "+value);
//		});
		for(Map.Entry<Integer, String> entry:students.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
	}
}

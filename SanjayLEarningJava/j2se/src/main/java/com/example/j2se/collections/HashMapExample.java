package com.example.j2se.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> students = new HashMap<>();
		students.put(1, "Ramesh");
		students.put(233, "Ravi");
		students.put(3000, "Kabita");
		students.put(null, "yama");
		//System.out.println(students.get(null));
		
//		students.forEach((id, name)->{
//			System.out.println(id+". "+name);
//		});
		
		for(Map.Entry<Integer, String> entry: students.entrySet()) {
			System.out.println(entry.getKey()+". "+entry.getValue());
		}

		
	}
}

package javaCore.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> students = new HashMap<>();
		students.put("Prabin", 24);
		students.put("Om", 36);
		students.put("Tenji", 21);
		students.put("Pradip", 30);
		students.put(null,27);
		students.put("", 30);
		System.out.println(students.get("Prabin"));
		
		for(Entry<String, Integer> entry: students.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}

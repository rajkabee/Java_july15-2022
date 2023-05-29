package com.example.coreJava.collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> age = new HashMap<>();
		age.put("Ramesh", 56);
		age.put("Subash", 34);
		age.put("Ramila", 24);
		age.put("Ranjita", 25);
		age.put("Meena", 28);
		age.put("Rita", 14);
		age.put(null, 34);
		age.put("Sarita", null);
		age.put("Bhisma", null);
		//System.out.println(age.get("Ranjita"));
//		age.forEach((name, years)->{
//			System.out.println(name+": "+years);
//		});
		for(Map.Entry<String, Integer> entry:age.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
	}
}

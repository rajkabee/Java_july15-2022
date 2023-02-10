package javaBasics.collectionVariables.lists;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> age = new HashMap<>();
		age.put("Tenji", 21);
		age.put("Rusan", 21);
		age.put("Kabiraj", 34);
		
		System.out.println(age.get("Kabiraj"));
		
		for(Entry<String, Integer>item:age.entrySet()) {
			System.out.println(item.getKey()+" : "+item.getValue());
		}
		
	}
}

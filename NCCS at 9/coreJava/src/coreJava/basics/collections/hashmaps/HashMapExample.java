package coreJava.basics.collections.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> fruits = new HashMap<>();
		fruits.put(1, "Apples");
		fruits.put(2, "Bananas");
		fruits.put(3, "Kiwi");
		fruits.put(4, "Papayas");
		System.out.println(fruits.get(2));
		
		HashMap<String, Integer> age = new HashMap<>();
		age.put("Ram", 23);
		age.put("Shyam", 45);
		age.put("Hari", 12);
		age.put("Gita", 17);
		System.out.println(age.get("Gita"));
		
		for(Map.Entry<String, Integer> entry:age.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}
}

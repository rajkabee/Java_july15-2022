package javaSE.dursikshya.example.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		String[] names = {"Ram", "Shyam", "Hari", "Gita", "Rita"};
		System.out.println(names[2]);
		HashMap<String, Integer> age = new HashMap<String, Integer>();
		age.put("Ram", 24);
		age.put("Shyam", 34);
		age.put("Hari", 27);
		age.put("Gita", 18);
		age.put(null, 16);
//		System.out.println(age.get(null));
//		
//		for(Map.Entry<String, Integer> item : age.entrySet()) {
//			System.out.println(item.getKey()+" : "+item.getValue());
//		}
		
		age.forEach((k,v)->{
			System.out.println(k+" : "+v);
		});
	}
}

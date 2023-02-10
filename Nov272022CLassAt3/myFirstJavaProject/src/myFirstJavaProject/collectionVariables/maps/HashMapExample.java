package myFirstJavaProject.collectionVariables.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> age=new HashMap<String, Integer>();
		List<String> fruits = new ArrayList<String>();
 		age.put("Alina", 32);
		age.put("Bisnu", 35);
		age.put("Binod", 22);
		age.put("Alina", 47);
		//age.put(null, 47);
		
		System.out.println(age.get("Alina"));
//		for(Map.Entry<String, Integer> entry:age.entrySet()) {
//			System.out.println(entry.getKey()+" : "+entry.getValue());
//		}
		age.forEach((key,value)->{
			System.out.println(key+" : "+value);
		});
		
		Set<Map.Entry<String, Integer>> ageset = age.entrySet();
		for(Map.Entry<String, Integer> entry:ageset) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		
		
	}
}

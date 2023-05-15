package j2se.eclipse.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> ages = new HashMap<>();
		ages.put("Lihana", 9);
		ages.put("Sunil", 34);
		ages.put("Tara", 19);
		ages.put("Biplop", 45);
		ages.forEach((name, age)->{
			System.out.println(name+" is "+age+"years old.");
		});
		
		
		
		
		
		
		
		HashMap<Integer, String> employees = new HashMap<>();
		employees.put(1, "Pravin Lama");
		employees.put(3, "Pratyush Bhandari");
		employees.put(4, "Jeevan Dahal");
		employees.put(18, "Prajwol Subedi");
		employees.put(null, "Prashant Adhikari");
		employees.put(null, "Sunita Shrestha");
		employees.put(34, null);
		employees.put(21, null);
		
//		employees.forEach((id,name)->{
//			System.out.println(id+". "+name);
//		});
		
		for(Map.Entry<Integer, String> entry:employees.entrySet()) {
			System.out.println(entry.getKey()+". "+entry.getValue());
		}
		
	}
}

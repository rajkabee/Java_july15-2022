package javaSE.dursikshya.example.collections;

import java.util.ArrayList;

public class ArraylistExample {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Harish");
		names.add("Sankalpa");
		names.add("Bidush");
		names.add("Bidush");
		names.add("Bidush");
		names.add("Bidush");
		
//		names.forEach(name->{
//			System.out.println(name);
//		});
		
//		for(int i=0; i<names.size(); i++) {
//			System.out.println(names.get(i));
//		}
		
		for(String name:names) {
			System.out.println(name);
		}
		
		
	}
}

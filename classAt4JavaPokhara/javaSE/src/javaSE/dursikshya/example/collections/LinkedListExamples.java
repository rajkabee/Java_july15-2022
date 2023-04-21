package javaSE.dursikshya.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExamples {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		names.add("samjhana");
		names.add("Alina");
		names.add("Bandana");
		names.forEach(System.out::println);
//		Iterator iterator = names.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
	}
}

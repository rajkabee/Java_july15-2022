package coreJava.basics.collections.lists;

import java.util.LinkedList;

public class LinkedListofList {
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(12354);
		numbers.add(42234);
		numbers.add(13123);
		numbers.add(13213);
		numbers.add(2133);
		numbers.add(5673);
		numbers.add(98863);
		
		
		System.out.println(numbers.get(0));
		for(int i:numbers) {
			System.out.println(i);
		}
	}
}

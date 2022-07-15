package coreJava.basics.collections.lists;

import java.util.ArrayList;

public class ArrayListofList {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(12354);
		numbers.add(42234);
		numbers.add(13123);
		numbers.add(13213);
		numbers.add(2133);
		numbers.add(5673);
		numbers.add(98863);
		
		for(int i:numbers) {
			System.out.println(i);
		}
	}
}

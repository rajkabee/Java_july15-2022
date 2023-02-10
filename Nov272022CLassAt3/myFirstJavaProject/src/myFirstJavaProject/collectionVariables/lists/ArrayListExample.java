package myFirstJavaProject.collectionVariables.lists;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apples");
		fruits.add("Bananas");
		fruits.add("Pineapples");
		fruits.add("Papayas");
		fruits.add("Grapes");
//		for(int i=0; i<fruits.size(); i++) {
//			System.out.println(fruits.get(i));
//		}
//		for(String fruit:fruits) {
//			System.out.println(fruit);
//		}
		/*
		 * fruits.forEach((fruit)->{ System.out.println(fruit); });
		 */
		fruits.forEach(System.out::println);
	}
}

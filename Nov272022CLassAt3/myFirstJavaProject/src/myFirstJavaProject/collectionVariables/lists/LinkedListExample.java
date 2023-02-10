package myFirstJavaProject.collectionVariables.lists;

import java.util.LinkedList;

public class LinkedListExample {
		public static void main(String[] args) {
			LinkedList<String> fruits = new LinkedList<String>();
			fruits.add("Apples");
			fruits.add("Bananas");
			fruits.add("Pineapples");
			fruits.add("Papayas");
			fruits.add("Grapes");
//			for(int i=0; i<fruits.size(); i++) {
//				System.out.println(fruits.get(i));
//			}
//			for(String fruit:fruits) {
//				System.out.println(fruit);
//			}
			/*
			 * fruits.forEach((fruit)->{ System.out.println(fruit); });
			 */
			fruits.forEach(System.out::println);
		}
	}

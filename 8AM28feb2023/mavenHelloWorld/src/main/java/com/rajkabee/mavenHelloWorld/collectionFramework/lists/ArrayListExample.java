package com.rajkabee.mavenHelloWorld.collectionFramework.lists;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
//		ArrayList myList = new ArrayList();
//		myList.add("Sanjeep");
//		myList.add(54);
//		myList.add(345.234f);
//		
//		for(int i=0; i<myList.size(); i++) {
//			System.out.println(myList.get(i));
//		}
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Sudip");
		names.add("Jack");
		names.add("joe");
		names.add("Pratik");
		
		for(String name:names) {
			System.out.println(name);
		}
		
		
		
	}
}

package com.rajkabee.mavenHelloWorld.collectionFramework.lists;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		names.add("Sudip");
		names.add("Jack");
		names.add("joe");
		names.add("Pratik");
		
//		for(String name:names) {
//			System.out.println(name);
//		}
		
		names.forEach(System.out::println);
		names.forEach(name->{
			name+=" Thapa";
			System.out.println(name);
		});
	}
}

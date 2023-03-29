package com.rajkabee.mavenHelloWorld.collectionFramework.set;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> fruits= new HashSet<>();
		fruits.add("Apples");
		fruits.add("Banana");
		fruits.add("Papaya");
		fruits.add("Grapes");
		fruits.add("Apples");
		fruits.forEach(System.out::println);
	}
}

package com.rajkabee.j2se.oop.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets {
	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		names.add("Paul");
		names.add("Jason");
		names.add("Maria");
		names.add("Lily");
		names.forEach(System.out::println);
	}
}

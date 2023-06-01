package com.example.demo.strings;

import java.util.HashSet;
import java.util.TreeSet;

public class SetsExample {
	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();
		names.add("Ramesh");
		names.add("James");
		names.add("Alexi");
		names.add("Kishor");
		names.add("Pritam");
		names.add("Pritam");
		names.add("Pritam");
		names.forEach(System.out::println);
		
	}
}

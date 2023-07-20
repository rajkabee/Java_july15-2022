package com.example.j2se.collections;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		names.add("Saurav");
		names.add("Sangam");
		names.add("sagar");
		names.forEach(System.out::println);
	}
}

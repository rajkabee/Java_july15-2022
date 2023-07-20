package com.example.j2se.collections;

import java.util.ArrayList;

public class ArraylistExample {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Jack");
		myList.add("sameer");
		myList.add("Alex");
		for(int i=0; i<myList.size(); i++) {
			System.out.println(myList.get(i));
		}
	}
}

package com.example.coreJava.collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueueExample {
	public static void main(String[] args) {
		//PriorityQueue<String> names = new PriorityQueue<>();
		Deque<String> names = new ArrayDeque<>();
		names.add("Sarbada");
		names.add("Smriti");
		names.add("Dolma");
		names.add("Robin");
		names.forEach(System.out::println);
	}
}

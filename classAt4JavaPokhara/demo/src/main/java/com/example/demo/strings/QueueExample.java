package com.example.demo.strings;

import java.util.PriorityQueue;

public class QueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(34);
		pq.add(32);
		pq.add(27);
		pq.add(56);
		pq.add(16);
		
		//pq.forEach(System.out::println);
		
		for(int x:pq) {
			System.out.println(x);
		}
	}
}	

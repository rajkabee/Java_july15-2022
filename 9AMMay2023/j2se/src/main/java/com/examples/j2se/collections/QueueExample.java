package com.examples.j2se.collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> myQueue = new PriorityQueue<>();
		myQueue.add(12);
		myQueue.add(23);
		myQueue.add(45);
		myQueue.add(13);
		myQueue.add(7);
		myQueue.add(9);
//		for(int i: myQueue) {
//			System.out.println(i);
//		}
//		for(int i=0; i<6; i++) {
//			System.out.println(myQueue.poll());
//		}
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		deque.add(23);
		deque.add(12);
		deque.add(13);
		deque.add(45);
		deque.add(78);
		deque.add(8);
		
		for(int i=0; i<6; i++) {
			System.out.println(deque.pollLast());
		}
	}
}

package j2se.eclipse.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int i;
		for(i=10; i>0; i--) {
			pq.add(i);
		}
		//pq.forEach(System.out::println);
		for(i=0; i<10; i++) {
			
			System.out.println(pq.poll());
		}
		for(i=0; i<10; i++) {
			System.out.println(pq.poll());
		}
	}
}

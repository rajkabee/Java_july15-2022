package javaSE.dursikshya.example.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample  {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		int i;
		for(i=10; i>0; i--) {
			pq.add(i);
		}
		
		for(i=0; i<10; i++) {
			Integer x = pq.poll();
			System.out.println(x);
		}
		
		
	}
}

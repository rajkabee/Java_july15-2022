package j2se.eclipse.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> mySet = new TreeSet<>();
		mySet.add(1);
		mySet.add(3);
		mySet.add(5);
		mySet.add(2);
		mySet.add(1);
		Iterator<Integer> it = mySet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

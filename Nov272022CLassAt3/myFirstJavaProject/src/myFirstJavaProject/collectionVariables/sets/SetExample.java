package myFirstJavaProject.collectionVariables.sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		Set<String> students = new HashSet<>();
		students.add("Deepak Sapkota");
		students.add("Jeevan Sharma");
		students.add("Subash Mahato");
		System.out.println(students.add("Subodh Shrestha"));
		System.out.println(students.add("Jeevan Sharma"));
		students.forEach(System.out::println);
		
		Set<Integer> num = new TreeSet<>();
		num.add(123);
		num.add(456);
		num.add(789);
		num.add(100);
		num.forEach(System.out::println);
		System.out.println(num.toArray()[3]);
	}
}

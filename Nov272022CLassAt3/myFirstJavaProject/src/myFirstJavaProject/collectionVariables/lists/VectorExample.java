package myFirstJavaProject.collectionVariables.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		//String x[]= {"Apples", "Bananas", "Papayas", "Grapes", "Mangoes"};
		Vector<String> fruits= new Vector<String>();
		fruits.add("Apples");
		fruits.add("Bananas");
		fruits.add("Papayas");
		fruits.add("Grapes");
		fruits.add("Mangoes");
		fruits.add("Kiwi");
		fruits.add("Pineapple");
		fruits.add("Grapefruit");
		fruits.add("Avocado");
		fruits.add("Oranges");
		fruits.add("Coconuts");
		fruits.add("Apples");
		fruits.add("Bananas");
		fruits.add("Papayas");
		fruits.add("Grapes");
		fruits.add("Mangoes");
		fruits.add("Kiwi");
		fruits.add("Pineapple");
		fruits.add("Grapefruit");
		fruits.add("Avocado");
		fruits.add("Oranges");
		fruits.add("Coconuts");
		System.out.println("size: "+fruits.size());
		System.out.println("capacity: "+fruits.capacity());
//		for(int i=0; i<fruits.size(); i++) {
//			System.out.println(i+1+". "+fruits.get(i));
//		}
//		System.out.println();
//		for(String fruit: fruits) {
//			System.out.println(fruit);
//		}
		//fruits.forEach(fruit->{
		//	System.out.println(fruit)
		//});
		//fruits.forEach(fruit->System.out.println(fruit));
		fruits.forEach(System.out::println);

		System.out.println("capacity: "+fruits.capacity());
		
		System.out.println("selected: "+ fruits.get(2));
		
		
	}
}

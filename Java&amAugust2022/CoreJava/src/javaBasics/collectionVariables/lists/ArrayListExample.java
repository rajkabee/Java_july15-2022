package javaBasics.collectionVariables.lists;

import java.util.ArrayList;

public class ArrayListExample {
		public static void main(String[] args) {
			ArrayList<String> cars = new ArrayList<>();
			cars.add("Hyundai");
			cars.add("Toyota");
			cars.add("BMW");
			cars.add("Tesla");
			cars.add("Rolls Royce");
			System.out.println(cars.get(4));
			if(cars.contains("Teslas")) {
				System.out.println("yes");
			}
			System.out.println(cars.size());
			for(int i=0; i<cars.size(); i++) {
				System.out.println(cars.get(i));
			}
			System.out.println();
			System.out.println("using advanced for loop: ");
			for(String car:cars) {
				System.out.println(car);
			}
			System.out.println();
			System.out.println("Using forEach: ");
			cars.forEach(car->{
				System.out.println(car);
			});
		}
}

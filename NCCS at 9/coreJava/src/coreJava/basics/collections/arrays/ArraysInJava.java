package coreJava.basics.collections.arrays;

public class ArraysInJava {
	public static void main(String[] args) {
		
		String[] names = new String[5];
		String[] cars = {"McLaren", "Nissan", "Skoda", "Mercedes"};
		cars[2]= "Lamborghini";
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
	}
}

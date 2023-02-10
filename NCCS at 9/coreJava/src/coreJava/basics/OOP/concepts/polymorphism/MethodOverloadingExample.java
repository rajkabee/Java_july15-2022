package coreJava.basics.OOP.concepts.polymorphism;

public class MethodOverloadingExample {
	public static void main(String[] args) {
		int x=5, y=7, z=27;
		System.out.println("x+y = "+add(x,y));
		System.out.println("x+y+z = "+add(x,y,z));
		
	}

	
	
	
	
	
	
	
	
	
	
	
	private static int add(int x, int y, int z) {
		return x+y+z;
	}

	private static int add(int x, int y) {
		return x+y;
	}
	
	
}


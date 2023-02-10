package javaBasics.intro.oop.polymorphism;

public class MethodOverloading {
	public static void main(String[] args) {
		int a=5, b=7, c=8, sum;
		sum = add(a,b);
		System.out.println("sum1: "+sum);
		sum = add(a,b,c);
		System.out.println("sum2: "+sum);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static int add(int a, int b, int c) {
		int s = a+b+c;
		return s;
	}

	private static int add(int a, int b) {
		int s = a+b;
		return s;
	}
}

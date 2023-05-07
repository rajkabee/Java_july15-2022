package j2se.eclipse.methods;

import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {
		square();
		System.out.println("Enter a number: ");
		int n = new Scanner(System.in).nextInt();
		boolean isPrime = prime(n);
		if(isPrime) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Composite");
		}
		
		int sum = add(34,56);
		System.out.println("Sum: "+sum);
		
		multiply(12,12);
		
		int radius=12;
		float perimeter = 2*pi()*radius;
		System.out.println("Perimeter: "+perimeter);
		
//		ArrayList nums = new ArrayList();
//		nums.add(1);
//		nums.add(2);
//		nums.add(5);
//		nums.add("Salon");
//		nums.forEach(System.out::println);
		
	}
	
	private static boolean prime(int num){
		int i;
		for(i=2; i<=(num/2); i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	private static int add(int a, int b) {
		int c;
		c=a+b;
		return c;
	}
	
	private static void multiply(int a, int b) {
		int c;
		c=a*b;
		System.out.println("Product: "+c);
	}
	
	static float pi(){
		return 3.1415f;
	}
	
	static void square() {
		System.out.println("Enter a number: ");
		int n = new Scanner(System.in).nextInt();
		int sq = n*n;
		System.out.println("Square of "+n+": "+sq);
		
		//var x = "hello";
		
	}
	static int square(int n) {
		return n*n;
	}
	
	
}

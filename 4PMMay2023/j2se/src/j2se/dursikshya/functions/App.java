package j2se.dursikshya.functions;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int a=5, b=7, res;
		divide();
		res=add(a,b);
		System.out.println("result: "+res);
		res=subtract();
		System.out.println("Difference: "+res);
		multiply(a,b);
		
	}
	static int add(int a, int b) {
		int z;
		z=a+b;
		return z;
	}
	static int subtract() {
		int a,b,c;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a-b;
		return c;
	}
	static void  multiply(int a, int b) {
		int p;
		p=a*b;
		System.out.println("Product: "+p);
	}
	static void divide() {
		int a,b,c;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println("Quotient: "+c);
	}
	
	static int power(int b, int p){
		
		return 0;
	}
	
}

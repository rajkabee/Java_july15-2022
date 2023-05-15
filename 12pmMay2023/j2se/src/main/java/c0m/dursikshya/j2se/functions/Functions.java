package c0m.dursikshya.j2se.functions;

import java.util.Scanner;

public class Functions {
	public static void main(String[] args) {
		int a=5, b=7, sum;
		sum=add(b, a);
		divide(a,b);
		System.out.println("Sum: "+sum);
		int diff = subtract();
		System.out.println("Difference: "+diff);
		multiply();
	}
	public static int add(int x, int y) {
		int res;
		res=x+y;
		return res;
	}
	static int subtract(){
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int diff = a-b;
		return diff;
	}
	static void multiply(){
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int product = a*b;
		System.out.println("Product: "+product);
	}
	static void divide(int a,int b){
		System.out.println("Quotient: "+a/b);
	}
}

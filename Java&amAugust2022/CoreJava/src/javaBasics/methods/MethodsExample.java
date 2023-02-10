package javaBasics.methods;

public class MethodsExample {
	public static void main(String[] args) {
		int a=123, b=456;
		int sum=add(a,b);
		System.out.println("Sum: "+sum);
		multiply(a,b);
		float pi = pie();
		System.out.println("pi: "+pi);
		greet();
	}

	private static void greet() {
		System.out.println("Hello mister, welcome to Dursikshya!");
	}

	private static float pie() {
		return 3.1415f;
	}

	static void multiply(int a, int b) {
		int product = a*b;
		System.out.println("Product: "+product);
		
	}

	static int add(int x, int y) {
		int s =x+y;
		return s;
	}
	
	
}

package javaSE.dursikshya.example.methods;

public class Methods {
	public static void main(String[] args) {
		int a=234;
		int b=284;
		int sum;
		sum = add(a,b);
		System.out.println("Sum: "+sum);
		greet("Arjun");
		//depart();
	}

	static int add(int a, int b) {
		int c;
		c=a+b;
		return c;
		//System.out.println("Inside add method");
	}
	static float pi() {
		return 3.1415f;
	}
	
	static void greet(String name) {
		System.out.println("Hello, "+name+". welcome to java world!");
		depart();
	}
	
	static void depart() {
		System.out.println("Bye!");
	}
	
	
	
	
	
	
}

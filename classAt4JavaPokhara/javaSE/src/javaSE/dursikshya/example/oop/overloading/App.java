package javaSE.dursikshya.example.oop.overloading;

public class App {
	public static void main(String[] args) {
		System.out.println(sum(23,45));
		System.out.println(sum(12,23,34));
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static int sum(int i, int j) {
		return i+j;
	}

	private static int sum(int i, int j, int k) {
		return i+j+k;
	}

	
	
	
}

class Person{
	int id;
	String name;
	String email;
	public Person() {
		super();
	}
	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	
	
	
}
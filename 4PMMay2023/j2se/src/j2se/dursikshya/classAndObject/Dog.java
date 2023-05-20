package j2se.dursikshya.classAndObject;

public class Dog {
	int age;
	String breed;
	String color;
	//Person owner;
	
	
	
	public Dog(int age, String breed, String color) {
		this.age = age;
		this.breed = breed;
		this.color = color;
	}
	
	public Dog(String breed, String color) {
		super();
		this.breed = breed;
		this.color = color;
	}

	public Dog() {
	}

	public void feed() {
		System.out.println("Wag tail...");
	}
	public void kick() {
		System.out.println("Bark and attack...");
	}
	
	
	
}

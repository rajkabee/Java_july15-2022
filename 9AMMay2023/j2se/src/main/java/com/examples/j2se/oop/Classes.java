package com.examples.j2se.oop;

public class Classes {
	
	public static void main(String[] args) {
		Dog dog = new Dog(2, "German Shepherd", "brown and black");
		Dog d2 = new Dog("Pug", "Off White");
		Dog d3 = new Dog();
		//dog.age=2;
		//dog.breed="Golden Retriever";
		//dog.color="Brown";
		dog.treat();
		dog.threat();
		System.out.println(dog.toString());
		System.out.println(d2);
		System.out.println(d3);
	}
	
	
}
class Dog{
	String breed;
	int age;
	String color;
	
	
	

	
	public Dog(String breed, String color) {
		super();
		this.breed = breed;
		this.color = color;
	}

	public Dog(int age, String breed, String color) {
		super();
		this.age = age;
		this.breed = breed;
		this.color = color;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	void threat() {
		System.out.println("Barking....");
	}
	void treat() {
		System.out.println("Sway tail...");
	}
	
	
	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", age=" + age + ", color=" + color + "]";
	}
	
}

package javaBasics.intro.oop.classesAndObjects;

public class App {
	public static void main(String[] args) {
		Person p = new Person(456, "Bandana Adhikari", 5.5f);
		Person saurav = new Person();
		
		saurav.id = 123;
		//saurav.name = "Saurav Acharya";
		saurav.height = 5.8f;
		
		p.display();
	}
}

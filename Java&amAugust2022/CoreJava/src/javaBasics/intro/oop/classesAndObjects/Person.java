package javaBasics.intro.oop.classesAndObjects;

public class Person {
	protected int id;
	private String name;
	public float height;
	
	public Person(int id, String name, float height) {
		this.id = id;
		this.name = name;
		this.height = height;
	}
	
	
	
	public Person() {
		super();
	}



	public void display() {
		System.out.println(id+". "+name+"\t"+height);
	}
	
}

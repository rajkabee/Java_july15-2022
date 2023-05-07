package j2se.eclipse.oop.inheritance;

public class Person {
	int id;
	String name;
	int age;
	
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void display() {
		System.out.println(id+". "+name+"\t"+age);
	}
}

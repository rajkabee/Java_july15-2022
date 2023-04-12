package javaSE.dursikshya.example.oop;

public class ClassAndObjects {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person(123413, "Saugat Shrestha", "Lalitpur");
		p1.id=1234;
		p1.name="John Doe";
		p1.address="Kathmandu";
		p1.display();
		p2.id=345;
		p2.name="Rita Huges";
		p2.address="India";
		p2.display();
		p3.display();
		
	}
}

class Person{
	int id;
	String name;
	String address;
	
	
	
	public Person() {
	}

	public Person(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	


	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public void display() {
		System.out.println(id+". "+name+"\t"+address);
	}
}


package c0m.dursikshya.j2se.oop.inheritance;

public class App {
	public static void main(String[] args) {
		Student st = new Student();
		st.id=123;
		st.stream="Physics";
		st.name="Pranish";
		st.gender="Male";
		st.age=14;
		st.display();
	}

	

}

class Person{
	String name;
	int age;
	String gender;
	public Person() {
		System.out.println("Person Constructor called...");
	}
	public void display() {
		System.out.println("Name: "+name+"\tAge: "+age+"\tGender: "+gender);

	}
}

class Student extends Person{
	int id;
	String stream;
	public Student() {
		System.out.println("Student constructor called!");
	}
	@Override
	public void display() {
		super.display();
		System.out.println("id: "+id+"\tStream: "+stream);
	}
	
}

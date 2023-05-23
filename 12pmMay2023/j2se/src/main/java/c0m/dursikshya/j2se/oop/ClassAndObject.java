package c0m.dursikshya.j2se.oop;

public class ClassAndObject {
	public static void main(String[] args) {
		Student st = new Student();
		st.id=123;
		st.name="Naresh Adhikari";
		st.address="Syangja";
		st.display();
		Student st2 = new Student();
		st2.name="Saugat Shrestha";
		st2.address="Kathmandu";
		st2.id=345;
		st2.display();
		Student st3 = new Student();
		st3.display();
		Student st4 = new Student(765, "Prakash Bhandari", "kathmandu");
		st4.display();
	}
}
class Student{
	int id;
	String name;
	String address;
	public Student() {
		
	}
	
	public Student(int id, String name, String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void display() {
		System.out.println(id+". "+name+"\t"+address);
	}
}

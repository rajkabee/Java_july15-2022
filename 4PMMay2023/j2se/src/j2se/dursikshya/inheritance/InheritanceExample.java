package j2se.dursikshya.inheritance;

public class InheritanceExample {
	public static void main(String[] args) {
		Employee emp = new Employee();
		//Person emp = new Employee();
		emp.empId=12345;
		emp.nationalId=4213131;
		emp.name="Sandeep Khanal";
		emp.address="Bhaktapur";
		emp.position="Manager";
		emp.salary=65000f;
		emp.display();
		emp.hello();
	}
}
class Person{
	String name;
	String address;
	int nationalId;	
	
	public Person() {
		System.out.println("Person Constructor called...");
	}

	public void display() {
		System.out.println("National Id: "+nationalId+"\n"+
					"Name: "+name+
					"\nAddress: "+address);
	}
}
class Employee extends Person{
	int empId;
	String position;
	float salary;
	
	public Employee() {
		System.out.println("Employee Constructor called...");
	}
	@Override
	public void display() {
		System.out.println("National Id: "+nationalId+"\n"+
						"Name: "+name+
						"\nAddress: "+address+
						"\nEmployee Id: "+empId+
						"\nposition: "+position+
						"\nSalary: "+salary);
	}
	public void hello() {
		System.out.println("Child Class...");
	}
}

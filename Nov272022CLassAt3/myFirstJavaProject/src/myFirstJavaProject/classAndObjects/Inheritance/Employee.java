package myFirstJavaProject.classAndObjects.Inheritance;

public class Employee extends Person{
	
	int empId;
	String position;
	float salary;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", position=" + position + ", salary=" + salary + "]"+super.toString();
	}
	
	
	
}

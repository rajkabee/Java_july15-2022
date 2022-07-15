package coreJava.basics.OOP.concepts.inheritance;

public class Employee extends Person{
	int empId;
	String dept;
	String position;
	float salary;
	@Override
	public String toString() {
		return "Employee [nationalId=" + nationalId + ", name=" + name + ", address=" + address +"empId=" + empId + ", dept=" + dept + ", position=" 
				+ position + ", salary=" + salary +"]";
	}
	
}

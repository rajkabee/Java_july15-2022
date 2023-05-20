package com.examples.j2se.oop.inheritance;

public class Employee extends Person{
	int empId;
	String position;
	float salary;
	
	public Employee() {
		super();
		System.out.println("Employee.class");
	}

	@Override
	public String display() {
		return "Employee [empId=" + empId + ", position=" + position + ", salary=" + salary + ", nationalId="
				+ nationalId + ", name=" + name + ", address=" + address + "]";
	}
	
}

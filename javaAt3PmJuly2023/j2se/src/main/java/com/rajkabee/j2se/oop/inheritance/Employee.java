package com.rajkabee.j2se.oop.inheritance;

public class Employee extends Person{
	int empId;
	String designation;
	float salary;
	String name;
	public void SetPName(String name) {
		super.name=name;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", designation=" + designation + ", salary=" + salary + ", name=" + super.name + ", address=" + address + ", contact=" + contact+"]"+super.toString();
	}
	
}

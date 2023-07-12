package com.example.j2se.oop;

public class Employee extends Person{
	int empId;
	String designation;
	float salary;
	
	
	
	public Employee(int empId, String designation, float salary,
					int id, String name, String address) {
		super();
		this.empId = empId;
		this.designation = designation;
		this.salary = salary;
		setId(id);
		setName(name);
		setAddress(address);
	}
	public Employee() {
	}





	@Override
	public String display() {
		return getId()+". "+getName()+"\t"+getAddress()+
				"\t"+empId+"\t"+designation+"\t"+salary;
	}
}

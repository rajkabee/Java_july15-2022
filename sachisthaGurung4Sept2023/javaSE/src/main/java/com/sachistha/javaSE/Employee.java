package com.sachistha.javaSE;

public class Employee {
	int id;
	String name;
	String address;
	Department dept;
	
	public void displayEmployeeDetails() {
		System.out.println("Employee: \n id: "
						+id+"\n name: "
						+name+"\n address: "
						+address+"\n dept: "
						+dept.displayDeptDetails());
	}
}

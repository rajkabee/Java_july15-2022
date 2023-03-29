package com.rajkabee.mavenHelloWorld.arrays.oop.inheritance;

public class App {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.id=432;
		emp.name="Mahesh";
		emp.email="mahesh@gmail.com";
		emp.address="Bhaktapur";
		emp.empId=2345654;
		emp.position="Accountant";
		emp.salary=40000;
		System.out.println(emp.toString());
	}
}

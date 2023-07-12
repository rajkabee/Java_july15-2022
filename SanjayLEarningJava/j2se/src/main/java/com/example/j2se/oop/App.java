package com.example.j2se.oop;

public class App {
	public static void main(String[] args) {
		Person p = new Person();
		//p.id=123;
		Employee emp = new Employee();
		emp.empId=123;
		emp.designation="accountant";
		emp.salary=65432.23f;
		System.out.println(emp.display());
		
	}
}

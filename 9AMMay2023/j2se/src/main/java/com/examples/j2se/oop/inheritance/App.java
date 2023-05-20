package com.examples.j2se.oop.inheritance;

public class App {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.nationalId=3123121;
		emp.name="Sudhir Shrestha";
		emp.address="Pokhara";
		emp.empId=123;
		emp.position="Accountant";
		emp.salary=34000f;
		System.out.println(emp.display());
	}
}

package javaBasics.intro.oop.encapsulation;

public class Employee {
	private int empId;
	private String name;
	private String position;
	private float salary;
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
}

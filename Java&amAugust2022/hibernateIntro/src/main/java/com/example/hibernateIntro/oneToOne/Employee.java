package com.example.hibernateIntro.oneToOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employeeOneToOne")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="empId")
	private int id;
	@Column(name="empName")
	private String name;
	private String position;
	private float salary;
	private boolean isActive;
	@OneToOne
	private Department department;
	
	public Employee() {
	}
	public Employee(int id, String name, String position, float salary, boolean isActive) {
		this.id = id;
		this.name = name;
		this.position = position;
		this.salary = salary;
		this.isActive = isActive;
	}
	public Employee(String name, String position, float salary, boolean isActive) {
		this.name = name;
		this.position = position;
		this.salary = salary;
		this.isActive = isActive;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", salary=" + salary + ", isActive="
				+ isActive + ", department=" + department + "]";
	}
	
	
	
	
}

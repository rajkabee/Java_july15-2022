package com.example.hibernateIntro.manyToMany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employeeManyToMany")
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
	@ManyToMany(mappedBy="employees")
	private List<Department> departments;
	
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
	
	
	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", salary=" + salary + ", isActive="
				+ isActive +  "]";
	}
	
	
	
	
}

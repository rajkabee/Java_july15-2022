package com.spring.dependencyInjection.objectInjection;

public class Job {
	String company;
	String position;
	float salary;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
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
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Job(String company, String position, float salary) {
		super();
		this.company = company;
		this.position = position;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Job [company=" + company + ", position=" + position + ", salary=" + salary + "]";
	}
	
}

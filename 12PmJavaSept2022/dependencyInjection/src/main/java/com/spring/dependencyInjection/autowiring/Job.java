package com.spring.dependencyInjection.autowiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("marketing")
public class Job {
	String position;
	float salary;
	public Job(String position, float salary) {
		super();
		this.position = position;
		this.salary = salary;
	}
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPosition() {
		return position;
	}
	@Value("Marketing Manager")
	public void setPosition(String position) {
		this.position = position;
	}
	public float getSalary() {
		return salary;
	}
	@Value("45000")
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Job [position=" + position + ", salary=" + salary + "]";
	}
	
}

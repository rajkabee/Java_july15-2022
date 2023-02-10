package javaCore.oop.inheritance;

public class Employee extends Person{
	String position;
	float salary;
	public String display() {
		return super.display()+" "+position+" "+salary;
	}
	
}

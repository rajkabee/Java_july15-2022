package javaBasics.intro.oop.inheritance;

public class Employee extends Person{
	int empId;
	String position;
	int salary;
	
	public String display() {
		return super.display()+"\n"+empId+". "+position+"\t"+salary;
	}
	
}

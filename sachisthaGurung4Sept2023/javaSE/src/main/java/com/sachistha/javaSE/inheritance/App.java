package com.sachistha.javaSE.inheritance;

public class App {
	public static void main(String[] args) {
		Person p = new Person(123, "Sudip Bista", "Kathmandu", 1995);
		System.out.println("Age: "+p.getAge());
		Student st = new Student();
		st.id=4321;
		st.name="Sachistha Gurung";
		st.address="Chandol";
		st.birthYear=2004;
		System.out.println("Students' age: "+st.getAge()+"months");
		
		int sum = add(2, 3, 5);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	
}

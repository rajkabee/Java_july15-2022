package com.rajkabee.mavenHelloWorld.oop;

public class ClassAndMethods {
	
	static class Person{
		static String country="nepal";
		int id;
		String name;
		int age;
		
		public Person(int id, String name, int age) {
			this.id=id;
			this.name=name;
			this.age=age;
		}
		
		public Person() {
			
		}
		
		public String toString() {
			return id+". "+name+"\t"+age+"\t"+country;
		}
	}
	
	public static void main(String[] args) {
		int x;
		x=56;
		Person p = new Person();
		p.id=1;
		p.name = "Rajesh";
		p.age = 43;
		p.country="Japan";
		System.out.println(p.id+". "+p.name+"\t"+p.age);
		System.out.println(p.toString());
		Person p2 = new Person();
		p2.id=2;
		p2.name="Sharmila";
		p2.age=32;
		System.out.println(p2.toString());
		Person p3 = new Person(3, "Sanchita", 26);
		System.out.println(p3.toString());
		
		System.out.println(p.toString());
		
		System.out.println(Person.country);
	}
}


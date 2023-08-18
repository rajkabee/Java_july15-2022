package com.rajkabee.j2se.oop;

public class App {
	public static void main(String[] args) {
		Person p = new Person();
		p.name="Sanskar Subedi";
		p.address="pokhara";
		p.age=23;
		
		Person p2 = new Person();
		p2.name="Sangam Subedi";
		p2.address="Chitwan";
		p2.age=33;
		
		Person p3 = new Person("Sabina Khadka", "Lalitpur", 37);
		
		p.display();
		p2.display();
		p3.display();
		
		
	}
public static class Person {
		private String name;
		private String address;
		private int age;
		
		public Person() {
			
		}
		
		public Person(String name, String address, int age) {
			this.name=name;
			this.address = address;
			this.age=age;
		}
		
		
		public Person(String name, String address) {
			this.name = name;
			this.address = address;
		}

		public void display() {
			System.out.println("name: "+name+"\naddress: "+address+"\nage: "+age);
		}
	}

}

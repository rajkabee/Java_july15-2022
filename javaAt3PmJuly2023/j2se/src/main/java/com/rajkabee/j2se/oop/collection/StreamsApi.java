package com.rajkabee.j2se.oop.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsApi {
	
	public static void main(String[] args) {
		List<Person> people = getPeople();
		System.out.println("Oldest: "+people.stream().max(Comparator.comparing(p->p.getAge())).get());
		System.out.println("Youngest: "+people.stream().min(Comparator.comparing(p->p.getAge())).get());
		System.out.println("Sorted List:");
		people.stream()
			.sorted(Comparator.comparing(Person::getAge).reversed())
			.collect(Collectors.toList())
			.forEach(System.out::println);
		System.out.println("Reversed sorted List:");
		people.stream()
		.sorted(Comparator.comparing(Person::getAge).reversed())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		System.out.println("Any Minors: "+
				people.stream()	
						.anyMatch(p->p.getAge()<18)
				);
		System.out.println("All Minors: "+
				people.stream()	
					.allMatch(p->p.getAge()<18)
				);
		System.out.println("None Minors: "+
				people.stream()	
					.noneMatch(p->p.getAge()<18)
				);
		people.stream()
			.collect(Collectors.groupingBy(Person::getGender))
			.forEach((gender , group)->{
				System.out.println("Group of "+gender+": ");
				group.forEach(System.out::println);
			});
			
		
	}
	
	static List<Person> getPeople(){
		return Arrays.asList(new Person[] {
			new Person("Sujan Shah", Gender.MALE, 34),
			new Person("Priyanka Thakuri", Gender.FEMALE, 29),
			new Person("Jenny Dangol", Gender.FEMALE, 32),
			new Person("Rajib Bikram Shah", Gender.MALE, 20),
			new Person("Rebecca Kumal", Gender.FEMALE, 24),
			new Person("Ruby Thakuri", Gender.FEMALE, 13),
			new Person("Janak Giri", Gender.MALE, 56),
			new Person("Animesh Dahal", Gender.MALE, 12),
			new Person("Bhisma Aryal", Gender.MALE, 77),
			new Person("Amol Thapa", Gender.MALE, 39),
			new Person("Binay Chaudhary", Gender.MALE, 19),
			new Person("Bikalp Chaudhary", Gender.MALE, 18),
			new Person("Nabaraj Bohora", Gender.MALE, 19),
		} );
		
	}
}
class Person{
	String name;
	Gender gender;
	int age;
	public Person(String name, Gender gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
}
enum Gender{
	MALE, FEMALE
}

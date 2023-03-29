package com.rajkabee.mavenHelloWorld.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person[] {
					new Person("Suraj", 23, Gender.MALE),	
					new Person("Manoj", 33, Gender.MALE),	
					new Person("Dipak", 13, Gender.MALE),	
					new Person("Geeta", 21, Gender.FEMALE),	
					new Person("Jagdish", 57, Gender.MALE),	
					new Person("Sarita", 7, Gender.FEMALE),	
					new Person("Ranjana", 34, Gender.FEMALE),	
					new Person("Manisha", 35, Gender.FEMALE),	
					new Person("Alina", 17, Gender.FEMALE),	
					new Person("Manish", 25, Gender.MALE),	
					new Person("Yamuna", 65, Gender.FEMALE),
					new Person("Suraj", 23, Gender.MALE),	
					new Person("Manoj", 33, Gender.MALE),	
					new Person("Dipak", 13, Gender.MALE),	
					new Person("Geeta", 21, Gender.FEMALE),	
					new Person("Jagdish", 57, Gender.MALE),	
					new Person("Sarita", 7, Gender.FEMALE),	
					new Person("Ranjana", 34, Gender.FEMALE),	
					new Person("Manisha", 35, Gender.FEMALE),	
					new Person("Alina", 17, Gender.FEMALE),	
					new Person("Manish", 25, Gender.MALE),	
					new Person("Yamuna", 65, Gender.FEMALE)	
				}
				);
		System.out.println("Adults:");
		//List<Person> adults = 
				people.stream()
				.filter(p->p.getAge()>18)
				.collect(Collectors.toList())
				.forEach(System.out::println);;
//		adults.forEach(p->{
//							System.out.println(p);
//						});
//		adults.forEach(System.out::println);
		System.out.println("Sorted:");
		people.stream()
			.sorted(Comparator.comparing(Person::getAge))
			.collect(Collectors.toList())
			.forEach(System.out::println);
				
		System.out.println("Reverse Sorted:");
		people.stream()
		.sorted(Comparator.comparing(Person::getAge).reversed())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("All Adults: ");
		System.out.println(people.stream().allMatch(person->person.getAge()>=18));
		
		System.out.println("Any Adults: ");
		System.out.println(people.stream().anyMatch(person->person.getAge()>=18));
		
		System.out.println("None Adults: ");
		System.out.println(people.stream().noneMatch(person->person.getAge()>=18));
		
		System.out.println("Youngest: "+people.stream().min(Comparator.comparing(Person::getAge)).get());
		System.out.println("oldest: "+people.stream().max(Comparator.comparing(Person::getAge)).get());
		
		System.out.println("Grouped By Gender: ");
		Map<Gender, List<Person>> groupedByGender=
		people.stream()
			.collect(
					Collectors.groupingBy(Person::getGender)
					);
		
		groupedByGender.forEach(
				(gender,group)->{
					System.out.println(gender);
					group.forEach(System.out::println);
				}
				);
		
		System.out.println("Distinct: ");
		List<Integer> nums = Arrays.asList(new Integer[] {6,5,4,3,2,3,4,5,6,7,8,9,0,1});
		
		nums.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		
		
		System.out.println("Distinct: ");
		List<String> names = Arrays.asList(new String[] {"Manisha", "Devi", "Alina","Surakshya","Manisha", "Devi", "Alina"});
		
		names.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		
//		people.stream()
//			.distinct()
//			.collect(Collectors.toList()).forEach(System.out::println);
	}
}

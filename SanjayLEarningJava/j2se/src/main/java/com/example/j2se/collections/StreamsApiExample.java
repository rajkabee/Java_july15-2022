package com.example.j2se.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsApiExample {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person[]{
					new Person("Prajwol", 33, Gender.MALE),
					new Person("Rakshya", 32, Gender.FEMALE),
					new Person("Puskar", 22, Gender.MALE),
					new Person("Ram", 43, Gender.MALE),
					new Person("Gita", 13, Gender.FEMALE),
					new Person("Sita", 7, Gender.FEMALE),
					new Person("Rita", 59, Gender.FEMALE),
					new Person("Govinda", 66, Gender.MALE),
					new Person("Abdul", 75, Gender.MALE),
					new Person("Alex", 92, Gender.MALE),
					new Person("John", 23, Gender.MALE),
				});
		
		System.out.println(people.stream()
				.max(Comparator.comparing(Person::getAge)).get());
		System.out.println(people.stream()
				.min(Comparator.comparing(Person::getAge)).get());
		if(people.stream()
				.anyMatch(person->{return person.getAge()>18;})) {
			System.out.println("There are adults!");
		}
		if(people.stream()
				.allMatch(person->{return person.getAge()>18;})) {
			System.out.println("Everyone is an adult!");
		}
		else {
			System.out.println("There are minors!");
		}
		if(people.stream()
				.noneMatch(person->{return person.getName().equalsIgnoreCase("Alex");})) {
			System.out.println("Alex is not in the group!");
		}
		else {
			System.out.println("Alex is in the group!");
		}
		List<Person>adults =  people.stream()
			.filter(person->{return person.getAge()>=18;})
			.collect(Collectors.toList());
		adults.forEach(System.out::println);
		
		
		Map<Gender, List<Person>> groupedByGender =  people.stream()
			.collect(Collectors.groupingBy(person->person.getGender()));
		
		groupedByGender.forEach((gender, group)->{
			System.out.println(gender);
			group.forEach(System.out::println);
		});
	}
}

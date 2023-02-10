package javaCore.collections.streamExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamExample {
	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>();
		people.add(new Person(23, "Anish", Gender.male));
		people.add(new Person(35, "Manisha", Gender.female));
		people.add(new Person(22, "Aniket", Gender.male));
		people.add(new Person(52, "Narayan", Gender.male));
		people.add(new Person(22, "Sajina", Gender.female));
		people.add(new Person(35, "Manisha", Gender.female));
		people.add(new Person(44, "Sajana", Gender.female));
		people.add(new Person(7, "Jiyana", Gender.female));
		people.add(new Person(35, "Manisha", Gender.female));
		people.add(new Person(66, "Madhav", Gender.male));
		people.add(new Person(17, "Dipak", Gender.male));
		people.add(new Person(17, "Dipak", Gender.male));
		
		
		List<Person> peopleOlderThan =people.stream()
				.filter(person->person.getAge()>30)
				.collect(Collectors.toList());
		peopleOlderThan.forEach(person->{
			System.out.println(person);
		});
		System.out.println("Ordered list: ");
		people.stream()
				.sorted(Comparator.comparing(Person::getAge))
				.collect(Collectors.toList())
				.forEach(p->{
					System.out.println(p);
					
				});
		System.out.println("Reverse Ordered list: ");
		people.stream()
				.sorted(Comparator.comparing(Person::getAge).reversed())
				.collect(Collectors.toList())
				.forEach(p->System.out.println(p));
		System.out.println("Multiple Compared list: ");
		people.stream()
				.sorted(
						Comparator.comparing(Person::getAge)
						.thenComparing(Person::getName)
						)
				.collect(Collectors.toList())
				.forEach(p->System.out.println(p));
		
		System.out.println("Is Everyone older than: ");
		System.out.println(
				people.stream()
				.allMatch(person->person.getAge()>20)
				);
		
		System.out.println("Is anyone older than: ");
		System.out.println(
				people.stream()
				.anyMatch(person->person.getAge()>70)
				);
		
		System.out.println("Is no one older than: ");
		System.out.println(
				people.stream()
				.noneMatch(person->person.getAge()>70)
				);
		
		System.out.println("oldest: ");
		
		people.stream()
		.max(Comparator.comparing(Person::getAge))
		.ifPresent(System.out::println);
		
		System.out.println("Youngest: ");
		people.stream()
		.min(Comparator.comparing(Person::getAge))
		.ifPresent(System.out::println);
					
		Map<Gender, List<Person>> groupByGender = 
				people.stream()
				.collect(Collectors.groupingBy(Person::getGender));
		
		groupByGender.forEach((gender, people1)->{
			System.out.println(gender+": ");
			people1.forEach(person->System.out.println(person));
		});
		
		//List<Person> personListFiltered = people.
		
		//System.out.println("Distinct: ");
		List<Person> distinctPeople = people.stream()
		.distinct()
		.collect(Collectors.toList());
		distinctPeople.forEach(System.out::println);
		
		
		
		
		
	}
}

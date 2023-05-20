package j2se.eclipse.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsApiExample {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
			new Person[] {
				new Person(1, "Sangita Adhikari", 24, Gender.FEMALE),	
				new Person(8, "Prajwol Subedi", 13, Gender.MALE),
				new Person(4, "Devi Shrestha", 24, Gender.FEMALE),	
				new Person(5, "Jyoti Pradhan", 78, Gender.FEMALE),	
				new Person(6, "Prshant Thapa", 63, Gender.MALE),	
				new Person(7, "Binit Ghale", 12, Gender.MALE),	
				new Person(7, "Binit Ghale", 12, Gender.MALE),	
				new Person(2, "Sunita Adhikari", 14, Gender.FEMALE),	
				new Person(8, "Anikit Chaudhary", 7, Gender.MALE),	
				new Person(3, "Pragya Shrestha", 34, Gender.FEMALE)	
			}
			);
		
		
		List<Person> adults = people.stream()
					.filter(person->person.getAge()>20)
					.collect(Collectors.toList());
		adults.forEach(System.out::println);
//		for(int i=0; i<adults.size(); i++) {
//			System.out.println(adults.get(i));
//		}
		
		System.out.println("Oldest: "+people.stream()
			.max(Comparator.comparing(Person::getAge)).get());
		System.out.println("Youngest: "+people.stream()
		.min(Comparator.comparing(Person::getAge)).get());
		
		System.out.println("Sorted by Age: ");
		System.out.println("Ascending: ");
		people.stream()
				.sorted(Comparator.comparing(Person::getAge))
				.collect(Collectors.toList())
				.forEach(System.out::println);
		System.out.println("Descending: ");
		people.stream()
		.sorted(Comparator.comparing(Person::getAge).reversed())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("Ascending: ");
		people.stream()
		.sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.print("Is Everyone an adult: ");
		System.out.println(people.stream().allMatch(p->p.getAge()>18));
		System.out.print("Is There any adults: ");
		System.out.println(people.stream().anyMatch(p->p.getAge()>18));
		System.out.print("Arent There any adults: ");
		System.out.println(people.stream().noneMatch(p->p.getAge()>18));
		
		
		System.out.println("\n\nGrouped by gender:");
		Map<Gender, List<Person>> groupedByGender = people.stream()
							.collect(Collectors.groupingBy(Person::getGender));
		
		groupedByGender.forEach((gender, myList)->{
			System.out.println(gender);
			myList.forEach(System.out::println);
		});
		
		System.out.println("Distinct: ");
		people.stream()
		.distinct()
		.collect(Collectors.toList())
		.forEach(System.out::println);
		List<String> names = Arrays.asList(
						new String[] {
								"Sabina", "Rojina",
								"Bandana", "Shova",
								"Ayush", "Sudeep",
								"Ayush", "Sudeep" 
						}
					);
		names.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
	}
}

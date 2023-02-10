package javaBasics.intro.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>();
		people.add(new Person("Prajwol", 32, Gender.male));
		people.add(new Person("Rakshya", 29, Gender.female));
		people.add(new Person("Sabindra", 34, Gender.male));
		people.add(new Person("Rojina", 25, Gender.female));
		people.add(new Person("Sarita", 65, Gender.female));
		people.add(new Person("Jiyana", 7, Gender.female));
		people.add(new Person("Ankit", 14, Gender.male));
		people.add(new Person("Santosh", 45, Gender.male));
		
		List<Person> olderThan30 = people.stream()
				.filter(person->person.getAge()>30)
				.collect(Collectors.toList());
		System.out.println("Peoplr older than 30: ");
		for(Person p:olderThan30) {
			System.out.println(p);
		}
		
		List<Person> sortedPeople =people.stream()
				.sorted(Comparator.comparing(Person::getAge))
				.collect(Collectors.toList());
		System.out.println("Sorted People: ");
		for(Person p:sortedPeople) {
			System.out.println(p);
		}
		
		List<Person> sortedPeopleDes =people.stream()
				.sorted(Comparator.comparing(Person::getAge).reversed())
				.collect(Collectors.toList());
		System.out.println("Sorted People Reversed: ");
		for(Person p:sortedPeopleDes) {
			System.out.println(p);
		}
		
		
		sortedPeople =people.stream()
				.sorted(
						Comparator.comparing(Person::getAge)
						.thenComparing(Person::getGender)
						)
	
				.collect(Collectors.toList());
		System.out.println("Sorted People: ");
		for(Person p:sortedPeople) {
			System.out.println(p);
		}
		boolean matchAll=people.stream()
					.allMatch(person->person.getAge()>6);
		System.out.println("All people older than 6: "+matchAll);
		
		boolean matchAny = people.stream()
					.anyMatch(person->person.getAge()<7);
		System.out.println("Any person older younger than 7: "+matchAny);
		
		boolean matchNone = people.stream()
					.noneMatch(person->person.getName().equalsIgnoreCase("Rojina"));
		System.out.println("Is Rojina not in the list: "+matchNone);
		
		System.out.println("Oldest: ");
		people.stream()
			.max(Comparator.comparing(Person::getAge))
			.ifPresent(System.out::println);
			
		System.out.println("Youngest: ");
		people.stream()
			.min(Comparator.comparing(Person::getAge))
			.ifPresent(System.out::println);
		
		
		Map<Gender, List<Person>> groupByGender = people.stream()
					.collect(
						Collectors.groupingBy(Person::getGender)
						);
		
		groupByGender.forEach((gender, people1)->{
								System.out.println(gender);
								people1.forEach(System.out::println);
								System.out.println();
							});
		
	}
	
	
	private static class Person{
		String name;
		int age;
		Gender gender;
		public Person(String name, int age, Gender gender) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Gender getGender() {
			return gender;
		}
		public void setGender(Gender gender) {
			this.gender = gender;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
		}
		
		
		
	}
	
	static enum Gender{
		male, female
	}
	
	
}


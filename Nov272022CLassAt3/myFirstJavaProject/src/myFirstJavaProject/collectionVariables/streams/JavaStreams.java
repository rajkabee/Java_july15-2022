package myFirstJavaProject.collectionVariables.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import myFirstJavaProject.collectionVariables.streams.StreamsExample.Gender;
import myFirstJavaProject.collectionVariables.streams.StreamsExample.Person;

public class JavaStreams {
	
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				 new Person("Namita Shrestha", Gender.female, 27),
				 new Person("Sanjay Pajiyar", Gender.male, 23),
				 new Person("Karuna Shrestha", Gender.female, 10),
				 new Person("Nawadeep Adhikari", Gender.male, 35),
				 new Person("Jyoti Dadal", Gender.female, 45),
				 new Person("Suraj Dahal", Gender.male, 67),
				 new Person("Surya Pradhan", Gender.male, 33),
				 new Person("Pawan Shrestha", Gender.male, 39),
				 new Person("Najina Sunar", Gender.female, 7),
				 new Person("Jyoti Dadal", Gender.female, 45),
				 new Person("Suraj Dahal", Gender.male, 67),
				 new Person("Surya Pradhan", Gender.male, 33),
				 new Person("Pawan Shrestha", Gender.male, 39),
				 new Person("Najina Sunar", Gender.female, 7)
				);
		System.out.println("Sorted: ");
		people.stream()
			.sorted(Comparator.comparing(Person::getAge))
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		System.out.println("\n reverse sorted: ");
		people.stream()
		.sorted(Comparator.comparing(Person::getAge).reversed())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		
		System.out.println("\n People age>30: ");
		people.stream()
				.filter(person->person.getAge()>30)
				.collect(Collectors.toList())
				.forEach(System.out::println);
		
		System.out.println("\nIs Everyone Adult: ");
		if(people.stream()
				.allMatch(person->person.getAge()>18)) {
			System.out.println("yes, Everyone is an adult!");
		}
		else {
			System.out.println("no, Some are minors!");
		}
			
		System.out.println("\nIs Everyone Adult: ");
		if(people.stream()
				.noneMatch(person->person.getAge()<18)) {
			System.out.println("yes, Everyone is an adult!");
		}
		else {
			System.out.println("no, Some are minors!");
		}
		
		System.out.println("\nIs anyone Adult: ");
		if(people.stream()
				.anyMatch(person->person.getAge()>67)) {
			System.out.println("yes, someone is an adult!");
		}
		else {
			System.out.println("no, everyone is minors!");
		}
		System.out.println("\n Oldest: ");
		System.out.println(
				people.stream()	
				.max(Comparator.comparing(Person::getAge))
				.get()
				);
		System.out.println("\n Youngest: ");
		System.out.println(
				people.stream()	
				.min(Comparator.comparing(Person::getAge))
				.get()
				);
		
		Map<Gender, List<Person>> groupedByGender=
		people.stream()
			.collect(Collectors.groupingBy(Person::getGender));
		
		groupedByGender.forEach((gender, group)->{
			System.out.println("\nGroup of: "+gender);
			group.forEach(System.out::println);
		});
		
		System.out.println("\nDistinct: ");
		people.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		
		
		System.out.println(people.stream().count());;
		//people.stream()...
	}
	
	
	static enum Gender{
		male, female
	}
	static class Person{
		String name;
		int age;
		Gender gender;
		public Person(String name, Gender gender, int age) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
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
	
	
	
}

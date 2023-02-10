package myFirstJavaProject.collectionVariables.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {
	public static void main(String[] args) {
		
		ArrayList<Person> people = new ArrayList<>();
		people.add(new Person(1, "Namita Shrestha", Gender.female, 27));
		people.add(new Person(2, "Sanjay Pajiyar", Gender.male, 23));
		people.add(new Person(3, "Karuna Shrestha", Gender.female, 10));
		people.add(new Person(4, "Nawadeep Adhikari", Gender.male, 35));
		people.add(new Person(5, "Jyoti Dadal", Gender.female, 45));
		people.add(new Person(6, "Suraj Dahal", Gender.male, 67));
		people.add(new Person(7, "Surya Pradhan", Gender.male, 33));
		people.add(new Person(8, "Pawan Shrestha", Gender.male, 39));
		people.add(new Person(9, "Najina Sunar", Gender.female, 7));
		//filter
		people.stream()
			.filter(person->person.getAge()>30)
			.collect(Collectors.toList())
			.forEach(person->System.out.println(person));
		//sorting
		System.out.println();
		System.out.println("Sorting about age: ");
		people.stream()
			.sorted(Comparator.comparing(Person::getAge))
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		//sorting
		System.out.println();
		System.out.println("Reverse Sorting about age: ");
		people.stream()
		.sorted(Comparator.comparing(Person::getAge).reversed())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		//AllMatch
		System.out.println();
		System.out.println("see if match all: ");
		if(people.stream()
		.allMatch(person->person.getAge()>6)) {
			System.out.println("Everyone is older than 6!");
		}
		else {
			System.out.println("not everyone is older than 6!");
		}
		
		//AnyMatch
		System.out.println();
		System.out.println("see if match all: ");
		if(people.stream()
				.anyMatch(person->person.getAge()<10)) {
			System.out.println("Someone is younger than 10!");
		}
		else {
			System.out.println("No one is younger than 10!");
		}
		
		//noneMatch
		System.out.println();
		System.out.println("see if match all: ");
		if(people.stream()
				.noneMatch(person->person.getAge()<10)) {
			System.out.println("No one is younger than 10!");
		}
		else {
			System.out.println("Someone is younger than 10!");
		}
		
		//min
		System.out.println();
		System.out.println("Minimum Value: ");
		System.out.println(
				people.stream()
					.min(Comparator.comparing(Person::getAge)).get()
				);
		
		//max
		System.out.println();
		System.out.println("Maximum Value: ");
		System.out.println(
				people.stream()
				.max(Comparator.comparing(Person::getAge)).get()
				);
		
		
		//grouping
		
		System.out.println();
		System.out.println("Grouping by gender: ");
		
		Map<Gender, List<Person>> GroupedByGender = people.stream()
										.collect(Collectors.groupingBy(Person::getGender));
										
		GroupedByGender.forEach((gender, group)->{
			System.out.println("Group of "+ gender);
			group.forEach(System.out::println);
			System.out.println();
		});						
										
										
										
										
		
	}
	
	public static class Person{
		int id;
		String name;
		Gender gender;
		int age;
		public Person(int id, String name, Gender gender, int age) {
			super();
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.age = age;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
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
			return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
		}
		
		
		
	}
	public static enum Gender{
		male, female
	}
}

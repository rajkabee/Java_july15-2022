package javaCore.collections.streamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>();
		people.add(new Person(23, "Anish", Gender.male));
		people.add(new Person(35, "Manisha", Gender.female));
		people.add(new Person(22, "Aniket", Gender.male));
		people.add(new Person(52, "Narayan", Gender.male));
		people.add(new Person(22, "Sajina", Gender.female));
		people.add(new Person(44, "Sajana", Gender.female));
		people.add(new Person(7, "Jiyana", Gender.female));
		people.add(new Person(66, "Madhav", Gender.male));
		people.add(new Person(17, "Dipak", Gender.male));
		
		boolean allOlderThan = people.stream()
								.allMatch(person->person.age>7);
		
		
		System.out.println(allOlderThan);
		
		boolean anyOlderThan = people.stream()
								.anyMatch(person->person.age>70);
		System.out.println(anyOlderThan);
		
		ArrayList<Person> peopleOlderThan =(ArrayList<Person>) people.stream()
				.filter(person->person.age>50)
				.collect(Collectors.toList());
		
		
		System.out.println(peopleOlderThan);
		
		people.stream().forEach(person->{
			System.out.println("Foreach: "+person);
		});	
		List<Person> sortedList = people.stream()
				.sorted(Comparator.comparing(Person::getAge))
				.collect(Collectors.toList());
	 
	    sortedList.forEach(System.out::println);
	    
	    List<Person> revSortedList = people.stream()
				.sorted(Comparator.comparing(Person::getAge).reversed())
				.collect(Collectors.toList());
	    System.out.println("Reverse Sort: ");
	    revSortedList.forEach(System.out::println);
	    
	    
	    Person minByAge = people
	    	      .stream()
	    	      .min(Comparator.comparing(Person::getAge))
	    	      .orElseThrow(NoSuchElementException::new);
	    System.out.println(minByAge);
	    
	    Person maxByAge = people
	    	      .stream()
	    	      .max(Comparator.comparing(Person::getAge))
	    	      .orElseThrow(NoSuchElementException::new);
	    System.out.println(maxByAge);
	    
	    
	    
	    
	    Map<Gender, List<Person>> groupByGender = people.stream()	
													.collect(Collectors.groupingBy(Person::getGender));
		
	    groupByGender.forEach((gender, people1)->{
			System.out.println(gender);
			people1.forEach(System.out::println);
			System.out.println();
		});

		
	}
	
	public static class Person{
		int age; 
		String name;
		Gender gender;
		public Person(int age, String name, Gender gender) {
			super();
			this.age = age;
			this.name = name;
			this.gender = gender;
		}
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
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

		@Override
		public String toString() {
			return "Person [age=" + age + ", name=" + name + ", gender=" + gender + "]";
		}
		
		
	}
	
	public static enum Gender{
		male,female
	}
}

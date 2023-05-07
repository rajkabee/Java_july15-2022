package javaSE.dursikshya.example.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsApiExample {
	public static void main(String[] args) {
		String names = "Ram, Shyam, Hari, Gita, Sita, Rita";
		List<String> nameList = Arrays.asList(names.split(", "));
		nameList.forEach(System.out::println);
		
		List<Person> people = Arrays.asList(
				new Person[]{
					new Person("Ram Sharma", 25, Gender.MALE),
					new Person("Shyam Sharma", 23, Gender.MALE),
					new Person("Hari Sharma", 21, Gender.MALE),
					new Person("Sita Sharma", 45, Gender.FEMALE),
					new Person("Rita Sharma", 15, Gender.FEMALE),
					new Person("Gita Sharma", 5, Gender.FEMALE),
					new Person("Gopal Sharma", 65, Gender.MALE)
				}
				);
		
		Person youngest = people.stream().min(Comparator.comparing(Person::getAge)).get();
		System.out.println(youngest);
		Person oldest = people.stream().max(Comparator.comparing(Person::getAge)).get();
		System.out.println(oldest);
		
		System.out.println("Adults: ");
		people.stream().filter((person)->person.getAge()>20).collect(Collectors.toList()).forEach(System.out::println);
		
		Map<Gender, List<Person>> groupedData= people.stream().collect(Collectors.groupingBy(Person::getGender));
		
		groupedData.forEach((gender, list)->{
			System.out.println(gender);
			list.forEach(System.out::println);
		});
		
		System.out.println(people.stream().count());
		System.out.println("Sita Sharma: "+
				people.stream().anyMatch(person->person.getName().equals("Sita Sharma"))
				);
		System.out.println("All Adults: "+
					people.stream().allMatch(p->p.getAge()>=18)
				);
		System.out.println("All Adults: "+
				people.stream().noneMatch(p->p.getAge()>18)
			);
		
		
	}
}

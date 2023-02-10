package myFirstJavaProject.collectionVariables.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {
	public static void main(String[] args) {
		Person lokeshOne = new Person(1, "Lokesh", "Gupta");
		Person lokeshTwo = new Person(1, "Lokesh", "Gupta");
		Person lokeshThree = new Person(1, "Lokesh", "Gupta");
		Person brianOne = new Person(2, "Brian", "Clooney");
		Person brianTwo = new Person(2, "Brian", "Clooney");
		Person alex = new Person(3, "Alex", "Kolen");
		 
		Collection<Person> list = Arrays.asList(alex, 
		                                        brianOne, 
		                                        brianTwo, 
		                                        lokeshOne, 
		                                        lokeshTwo, 
		                                        lokeshThree);

		// Get distinct people by id
		List<Person> distinctElements = list.stream()
		            .distinct()
		            .collect( Collectors.toList() );

		System.out.println( distinctElements );
		
		
	}
	static class Person{
		int id;
		String fName;
		String lName;
		public Person(int id, String fName, String lName) {
			super();
			this.id = id;
			this.fName = fName;
			this.lName = lName;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getfName() {
			return fName;
		}
		public void setfName(String fName) {
			this.fName = fName;
		}
		public String getlName() {
			return lName;
		}
		public void setlName(String lName) {
			this.lName = lName;
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", fName=" + fName + ", lName=" + lName + "]";
		}
		
	}
}

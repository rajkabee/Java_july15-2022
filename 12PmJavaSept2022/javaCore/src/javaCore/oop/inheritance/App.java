package javaCore.oop.inheritance;

public class App {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "Raju Pradhan";
		person.nationalId = 1231234;
		person.address = "Kathmandu";
		System.out.println(person.display());
		
		Employee emp = new Employee();
		emp.nationalId=23213;
		emp.name="Prabin Pradhan";
		emp.address="lalitpur";
		emp.position="Driver";
		emp.salary=35000f;
		System.out.println(emp.display());;
	}
}

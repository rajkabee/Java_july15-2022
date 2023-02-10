package javaBasics.intro.oop.inheritance;

public class App {
	public static void main(String[] args) {
		Person p = new Person();
		p.nationalId = 12344421l;
		p.name = "Sudip Karki";
		p.address = "Lalitpur";
		System.out.println(p.display());
		
		
		
		Employee emp = new Employee();
		emp.empId = 432;
		emp.position = "Accountant";
		emp.salary = 35000;
		emp.name="Sangita Adhikari";
		emp.address = "Kavre";
		emp.nationalId = 12312412l;
		System.out.println(emp.display());
	}
}

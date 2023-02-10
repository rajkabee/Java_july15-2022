package javaBasics.intro.oop.encapsulation;

public class App {
	public static void main(String[] args) {
		Employee emp = new Employee();
		/*
		emp.empId = 123;
		emp.name = "Rahul";
		emp.position = "manager";
		emp.salary = 40000f;
		System.out.println(emp.empId+". "+emp.name+"\t"+emp.position+"\t"+emp.salary);
		*/
		emp.setEmpId(123);
		emp.setName("Rahul");
		System.out.println(emp.getEmpId()+". "+emp.getName());
		
	}
}

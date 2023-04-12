package javaSE.dursikshya.example.oop;

public class App {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.id=123;
		emp.name="asdasd";
		//emp.address="asdsad";
		emp.setAddress("Pokhara");
		System.out.println(emp.getAddress());
	}
}

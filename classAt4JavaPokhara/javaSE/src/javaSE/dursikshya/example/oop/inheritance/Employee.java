package javaSE.dursikshya.example.oop.inheritance;

public class Employee extends Person {
	private String position;
	private String department;
	private float salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String address) {
		super(id, name, address);
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String address, String position, String department, float salary) {
		super(id, name, address);
		this.position = position;
		this.department = department;
		this.salary = salary;
	}

	public Employee(String position, String department, float salary) {
		super();
		this.position = position;
		this.department = department;
		this.salary = salary;
	}
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [position=" + position + ", department=" + department + ", salary=" + salary + ", toString()="
				+ super.toString() + "]";
	}
	
}

package javaSE.dursikshya.example.oop.abstraction;

public class EmployeeDao extends DataAccessObject<Employee>{

	@Override
	public void save(Employee t) {
		System.out.println("Employee saved to the database!");
	}

	@Override
	public Employee getOne(int id) {
		return new Employee();
	}

}

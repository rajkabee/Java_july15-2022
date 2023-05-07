package j2se.eclipse.oop.inheritance;

public class App {
	public static void main(String[] args) {
		Employee.position="Accountant";
		
		
		Person p = new Person(123, "Subash Khatri", 24);
		p.display();
		Employee emp = new Employee();
		//emp.position="Developer";
		System.out.println(Employee.position);
		emp.empId=123123;
		DerivedClass dc = new DerivedClass();
		int res = dc.add(123, 456);
		System.out.println("res: "+res);
		res = dc.add(123, 456);
		System.out.println("res: "+res);
		final int x;
		x=34;

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static class BaseClass {
		public BaseClass() {
			System.out.println("Base Class Constructor called...");
		}
		public int add(int i, int j) {
			return i+j;
		}
	}
	static class DerivedClass extends BaseClass{

		public DerivedClass() {
			super();
			System.out.println("Derived class constructor called...");
		}
		
		
		@Override
		public int add(int x, int y) {
			return x+y*100;
		}
		
	}

}	


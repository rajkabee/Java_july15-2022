package j2se.eclipse.oop.encapsulation.p1;

public class App {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empId=123;
		//emp.name="Saroj Gautam";
		emp.position="DevOps";
		emp.salary=98000f;
		//System.out.println(emp.empId+". "+emp.name+"\t"+emp.position+"\t"+emp.salary);
		Person p = new Person();
//		p.nId=234;
//		p.name="Pratik Rai";
//		p.address="Kathmandu";
//		p.alias="kaley";
//		emp.name="sadaasd";
//		emp.address="asdsadsa";
		p.setNid(123);
		System.out.println(p.getNid());
	}
}

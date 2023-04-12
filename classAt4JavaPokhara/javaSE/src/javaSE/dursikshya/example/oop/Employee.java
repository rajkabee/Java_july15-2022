package javaSE.dursikshya.example.oop;

public class Employee{
	public int id;
	protected String name;
	private String address;
	
	
	
	public Employee() {
	}

	public Employee(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	


	public Employee(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public void display() {
		System.out.println(id+". "+name+"\t"+address);
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getAddress() {
		return address;
	}
}

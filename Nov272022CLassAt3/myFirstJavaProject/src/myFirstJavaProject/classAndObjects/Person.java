package myFirstJavaProject.classAndObjects;

public class Person extends Object{
	int id;
	public String name;
	protected String address;
	private String email;
	
	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person(int id, String name, String address, String email) 	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + "]";
		
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	
	
	
	
}

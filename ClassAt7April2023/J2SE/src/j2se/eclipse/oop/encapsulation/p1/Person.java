package j2se.eclipse.oop.encapsulation.p1;

public class Person {
//	private int nId;
	protected String fullname;
	String address2;
	private int nId;
	private String name;
	private String address;
	private String alias;
	
	
	
	public Person(String name, String address, String alias) {
		super();
		this.name = name;
		this.address = address;
		this.alias = alias;
	}
	public Person(int nId, String name, String address, String alias) {
		super();
		this.nId = nId;
		this.name = name;
		this.address = address;
		this.alias = alias;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getnId() {
		return nId;
	}
	public void setnId(int nId) {
		this.nId = nId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	
}

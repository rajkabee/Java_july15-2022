package javaBasics.intro.oop.inheritance;

public class Person {
	protected long nationalId;
	protected String name;
	protected String address;
	
	public String display() {
		return nationalId+". "+name+"\t"+address;
	}
}

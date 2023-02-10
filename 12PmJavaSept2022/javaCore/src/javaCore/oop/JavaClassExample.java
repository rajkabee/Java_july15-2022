package javaCore.oop;

public class JavaClassExample {
	public static void main(String[] args) {
		Person p = new Person(3,"Rojina Karki", "KTM");
		//p.id=123;
		//p.name = "Prashant Adhikari";
		//p.address = "lpt";
		System.out.println(p.id+". "+p.name+" "+p.address);
	}
	
	public static class Person{
		
		int id;
		String name;
		String address;
		public Person(int id, String name, String address) {
			this.id = id;
			this.name=name;
			this.address = address;
		}
	}
}

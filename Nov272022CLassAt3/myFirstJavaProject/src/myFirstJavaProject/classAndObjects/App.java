package myFirstJavaProject.classAndObjects;

import extras.User;

public class App {
	public static void main(String[] args) {
		Person p = new Person();
		p.id=123;
		p.name="Alisha Baniya";
		p.address="lalitpur";
		p.setEmail("alishaBaniya@gmail.com");
		System.out.println(p.toString());
		Person p2 = new Person(234,"Banana Kc", "Kathmandu", "basana@gmail.com");
		Person p3 = new Person(345,"Bandana Adhikari", "Bhaktapur", "bandana2gmail.com");
		System.out.println(p2);
		System.out.println(p3);
		User user = new User();
		//user.show();
		
	}
}

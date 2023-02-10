package javaBasics.intro.oop.abstraction;

public class App {
	public static void main(String[] args) {
		//AbstractService service = new AbstractService();
		AbstractService service = new UserService();
		User user = (User)service.getInstance(new Object());
		System.out.println(user);
		
	}
}

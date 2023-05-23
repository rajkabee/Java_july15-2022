package c0m.dursikshya.j2se.oop.abstraction;

public class FinalKeyword {
	public static void main(String[] args) {
		final int x=234;
		//x=321;
		DerivedClass obj = new DerivedClass();
		obj.hello();
		
	}
}

//final 
class BaseClass{
	final public void hello() {
		System.out.println("Greetings");
	}
}

class DerivedClass extends BaseClass{
	
	public void hello2() {
		System.out.println("Hello from derived Class!");
	}
}

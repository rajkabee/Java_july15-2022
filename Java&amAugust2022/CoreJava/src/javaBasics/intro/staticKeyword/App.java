package javaBasics.intro.staticKeyword;

public class App {
	public static void main(String[] args) {
		MyClass object1 = new MyClass();
		MyClass object2 = new MyClass();
		object1.i=1;
		object1.j=1;
		object1.greet();
		object1.farewell();
		object2.i=2;
		object2.j=2;
		
		MyClass.greet();
		//MyClass.j=3;
		System.out.println("object1.i = "+object1.i);
		System.out.println("object1.j = "+object1.j);
		System.out.println("object2.i = "+object2.i);
		System.out.println("object2.j = "+object2.j);
	}
}

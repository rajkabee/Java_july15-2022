package c0m.dursikshya.j2se.oop.abstraction;

public class StaticKeyword {
	public static void main(String[] args) {
		MyClass.msg="Welcome";
		MyClass.hello();
		
		
		
//		MyClass obj = new MyClass();
//		obj.msg="welcome";
//		obj.hello();
//		
//		MyClass obj2 = new MyClass();
//		obj2.msg="Have a good Day";
//		obj2.hello();
//		
//		obj.hello();
	}

}
class MyClass{
	static String msg;
	static public void hello() {
		System.out.println("Greetings, "+msg);
	}
}
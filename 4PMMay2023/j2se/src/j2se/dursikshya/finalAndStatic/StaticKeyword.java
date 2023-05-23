package j2se.dursikshya.finalAndStatic;

public class StaticKeyword {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.name="Sarojana";
		obj.hello();
		
		MyClass obj2 = new MyClass();
		obj2.name="Hritika";
		obj2.hello();
		obj.hello();
		
		//MyClass.name="Jiyana";
		//MyClass.hello();
		obj2.hello();
		obj.hello();
	}
}

class MyClass{
	String name;
	public void hello() {
		System.out.println("Greetings, "+name);
	}
	
}
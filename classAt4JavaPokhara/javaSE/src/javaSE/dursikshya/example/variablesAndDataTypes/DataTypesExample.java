package javaSE.dursikshya.example.variablesAndDataTypes;

public class DataTypesExample {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		byte b = 127;
		System.out.println("byte b: "+b);
		System.out.println(String.format("byte b: %d", b));
		
		short s = -32768;
		int i = 2147483647;
		long l = 9223372036854775807l;
		
		float f = 123.456f;
		double d = 123.456;
		
		char ch = 'w';
		boolean bool = false;
		
		String name = "Arjun";
		System.out.println(name);
		
		
	}
}

//Single line comment

/*
		multi line comment
		Primitive Data Types
		1. Integer
			a. byte			8bits		11111111		+127 to -128
			b. short		16bits		-32768 to +32767
			c. int			32bits		2147483648
			d. long			64bits		9.22bb
		
		2. Float
			a. float		32bits
			b. double		64bits
		
		3. Character
			char
		
		4. Boolean
			boolean		true/false
		
		Non primitive
		
		String	
		
 */


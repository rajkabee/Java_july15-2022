package com.dursikshya.coreJava.dataTypes;

public class DataTypes {
	public static void main(String[] args) {
		System.out.println("Hello World");
		byte b=-128;
		System.out.println("b: "+b);
		short s = 32767;
		System.out.println(String.format("s: %d", s));
		int i=2147483647;
		System.out.println("i: "+i);
		long l = 9223372036854775807l;
		System.out.println("l: "+l);
		float f=1.234f;
		double d=1.2345;
		System.out.println("f: "+f);
		System.out.println("d: "+d);
		char ch='0';
		boolean bool=true;
		System.out.println("ch: "+ch);
		System.out.println("bool: "+bool);
		
		String name;				//declaration
		name="Ramesh Shrestha";		//initialization/definition/assignment
		System.out.println("Name: "+name);
		
		
	}
}

//single line comment

/*

multi line comment

*/
/*

	Data types
	primitive data types:
		Integer
			byte		8bits	00000000-11111111	-128 to +127
			short		2bytes/16bits		-32768 to +32767
			int			4byted/32bits		2.14b
			long		8bytes/64bits		9.22bb
		Float(floating point numbers)
			float		32bits
			double		64bits
		Character
			char		A-Z,	a-z,	0-9
		Boolean
			boolean 	true/false
			
			
	class type:
		String
 */


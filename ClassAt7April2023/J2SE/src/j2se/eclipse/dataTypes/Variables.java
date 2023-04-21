package j2se.eclipse.dataTypes;

public class Variables {
	public static void main(String[] args) {
		byte b;
		b = 127%125;
		System.out.println("b= "+b);
		short s = 32767;
		System.out.println(String.format("short s: %d", s));
		int i = 2147483647;
		System.out.println("int i: "+i);
		long l = 9223372036854775807l;
		System.out.println("long l: "+l);
		
		float f = 1.234f;
		System.out.println("float f: "+f);
		double d = 1.234;
		System.out.println("double d: "+d);
		
		char ch = 'a';
		System.out.println("char ch: "+ch);
		
		boolean bool=false;
		System.out.println("Boolean bool: "+bool);
	}
}

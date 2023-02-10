package javaBasics.intro.wrapperClass;

public class WrapperClassExample {
	public static void main(String[] args) {
		Integer x=Integer.valueOf(12);
		
		increment(x);
		System.out.println(x);
	}

	private static void increment(Integer x) {
		x+=100;
	}
}

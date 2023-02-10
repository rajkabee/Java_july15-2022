package javaCore.oop.polymorphism;

public class MethodOverloading {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int res = calc.add(1, 2);
		System.out.println(res);
		res = calc.add(1,2,3);
		System.out.println(res);
		
		
	}
}

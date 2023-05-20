package com.examples.j2se.oop.polymorphism;

public class MethodOverloading {
	public static void main(String[] args) {
		int radius=5, l=3, b=7;
		float a = area(radius);
		System.out.println("Area of circle: "+a);
		a = area(l,b);
		System.out.println("Area of ractangle: "+a);
		
	}

	static float area(int r){
		float a= 3.1415f*r*r;
		return a;
	}
	
	static float area(int l, int b) {
		float a;
		a=l*b;
		return a;
	}
}

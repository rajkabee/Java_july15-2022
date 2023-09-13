package com.sachistha.javaSE.inheritance.staticKeyword;

public class Statics {
	public static void main(String[] args) {
		OuterClass obj = new OuterClass();
		obj.x=123;
		obj.y=456;
		System.out.println("obj y: "+obj.y);
		OuterClass obj2 = new OuterClass();
		obj2.x=543456;
		obj2.y=123456;
		System.out.println("obj2 y: "+obj2.y);
		System.out.println("obj y: "+obj.y);
		obj.y=456;
		System.out.println("obj2 y: "+obj2.y);
		
		OuterClass.NestedClass nested = new OuterClass.NestedClass();
		nested.n=543;
		
		OuterClass.InnerClass inner = obj.new InnerClass();
		inner.z=2345;
		System.out.println(inner.getX());
		
		
	}
	
}

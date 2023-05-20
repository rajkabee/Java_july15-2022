package com.examples.j2se.collections;

public class StringType {
	public static void main(String[] args) {
		String name1=new String("Sudeep");
		String name2=name1;
		name1="Sangita";
		System.out.println(name1);
		System.out.println(name2);
		StringBuffer st1 = new StringBuffer("Sangita");
		st1.append(" Shrestha");
		System.out.println(st1);
	}
	
}

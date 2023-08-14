package com.rajkabee.j2se.arrays;

public class Strings {
	public static void main(String[] args) {
		String name = "    Ganesh,    Thakur     ";
		System.out.println(name.charAt(0));
		String[] names = name.split(",");
		System.out.println(names[1]);
		System.out.println(name.trim());
	}
}

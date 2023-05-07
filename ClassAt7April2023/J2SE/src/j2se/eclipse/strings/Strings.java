package j2se.eclipse.strings;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		String name = "Kabiraj";
		name="Bhisma";
		System.out.println("Enter a char: ");
		Scanner sc = new Scanner(System.in);
		//char ch = sc.next().charAt(0);
		//System.out.println(ch);
		int res = name.compareTo("Kabirajs");
		System.out.println(res);
		
		System.out.println(name.equals("kabiraj"));
		System.out.println(name.equalsIgnoreCase("kabiraj"));
		System.out.println(name.length());
		System.out.println(name.concat(" Shrestha"));
		System.out.println(name + " Shrestha");
		System.out.println(name.indexOf("r"));
		name = name.replace("raj", " shrestha");
		System.out.println(name);
		System.out.println(name.indexOf('a'));
		System.out.println(name.lastIndexOf('a'));
		name="                hello            ";
		System.out.println("*"+name+"*");
		System.out.println("*"+name.trim()+"*");
		
		String name1 = "Kabiraj";
		String name2 = name1;
		name1="Snagita";
		System.out.println(name1+name2);
		
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = sb1;
		sb1.replace(0, 5, "Prajwol");
		System.out.println(sb2);
	}	
}

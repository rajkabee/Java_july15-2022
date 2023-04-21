package j2se.eclipse.conditionals;

import java.util.Scanner;

public class TerneryOperator {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		age=sc.nextInt();
		String msg;
		//syntax: res =  con?if_true:if_false;
		
		//msg = age<18?"minor":"adult";
		msg = age<18?"minor":age<60?"adult":"Senior";
		
//		if(age<18) {
//			msg="Minor";
//		}
//		else {
//			msg="adult";
//		}
		System.out.println(msg);
		
		sc.close();
	}
}

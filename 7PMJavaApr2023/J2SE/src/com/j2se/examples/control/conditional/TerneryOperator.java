package com.j2se.examples.control.conditional;

public class TerneryOperator {
	//syntax
	//res=con?if_true:if_false;
	
	public static void main(String[] args) {
		int age=66;
//		String msg = age<18?"Minor":"Adult";
		String msg = age<18?"Minor":age<60?"Adult":"Senior";
		
//		if(age<18) {
//			msg = "minor";
//		}
//		else {
//			msg="adult";
//		}
		
		System.out.println(msg);
	}
		
}

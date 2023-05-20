package com.examples.j2se.oop.abstraction;

public class App {
	public static void main(String[] args) {
		DAO dao = new UserDAO();
		dao.connect();
		dao.save();
		dao.disconnect();
		int sum = add(5,7);
		sum = add(5,7,9);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static int add(int a, int b){
		int c;
		c=a+b;
		return c;
	}
	static int add(int a, int b, int c){
		int d;
		d=a+b+c;
		return d;
	}
}


package com.examples.j2se.exceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
		int res=230;
		try {
			res=10/0;
		}catch(ArithmeticException e) {
			res=10/1;
		}finally {
			System.out.println(res);			
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}

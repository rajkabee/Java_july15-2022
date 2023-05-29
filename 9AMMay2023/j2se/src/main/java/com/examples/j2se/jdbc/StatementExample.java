package com.examples.j2se.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/dursikshya",
						"root",
						"root");
		System.out.println("Connected...");
		String name="Albert Einstein";
		long contact = 98655666577l;
		boolean active = false;
		
		String query = "insert into student(name, contact, active) values('"+name+"',"+contact+","+active+")";
		Statement stm = con.createStatement();
		int i = stm.executeUpdate(query);
		if(i==1) {
			System.out.println("Success...");
		}
		else {
			System.out.println("Failed...");
		}
		con.close();
	}
}

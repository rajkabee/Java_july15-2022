package com.example.j2se.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "root");
		int id=123;
		String name="Dipak";
		String email = "dipak@gmail.com";
		PreparedStatement pstm = con.prepareStatement("insert into student(name, email) values(?,?)");
		//pstm.setInt(1, id);
		pstm.setString(1, name);
		pstm.setString(2, email);
		int i = 0;
		pstm.executeUpdate();
		if(i==0) {
			System.out.println("insert failed!");
		}
		else {
			System.out.println("data inserted to the database!");
		}
		
		
	}
}

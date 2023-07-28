package com.example.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String pass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pass);
		String query = "insert into user (name, email, password, active) "
				+ "values('Sameer', 'sameer@gmail.com','password@123', true)";
		Statement stm = con.createStatement();
		int i = stm.executeUpdate(query);
		stm.close();
		con.close();
		if(i==1) {
			System.out.println("Data inserted");
		}else {
			System.out.println("Data not inserted");
		}
		
	}
}

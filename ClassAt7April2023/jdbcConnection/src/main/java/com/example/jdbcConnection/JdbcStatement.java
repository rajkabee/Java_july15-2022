package com.example.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStatement {
	public static void main(String[] args) {
		//String query = "INSERT INTO student VALUES(13, 'Saugat Malla', 'saugat@gmail.com', true)";
		String query = "INSERT INTO student (name, email, active) VALUES('Sabita Malla', 'sabita@gmail.com', true)";
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/jamuntech";
		String username = "root";
		String password = "root";
		int i=0;
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(dbUrl, username, password);
			Statement stm = con.createStatement();
			i = stm.executeUpdate(query);
			stm.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		if(i==0) {
			System.out.println("Insertsion failed...");
		}
		else {
			System.out.println("Successfully Inserted...");
		}
	}
}

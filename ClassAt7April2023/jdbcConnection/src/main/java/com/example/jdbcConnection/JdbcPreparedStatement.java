package com.example.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcPreparedStatement {
	public static void main(String[] args) {
		String name = "Prajwol Subedi";
		String email = "prajwol@gmail.com";
		boolean active = true;
		String query = "INSERT INTO student (name, email, active) VALUES(?,?,?)";
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/jamuntech";
		String username = "root";
		String password = "root";
		int i=0;
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(dbUrl, username, password);
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setString(1, name);
			pstm.setString(2, email);
			pstm.setBoolean(3, active);
			i = pstm.executeUpdate();
			pstm.close();
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

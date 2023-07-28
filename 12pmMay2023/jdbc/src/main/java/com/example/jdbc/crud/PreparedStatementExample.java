package com.example.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementExample {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String pass = "root";
		Connection con = DriverManager.getConnection(url, user, pass);
		String query = "insert into user (name, email, password, active) "
				+ "values(?,?,?,?)";
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1, "Saugat");
		pstm.setString(2, "Saugat@gmail.com");
		pstm.setString(3, "MyPassword");
		pstm.setBoolean(4, true);
		int i = pstm.executeUpdate();
		pstm.close();
		con.close();
		if(i==1) {
			System.out.println("Data inserted");
		}else {
			System.out.println("Data not inserted");
		}
	}
}

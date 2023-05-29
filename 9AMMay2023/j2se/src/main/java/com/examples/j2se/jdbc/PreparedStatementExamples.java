package com.examples.j2se.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExamples {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//String driver ="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/dursikshya";
		String username = "root";
		String password = "root";
		Student st = new Student("Sudip Bista", 9877675533l, false);
		String query = "insert into student (name, contact, active) values(?,?,?)";
		//Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pstm = con.prepareStatement(query); 
		pstm.setString(1, st.getName());
		pstm.setLong(2, st.getContact());
		pstm.setBoolean(3, st.isActive());
		int i = pstm.executeUpdate();
		if(i==1) {
			System.out.println("Success...");
		}
		else {
			System.out.println("Failed...");
		}
		pstm.close();
		con.close();
	}
}

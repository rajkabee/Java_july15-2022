package com.rajkabee.j2se.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/newdb";
		String user = "root";
		String pass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user, pass);
		int id=4;
		String query  = "delete from courses where id=?";
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		int i = pstm.executeUpdate();
		if(i==0) {
			System.out.println("Task Failed!");
		}
		else {
			System.out.println("Task Succeed!");
		}
		System.out.println("Hello");
	}
}

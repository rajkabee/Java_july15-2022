package com.rajkabee.mavenHelloWorld.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteFromTable {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingapp", "root", "root");
			System.out.println("Connected to the database!");
			
			int id = 3;
			String query = "delete from product where id=?";
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1, id);
			int i = pstm.executeUpdate();
			if(i==0) {
				System.out.println("Delete failed!");
			}
			else {
				System.out.println("Data deleted from the database!");
			}
			pstm.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
	}
}

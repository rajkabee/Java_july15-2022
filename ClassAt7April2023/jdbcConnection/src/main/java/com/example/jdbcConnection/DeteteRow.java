package com.example.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeteteRow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id of the Student: ");
		int id = sc.nextInt();
		String query = "DELETE FROM student WHERE id=?";
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/jamuntech";
		String username = "root";
		String password = "root";
		int i=0;
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(dbUrl, username, password);
			PreparedStatement pstm = con.prepareStatement(query);
			pstm.setInt(1, id);
			i = pstm.executeUpdate();
			pstm.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		if(i==0) {
			System.out.println("Deletion failed...");
		}
		else {
			System.out.println("Successfully Deleted...");
		}
	}
}

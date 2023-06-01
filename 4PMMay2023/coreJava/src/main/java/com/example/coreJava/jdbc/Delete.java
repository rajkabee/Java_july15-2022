package com.example.coreJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id of the product: ");
		int id = sc.nextInt();
		String url = "jdbc:mysql://localhost:3306/dursikshya";
		String user = "root";
		String pass = "root";
		String query = "delete from product where id=?";
		Connection con = DriverManager.getConnection(url, user, pass);
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		int  i = pstm.executeUpdate();
		if(i==0) {
			System.out.println("Delete Failed!");
		}
		else {
			System.out.println("Product deleted from the database!");
		}
		pstm.close();
		con.close();
	}
}

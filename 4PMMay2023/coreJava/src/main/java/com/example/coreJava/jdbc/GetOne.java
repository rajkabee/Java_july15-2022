package com.example.coreJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GetOne {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id of the product: ");
		int id = sc.nextInt();
		Product pd = new Product();
		String url = "jdbc:mysql://localhost:3306/dursikshya";
		String user = "root";
		String pass = "root";
		String query = "select * from product where id = ?";
		Connection con = DriverManager.getConnection(url, user, pass);
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		ResultSet rs = pstm.executeQuery();
		if(rs.next()) {
			pd.setId(rs.getInt("id"));
			pd.setName(rs.getString("name"));
			pd.setPrice(rs.getFloat("price"));
			pd.setActive(rs.getBoolean("active"));
			System.out.println(pd);
		}
		else {
			System.out.println("Product not found in the database!");
		}
		pstm.close();
		con.close();
	}
}

package com.example.coreJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementExample {
	public static void main(String[] args) throws SQLException {
		Product pd = new Product("Shoes", 5500f, true);
		String url = "jdbc:mysql://localhost:3306/dursikshya";
		String user = "root";
		String pass = "root";
		String query = "insert into product (name, price, active) values(?,?,?)";
		Connection con = DriverManager.getConnection(url, user, pass);
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1, pd.getName());
		pstm.setFloat(2, pd.getPrice());
		pstm.setBoolean(3, pd.isActive());
		int  i = pstm.executeUpdate();
		if(i==0) {
			System.out.println("Insert Failed!");
		}
		else {
			System.out.println("Product inserted to the database!");
		}
		pstm.close();
		con.close();
	}
}

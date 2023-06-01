package com.example.coreJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	public static void main(String[] args) throws SQLException {
		Product pd = new Product(2,"Jacket", 6500f, false);
		String url = "jdbc:mysql://localhost:3306/dursikshya";
		String user = "root";
		String pass = "root";
		String query = "update product set name=?, price=?, active=? where id=?";
		Connection con = DriverManager.getConnection(url, user, pass);
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1, pd.getName());
		pstm.setFloat(2, pd.getPrice());
		pstm.setBoolean(3, pd.isActive());
		pstm.setInt(4, pd.getId());
		int  i = pstm.executeUpdate();
		if(i==0) {
			System.out.println("Update Failed!");
		}
		else {
			System.out.println("Product updated to the database!");
		}
		pstm.close();
		con.close();
	}
}

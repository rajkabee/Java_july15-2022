package com.example.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String pass = "root";
		Connection con = DriverManager.getConnection(url, user, pass);
		String query = "delete from user where id=?";
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setInt(1, 7);
		int i = pstm.executeUpdate();
		pstm.close();
		con.close();
		if(i==1) {
			System.out.println("Data Deleted");
		}else {
			System.out.println("Data not deleted");
		}
	}
}

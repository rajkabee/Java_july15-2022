package com.example.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String pass = "root";
		Connection con = DriverManager.getConnection(url, user, pass);
		String query = "update user set name=?, email=?, password=?, active=? where id=?";
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1, "Anikit");
		pstm.setString(2, "anikit@gmail.com");
		pstm.setString(3, "P@ssW0rd");
		pstm.setBoolean(4, false);
		pstm.setInt(5, 5);
		int i = pstm.executeUpdate();
		pstm.close();
		con.close();
		if(i==1) {
			System.out.println("Data updated");
		}else {
			System.out.println("Data not updated");
		}
	}
}

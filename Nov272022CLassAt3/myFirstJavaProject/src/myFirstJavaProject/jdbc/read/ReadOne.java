package myFirstJavaProject.jdbc.read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import myFirstJavaProject.jdbc.connection.User;

public class ReadOne {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/j2se";
		String username="root";
		String password="root";
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connected to the database!");
		String query = "select * from user where id=?";
		PreparedStatement pstm = con.prepareStatement(query);
		int id = 1;
		pstm.setInt(1, id);
		ResultSet rs =  pstm.executeQuery();
		User user = null;
		if(rs.next()) {
			user = new User(
						rs.getInt("id"),
						rs.getString("username"), 
						rs.getString("password"),
						rs.getString("roles"),
						rs.getBoolean("active")
					);
		}
		System.out.println(user);
		pstm.close();
		con.close();
	}
}

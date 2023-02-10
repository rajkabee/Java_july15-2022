package myFirstJavaProject.jdbc.read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import myFirstJavaProject.jdbc.connection.User;

public class ReadAll {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/j2se";
		String username="root";
		String password="root";
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connected to the database!");
		String query = "select * from user";
		PreparedStatement pstm = con.prepareStatement(query);
		ResultSet rs =  pstm.executeQuery();
		ArrayList<User> users = new ArrayList<>();
		User user = null;
		while(rs.next()) {
			user = new User(
						rs.getInt("id"),
						rs.getString("username"), 
						rs.getString("password"),
						rs.getString("roles"),
						rs.getBoolean("active")
					);
			users.add(user);
		}
		users.forEach(System.out::println);
		pstm.close();
		con.close();
	}
}

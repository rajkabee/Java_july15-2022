package myFirstJavaProject.jdbc.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import myFirstJavaProject.jdbc.connection.User;

public class Update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/j2se";
		String username="root";
		String password="root";
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connected to the database!");
		User user = new User(1, "sabin", "password@123", "admin", true);
		String query = "update user set username=?, password=?, roles=?, active=? where id=?";
		PreparedStatement pstm =con.prepareStatement(query);
		pstm.setString(1,user.getUsername() );
		pstm.setString(2,user.getPassword() );
		pstm.setString(3,user.getRoles() );
		pstm.setBoolean(4,user.isActive() );
		pstm.setInt(5, user.getId());
		int i = pstm.executeUpdate();
		if(i==1) {
			System.out.println("User Updated!");
		}
		else {
			System.out.println("Update Failed!");
		}
		pstm.close();
		con.close();
	}
}

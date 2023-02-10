package myFirstJavaProject.jdbc.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import myFirstJavaProject.jdbc.connection.User;

public class Delete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/j2se";
		String username="root";
		String password="root";
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connected to the database!");
		String query = "delete from user where id=?";
		PreparedStatement pstm = con.prepareStatement(query);
		int id = 1;
		pstm.setInt(1, id);
		int i =  pstm.executeUpdate();
		if(i==1) {
			System.out.println("User Deleted!");
		}
		else {
			System.out.println("Delete Failed!");
		}
		pstm.close();
		con.close();
	}
}

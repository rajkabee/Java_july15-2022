package javaSE.dursikshya.example.exceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
	public static void main(String[] args)  {
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learn", "root", "root");
		} catch (SQLException e) {
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
			} catch (SQLException e1) {
				System.err.println(e1);
			}
		}
		finally {
			System.out.println(":Hello");
		}
	}
}

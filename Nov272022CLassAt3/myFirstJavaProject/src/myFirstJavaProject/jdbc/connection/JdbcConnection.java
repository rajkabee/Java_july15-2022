package myFirstJavaProject.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url="jdbc:mysql://localhost:3306/j2se";
		String username="root";
		String password="root";
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connected to the database!");
		con.close();
	}
}

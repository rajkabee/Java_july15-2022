package coreJava.basics.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String query = "insert into products (name, manufacturer, price) values"
				+ "('Hand Bag', 'Zara', 3500)";
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/nccs";
		String username = "root";
		String password = "root";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();
		stmt.executeUpdate(query);
		con.close();
		
	}
}

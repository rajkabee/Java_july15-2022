package javaBasics.intro.jdbc.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/learningjava";
		String username = "rajkabee";
		String password = "password@123";
		String query = "insert into product"
				+ " (name, manufacturer, description, price, quantity, inStock)"
				+ "values"
				+ " ('Shirt', 'nepal handicraft', 'Hemp Fiber', 3500,200, true ) ";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stm =  con.createStatement();
		int i = stm.executeUpdate(query);
		if(i==1) {
			System.out.println("Product inserted to the database!");
		}
		else {
			System.out.println("insertion failed!");
		}
		stm.close();
		con.close();
		
		
	}
}

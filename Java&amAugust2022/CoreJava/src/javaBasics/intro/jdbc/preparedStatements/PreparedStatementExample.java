package javaBasics.intro.jdbc.preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Product p = new Product("Socks", "nepal textiles", "trekking socks", 250f, 1000, true);
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/learningjava";
		String username = "rajkabee";
		String password = "password@123";
		String query = "insert into product"
				+ " (name, manufacturer, description, price, quantity, inStock)"
				+ "values"
				+ " (?,?,?,?,?,?)";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pstm =  con.prepareStatement(query);
		pstm.setString(1, p.getName());
		pstm.setString(2, p.getManufacturer());
		pstm.setString(3, p.getDescription());
		pstm.setFloat(4, p.getPrice());
		pstm.setInt(5, p.getQuantity());
		pstm.setBoolean(6, p.isInStock());
		int i = pstm.executeUpdate();
		if(i==1) {
			System.out.println("Product inserted to the database!");
		}
		else {
			System.out.println("insertion failed!");
		}
		pstm.close();
		con.close();
		
		
	}
	
}

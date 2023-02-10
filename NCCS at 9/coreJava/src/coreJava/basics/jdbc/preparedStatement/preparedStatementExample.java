package coreJava.basics.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class preparedStatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String query = "insert into products (name, manufacturer, price) values ( ?, ?, ?)";
		String productName = "Shirt";
		String productManufacturer = "Nepal Textile";
		float productPrice = 1300;
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/nccs";
		String username = "root";
		String password = "root";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1, productName);
		pstmt.setString(2, productManufacturer);
		pstmt.setFloat(3, productPrice);
		pstmt.executeUpdate();
		con.close();
	}
}

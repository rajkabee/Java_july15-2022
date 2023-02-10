package javaBasics.intro.jdbc.preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ReadFromOneDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/learningjava";
		String username = "rajkabee";
		String password = "password@123";
		Class.forName(driver);
		String query = "Select * from product where id=?";
		Connection con = DriverManager.getConnection(url,username, password);
		PreparedStatement pstm = con.prepareStatement(query);
		System.out.println("Enter the product id: ");
		pstm.setInt(1, new Scanner(System.in).nextInt());
		ResultSet rs = pstm.executeQuery();
		Product p = new Product();
		if(rs.next()) {
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setManufacturer(rs.getString("manufacturer"));
			p.setDescription(rs.getString("description"));
			p.setPrice(rs.getFloat("price"));
			p.setQuantity(rs.getInt("quantity"));
			p.setInStock(rs.getBoolean("inStock"));
		}
		System.out.println(p);
		pstm.close();
		con.close();
		
	}
}

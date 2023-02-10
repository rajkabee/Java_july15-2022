package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromDatabase {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/learningJava";
		String username = "root";
		String password = "root";
		String query="select * from product";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pstm = con.prepareStatement(query);
		ResultSet rs = pstm.executeQuery();
		ArrayList<Product> products = new ArrayList<>();
		Product p;
		while(rs.next()) {
			p=new Product(
					rs.getInt("id"),
					rs.getString("name"),
					rs.getString("manufacturer"),
					rs.getString("description"),
					rs.getFloat("price"),
					rs.getBoolean("inStock")
					);	
			products.add(p);
		}
		products.forEach(product->{
			System.out.println(product);
		});
		
	}
}

package javaBasics.intro.jdbc.preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReadAll {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/learningjava";
		String username = "rajkabee";
		String password = "password@123";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		String sql = "Select * from product";
		PreparedStatement pstm = con.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		ArrayList<Product> products = new ArrayList<>();
		while(rs.next()) {
			Product p = new Product();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setManufacturer(rs.getString("manufacturer"));
			p.setDescription(rs.getString("description"));
			p.setPrice(rs.getFloat("price"));
			p.setQuantity(rs.getInt("quantity"));
			p.setInStock(rs.getBoolean("inStock"));
			products.add(p);
		}
		for(Product product : products) {
			System.out.println(product);
		}
		pstm.close();
		con.close();
	}
}

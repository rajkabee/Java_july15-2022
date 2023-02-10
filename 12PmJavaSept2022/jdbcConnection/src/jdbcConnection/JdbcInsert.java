package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {
	public static void main(String[] args) throws ClassNotFoundException,  SQLException{
		String url = "jdbc:mysql://localhost:3306/mydb";
		String username = "root";
		String password = "root";
		String query;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		/*
		query="insert into product values (20, 'Herbal Tea', 'nepal herbal products', 'Herbal tea', 4321.12, true)";
		Statement stm = con.createStatement();
		stm.executeUpdate(query);
		*/
		/*
		query = "insert into product  (name, manufacturer, description, price, inStock) value (?,?,?,?,?)";
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1, "Trekking Boot");
		pstm.setString(2, "Timberland");
		pstm.setString(3, "Trekking Waterproof Shoes");
		pstm.setFloat(4, 145667.23f);
		pstm.setBoolean(5, false);
		int i = pstm.executeUpdate();
		if(i==1) {
			System.out.println("Product saved to the database...");
		}
		*/
		
		
		query = "select * from product where id=?";
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setInt(1, 7);
		ResultSet rs= pstm.executeQuery();

		System.out.println("hello");
		if(rs.next()) {
			System.out.println(rs.getString("name"));
		}
		
		pstm.close();
		con.close();
		
	}
}
